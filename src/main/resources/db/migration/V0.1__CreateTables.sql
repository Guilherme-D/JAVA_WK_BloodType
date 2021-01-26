set foreign_key_checks=0;

CREATE TABLE users (
    id INT(20) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(100) NOT NULL,
    rg VARCHAR(100) NOT NULL,
    data_nascimento DATE NOT NULL,
    sexo CHAR(1) NOT NULL,
    mae VARCHAR(100) NOT NULL,
    pai VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    cep varchar(9) NOT NULL,
    telefone_fixo VARCHAR(100) NOT NULL,
    celular VARCHAR(100) NOT NULL,
    altura VARCHAR(100) NOT NULL,
    peso VARCHAR(100) NOT NULL,
    tipo_sanguineo_id INT(4) UNSIGNED NOT NULL,
    endereco_id INT(20) UNSIGNED NOT NULL,

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    deleted_at TIMESTAMP NULL DEFAULT NULL,

    CONSTRAINT FK_endereco_id FOREIGN KEY (endereco_id) REFERENCES address(id),
    CONSTRAINT FK_tipo_sanguineo FOREIGN KEY (tipo_sanguineo_id) REFERENCES blood_type(id)

);

CREATE TABLE address(
    id INT(20) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    endereco VARCHAR(255) NOT NULL,
    numero INT(11) NOT NULL,
    bairro VARCHAR(100) NOT NULL,
    cidade_id INT(20) UNSIGNED NOT NULL,
    estado_id INT(20) UNSIGNED NOT NULL,

    CONSTRAINT FK_cidade FOREIGN KEY (cidade_id) REFERENCES cities(id),
    CONSTRAINT FK_estado FOREIGN KEY (estado_id) REFERENCES states(id)
);

CREATE TABLE cities (
    id INT(20) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    cidade VARCHAR(255) NOT NULL
);

CREATE TABLE states (
    id INT(20) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    estado VARCHAR(255) NOT NULL,
    uf VARCHAR(2) NOT NULL
);

CREATE TABLE blood_type (
    id INT(20) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(8) NOT NULL,
    doa_para VARCHAR(50) NOT NULL,
    recebe_de VARCHAR(50) NOT NULL
);

set foreign_key_checks=1;