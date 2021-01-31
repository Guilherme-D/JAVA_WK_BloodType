package com.teste.wk.repository;

import com.teste.wk.Models.Users;
import com.teste.wk.Models.responses.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {

    @Query(
            value = "select new com.teste.wk.Models.responses.OrderByStateResponse(count(u.id), s.estado) " +
                    "from Users u " +
                    "inner join Address a " +
                        "on u.endereco = a " +
                    "inner join States s " +
                        "on a.estado = s " +
                    "group by s.estado"
    )
    List<OrderByStateResponse> findAllGroupByEstado();


    @Query(value = "select faixas, imc_avg from ( " +
            "select case  " +
            "when group_Idade.idade between 0 and 10 then 'De 0 a 10'  " +
                "when group_Idade.idade between 11 and 20 then 'De 11 a 20'  " +
                "when group_Idade.idade between 21 and 30 then 'De 21 a 30'  " +
                "when group_Idade.idade between 31 and 40 then 'De 31 a 40'  " +
                "when group_Idade.idade between 41 and 50 then 'De 41 a 50' " +
                "when group_Idade.idade between 51 and 60 then 'De 51 a 60' " +
                "when group_Idade.idade between 61 and 70 then 'De 61 a 70' " +
                "when group_Idade.idade between 71 and 80 then 'De 71 a 80' " +
                "when group_Idade.idade between 81 and 90 then 'De 81 a 90' " +
                "when group_Idade.idade between 91 and 100 then 'De 91 a 100' " +
                "when group_Idade.idade > 101 then 'mais de 100' " +
            "end as faixas, avg(group_Idade.imc_avg) as imc_avg " +
            "from ( " +
                "SELECT YEAR(now()) - YEAR(data_nascimento) - ( DAYOFYEAR(now()) < DAYOFYEAR(data_nascimento)) as idade, " +
                "(peso/altura*altura) as imc_avg " +
                "from users u " +
            ") as group_Idade " +
            "group by faixas  " +
            ")as total_faixas", nativeQuery = true)
    List<Object[]> findAllByFaixa();


    @Query(value = "SELECT sexo,  " +
            "CAST(ROUND((MObesas * 100.0) / (totalM), 2) AS DECIMAL(5,2)) as MPercent, " +
            "CAST(ROUND((HObesos * 100.0) / (totalH), 2) AS DECIMAL(5,2)) as HPercent " +
            "FROM ( " +
            "    SELECT " +
            "    sexo, " +
            "    SUM(CASE WHEN sexo = 'f' THEN 1 ELSE 0 END) as totalM, " +
            "    SUM(CASE WHEN sexo = 'm' THEN 1 ELSE 0 END) as totalH, " +
            "    SUM(CASE WHEN sexo = 'f' and (peso/altura*altura) > 30 THEN 1 ELSE 0 END) as MObesas, " +
            "    SUM(CASE WHEN sexo = 'm' and (peso/altura*altura) > 30  THEN 1 ELSE 0 END) as HObesos " +
            "    FROM users " +
            "    GROUP BY sexo " +
            ") as counters " +
            "ORDER BY sexo DESC;", nativeQuery = true)
    List<Object[]> findAllObeseBySex();


    @Query(value = "select tipo, " +
            "round(avg(YEAR(now()) - YEAR(data_nascimento) - ( DAYOFYEAR(now()) < DAYOFYEAR(data_nascimento)))) as idade " +
            "from users " +
            "left join blood_type " +
            "on users.tipo_sanguineo_id = blood_type.id " +
            "group by tipo", nativeQuery = true)
    List<Object[]> avgAgeByBlood();

    @Query(value = "select new com.teste.wk.Models.responses.Receivers(u.tipoSanguineo.tipo, count(u)) " +
            "from Users u " +
            "where u.peso > 50 and " +
            "(YEAR(now()) - YEAR(u.dataNascimento) - ( case when DAYOFYEAR(now()) < DAYOFYEAR(data_nascimento) then 1 else 0 end)) >= 16 and " +
            "(YEAR(now()) - YEAR(u.dataNascimento) - ( case when DAYOFYEAR(now()) < DAYOFYEAR(data_nascimento) then 1 else 0 end)) <= 69 and " +
            "(u.tipoSanguineo.recebeDe like '%A+%' " +
            "or u.tipoSanguineo.recebeDe like '%A-%' " +
            "or u.tipoSanguineo.recebeDe like '%B+%' " +
            "or u.tipoSanguineo.recebeDe like '%B-%' " +
            "or u.tipoSanguineo.recebeDe like '%AB+%' " +
            "or u.tipoSanguineo.recebeDe like '%AB-%' " +
            "or u.tipoSanguineo.recebeDe like '%O+%' " +
            "or u.tipoSanguineo.recebeDe like '%O-%') " +
            "group by u.tipoSanguineo.tipo")
   /* @Query(value = "select count(*), tipo\n" +
            "from users\n" +
            "inner join blood_type\n" +
            "on users.tipo_sanguineo_id = blood_type.id\n" +
            "where users.peso > 50 and\n" +
            "\t(blood_type.recebe_de like '%A+%'\n" +
            "\tor blood_type.recebe_de like '%A-%'\n" +
            "\tor blood_type.recebe_de like '%B+%'\n" +
            "\tor blood_type.recebe_de like '%B-%'\n" +
            "\tor blood_type.recebe_de like '%AB+%'\n" +
            "\tor blood_type.recebe_de like '%AB-%'\n" +
            "\tor blood_type.recebe_de like '%O+%'\n" +
            "\tor blood_type.recebe_de like '%O-%')\n" +
            "group by tipo", nativeQuery = true)*/
    List<Receivers> receiversList();

}
