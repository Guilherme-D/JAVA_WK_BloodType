package com.teste.wk.repository;

import com.teste.wk.Models.Users;
import com.teste.wk.Models.requests.OrderByStateRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {

    @Query(
            value = "select new com.teste.wk.Models.requests.OrderByStateRequest(count(u.id), s.estado) " +
                    "from Users u " +
                    "inner join Address a " +
                    "on u.endereco = a " +
                    "inner join States s " +
                    "on a.estado = s " +
                    "group by s.estado"
    )
    List<OrderByStateRequest> findAllGroupByEstado();
}
