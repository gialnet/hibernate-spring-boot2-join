
http://www.sql-workbench.net/

CREATE TABLE Questions
(
    id          serial NOT NULL,
    nombre      varchar(60),
    primary key (id)
);

CREATE TABLE Direcciones
(
    id                  serial NOT NULL,
    questions_id        integer references Questions(id),
    nombre      varchar(60),
    poblacion   varchar(30),
    primary key (id)
);
