drop table if exists Gatos;
drop table if exists Perros;
create table Gatos (GATO_ID integer not null, nombre varchar(255), primary key (GATO_ID)) engine=MyISAM;
create table Perros (id_perro integer not null, edad integer not null, nombre varchar(255), primary key (id_perro)) engine=MyISAM;
drop table if exists Vuelos;
create table Vuelos (ID integer not null, aerolinea_id integer not null, avion_id integer not null, bol_activo bit not null, destino_id integer not null, directo bit not null, esItinerario bit not null, estadoVuelo_id integer not null, horario time, origen_id integer not null, reserva_id integer not null, tarifa_id_id integer not null, tipoVuelo_id integer not null, primary key (ID)) type=MyISAM;
drop table if exists Vuelos;
create table Vuelos (ID integer not null, aerolinea_id integer not null, avion_id integer not null, bol_activo bit not null, destino_id integer not null, directo bit not null, esItinerario bit not null, estadoVuelo_id integer not null, horario time, origen_id integer not null, reserva_id integer not null, tarifa_id_id integer not null, tipoVuelo_id integer not null, primary key (ID)) type=MyISAM;
drop table if exists Vuelos;
create table Vuelos (ID integer not null, aerolinea_id integer not null, avion_id integer not null, bol_activo bit not null, destino_id integer not null, directo bit not null, esItinerario bit not null, estadoVuelo_id integer not null, horario time, origen_id integer not null, reserva_id integer not null, tarifa_id_id integer not null, tipoVuelo_id integer not null, primary key (ID)) engine=MyISAM;
drop table if exists Vuelos;
create table Vuelos (id integer not null, aerolinea_id integer not null, avion_id integer not null, bol_activo bit not null, destino_id integer not null, directo bit not null, esItinerario bit not null, estadoVuelo_id integer not null, horario time, origen_id integer not null, reserva_id integer not null, tarifa_id_id integer not null, tipoVuelo_id integer not null, primary key (id)) engine=MyISAM;
drop table if exists Aerolineas;
drop table if exists Aeropuertos;
drop table if exists Asientos;
drop table if exists Aviones;
drop table if exists Ciudades;
drop table if exists EstadoVuelos;
drop table if exists Itinerarios;
drop table if exists Reservas;
drop table if exists Tarifas;
drop table if exists TipoClase;
drop table if exists TipoVuelo;
drop table if exists Vuelos;
create table Aerolineas (id integer not null, bol_activo bit not null, nombre varchar(255), tipoVuelos integer not null, primary key (id)) engine=MyISAM;
create table Aeropuertos (id integer not null, bol_activo bit not null, ciudad integer not null, nombre varchar(255), primary key (id)) engine=MyISAM;
create table Asientos (id integer not null, avion_id integer not null, bol_activo bit not null, libre bit not null, numero integer not null, reserva_id integer not null, tipoClase_id integer not null, primary key (id)) engine=MyISAM;
create table Aviones (id integer not null, aerolinea_id integer not null, bol_activo bit not null, capacidad integer not null, modelo varchar(255), numeroAsientos integer not null, primary key (id)) engine=MyISAM;
create table Ciudades (id integer not null, bol_activo bit not null, nombre varchar(255), primary key (id)) engine=MyISAM;
create table EstadoVuelos (id integer not null, nombre varchar(255), primary key (id)) engine=MyISAM;
create table Itinerarios (id integer not null, segmento integer not null, vuelo_id integer not null, primary key (id)) engine=MyISAM;
create table Reservas (id integer not null, costo integer not null, numeroBoleto integer not null, usuario_id integer not null, primary key (id)) engine=MyISAM;
create table Tarifas (id integer not null, bol_activo bit not null, ciudadDestino_id integer not null, ciudadOrigen_id integer not null, valorDirecto integer not null, valorItinerario integer not null, primary key (id)) engine=MyISAM;
create table TipoClase (id integer not null, nombre varchar(255), primary key (id)) engine=MyISAM;
create table TipoVuelo (id integer not null, nombre varchar(255), primary key (id)) engine=MyISAM;
create table Vuelos (id integer not null, aerolinea_id integer not null, avion_id integer not null, bol_activo bit not null, destino_id integer not null, directo bit not null, esItinerario bit not null, estadoVuelo_id integer not null, horario time, origen_id integer not null, reserva_id integer not null, tarifa_id_id integer not null, tipoVuelo_id integer not null, clave varchar(255), clienteFrecuente bit not null, fechaExpira integer not null, fechaNacimiento date, fecha_Registro date, nombre varchar(255), rut varchar(255), tarjeta integer not null, primary key (id)) engine=MyISAM;
drop table if exists Aerolineas;
drop table if exists Aeropuertos;
drop table if exists Asientos;
drop table if exists Aviones;
drop table if exists Ciudades;
drop table if exists EstadoVuelos;
drop table if exists Itinerarios;
drop table if exists Reservas;
drop table if exists Tarifas;
drop table if exists TipoClase;
drop table if exists TipoVuelo;
drop table if exists Usuarios;
drop table if exists Vuelos;
create table Aerolineas (id integer not null, bol_activo bit not null, nombre varchar(255), tipoVuelos integer not null, primary key (id)) engine=MyISAM;
create table Aeropuertos (id integer not null, bol_activo bit not null, ciudad integer not null, nombre varchar(255), primary key (id)) engine=MyISAM;
create table Asientos (id integer not null, avion_id integer not null, bol_activo bit not null, libre bit not null, numero integer not null, reserva_id integer not null, tipoClase_id integer not null, primary key (id)) engine=MyISAM;
create table Aviones (id integer not null, aerolinea_id integer not null, bol_activo bit not null, capacidad integer not null, modelo varchar(255), numeroAsientos integer not null, primary key (id)) engine=MyISAM;
create table Ciudades (id integer not null, bol_activo bit not null, nombre varchar(255), primary key (id)) engine=MyISAM;
create table EstadoVuelos (id integer not null, nombre varchar(255), primary key (id)) engine=MyISAM;
create table Itinerarios (id integer not null, segmento integer not null, vuelo_id integer not null, primary key (id)) engine=MyISAM;
create table Reservas (id integer not null, costo integer not null, numeroBoleto integer not null, usuario_id integer not null, primary key (id)) engine=MyISAM;
create table Tarifas (id integer not null, bol_activo bit not null, ciudadDestino_id integer not null, ciudadOrigen_id integer not null, valorDirecto integer not null, valorItinerario integer not null, primary key (id)) engine=MyISAM;
create table TipoClase (id integer not null, nombre varchar(255), primary key (id)) engine=MyISAM;
create table TipoVuelo (id integer not null, nombre varchar(255), primary key (id)) engine=MyISAM;
create table Usuarios (id integer not null, bol_activo bit not null, clave varchar(255), clienteFrecuente bit not null, fechaExpira integer not null, fechaNacimiento date, fecha_Registro date, nombre varchar(255), rut varchar(255), tarjeta integer not null, primary key (id)) engine=MyISAM;
create table Vuelos (id integer not null, aerolinea_id integer not null, avion_id integer not null, bol_activo bit not null, destino_id integer not null, directo bit not null, esItinerario bit not null, estadoVuelo_id integer not null, horario time, origen_id integer not null, reserva_id integer not null, tarifa_id_id integer not null, tipoVuelo_id integer not null, primary key (id)) engine=MyISAM;
