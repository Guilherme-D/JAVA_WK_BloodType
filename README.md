# JAVA_WK_BloodType
Teste java WKT

#### O backend foi documentado utilizando o swagger, podendo ser acessado pela url abaixo:
http://localhost:8080/swagger-ui.html

#### Ao executar o projeto, será criado um banco chamado teste, e o flyway ŕodará os scripts para criação das tabelas do banco de dados e inserção dos tipos sanguineos com os doadores e receptores.

#### Ao entrar na url do swagger, utilize a rota /data/load do data-json-controller para carregar o arquivo que contem o json a ser inserido.
  A rota necessitará do caminho completo onde o arquivo está salvo.
  Ao executar, o arquivo será lido e salvará os dados do json no banco criado
  O json possui uma lista de objetos no seguinte formato:
  ```json
   [
    {
      "nome": "Nome de uma pessoa",
      "cpf": "xxx.xxx.xxx-xx",
      "rg": "xx.xxx.xxx",
      "data_nasc": "dd\/mm\/yyyy",
      "sexo": "(Feminino ou Masculinon)",
      "mae": "Nome da mae",
      "pai": "Nome do pai",
      "email": "xxxxxx@xxxx.com.br",
      "cep": "xxxxx-xxx",
      "endereco": "Rua nome da rua",
      "numero": 123,
      "bairro": "nome do bairro",
      "cidade": "nome da cidade",
      "estado": "UF",
      "telefone_fixo": "(xx) xxxx-xxxx",
      "celular": "(xx) xxxxx-xxxx",
      "altura": 1.11,
      "peso": 70,
      "tipo_sanguineo": "O-"
    }
    
  ]
  ```
#### Em User-controller temos as seguintes rotas:
 
 /candidates/avg-by-blood -> Retorna a média de idade por tipo sanguineo

/candidates/faixa -> retorna o IMC médio por faixa de idade

/candidates/obese -> retorna o percentual de obesos por sexo

/candidates/receivers-list -> retorna uma lista de receptores por tipo sanguineo

/candidates/states -> Retorna os candidatos por estado
