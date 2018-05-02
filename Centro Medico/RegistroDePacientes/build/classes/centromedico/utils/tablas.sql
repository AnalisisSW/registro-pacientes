drop database if exists centromedico;
create database centromedico;

create table centromedico.users(
    usuario varchar(20) not null primary key,
    password varchar(60) not null,
    dni varchar(11) not null
);

create table centromedico.pacientes(
    codigo varchar(10) not null primary key,
    apellido varchar(50) not null, 
    nombre varchar(50) not null
);

create table centromedico.medicos(
    codigo varchar(10) not null primary key,
    nombre varchar(55) not null,
    especialidad varchar(80) not null
);

create table centromedico.diagnosticos(
    id int(100) not null primary key,
    codPac varchar(10) not null,
    codMed varchar(10) not null,
    diagnostico varchar(255) not null 
);
    

