drop table if exists Gatos;
drop table if exists Perros;
create table Gatos (GATO_ID integer not null, nombre varchar(255), primary key (GATO_ID)) engine=MyISAM;
create table Perros (id_perro integer not null, edad integer not null, nombre varchar(255), primary key (id_perro)) engine=MyISAM;
