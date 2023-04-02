/*drop schema sinlimites;*/

/*drop user usuario_sinlimites;*/

/*DROP TABLE sinlimites.ofertas;*/

CREATE SCHEMA `sinlimites`;

/* Crear un usuario */
CREATE USER 'usuario_sinlimites' @'%' IDENTIFIED BY 'Sinlimites_.';

/* Se asignan los privilegios */
GRANT ALL PRIVILEGES ON sinlimites.* to 'usuario_sinlimites';
flush privileges; 

CREATE TABLE `sinlimites`.`cliente` (
`id_cliente` INT NOT NULL AUTO_INCREMENT, 
`nombre` VARCHAR(60) NOT NULL,
`apellidos` VARCHAR(60) NOT NULL,
`pais` VARCHAR(30) NOT NULL,
`correo` VARCHAR(30) NULL, 
`telefono` VARCHAR(15) NULL,
 PRIMARY KEY (`id_cliente`))
ENGINE = innoDB;

/*Se genera tabla de empleados*/
CREATE TABLE `sinlimites`.`empleado` (
`id_empleado` INT NOT NULL AUTO_INCREMENT,
 `nombre` VARCHAR(60) NOT NULL,
 `apellidos` VARCHAR(60) NOT NULL,
 `correo` VARCHAR(30) NULL,
 `categoria` VARCHAR(60) NOT NULL,
 `telefono` VARCHAR(20) NULL,
 PRIMARY KEY (`id_empleado`))
ENGINE = innoDB;

/*Se genera tabla de hotel*/
CREATE TABLE `sinlimites`.`hotel` (
`id_hotel` INT NOT NULL AUTO_INCREMENT,
`nombre` VARCHAR(60) NOT NULL,
 `localidad` VARCHAR(300) NOT NULL,
 `descripcion` VARCHAR(300) NOT NULL,
 `servicios` VARCHAR(300) NULL,
 `precio` INT NOT NULL,
 PRIMARY KEY (`id_hotel`))
ENGINE = innoDB;

/*Se genera tabla de tours*/
CREATE TABLE `sinlimites`.`tours` (
`id_tour` INT NOT NULL AUTO_INCREMENT,
`tipo` VARCHAR(300) NOT NULL,
`localidad` VARCHAR(300) NOT NULL,
`descripcion` VARCHAR(300) NOT NULL,
`precio` INT NOT NULL,
 PRIMARY KEY (`id_tour`))
ENGINE = innoDB;

create table sinlimites.ofertas(
id_oferta int not null auto_increment,
nombre_lugar varchar(60) not null,
localidad varchar(500) not null,
descripcion varchar(500) not null,
precio int not null,
primary key(id_oferta))
ENGINE = innoDB;


/*Insertar 4 registros de ofertas */
insert into sinlimites.ofertas(nombre_lugar, localidad, descripcion, precio)
	values ('Barcelo Tambor', 'Narajo','Hotel Barcelo Tambor a un precio unico','100');

insert into sinlimites.ofertas(nombre_lugar, localidad, descripcion, precio)
	values ('Camino Verde', 'Santa Elena','Aportar la combinación ideal de calidad, comodidad y ubicación','50');

insert into sinlimites.ofertas(nombre_lugar, localidad, descripcion, precio)
	values ('Shana By The Beach', 'Parque Nacional Manuel Antonio','Ubicado en el borde de la selva tropical, y con vistas a la extensión del Océano Pacífico','140');

insert into sinlimites.ofertas(nombre_lugar, localidad, descripcion, precio)
	values ('Volcano Lodge', 'La Fortuna de San Carlos',' Volcano Lodge, Hotel & Thermal Experience, una fantástica opción para viajeros como tú.','200');
    

/*Insertar 4 registros de cliente */
INSERT INTO `sinlimites`.`cliente` (`nombre`, `apellidos`,`pais`,`correo`, `telefono`)
	VALUES ('Karolina', 'Guerrea Mata','Costa Rica', 'karolina_333@gmail.com', '8956-3467');
    
INSERT INTO `sinlimites`.`cliente` (`nombre`, `apellidos`,`pais`, `correo`, `telefono`)
	VALUES ('Andrés', 'Peña Mora','España', 'andresito333@gmail.com', '2743-5676');
    
INSERT INTO `sinlimites`.`cliente` (`nombre`, `apellidos`,`pais`, `correo`, `telefono`)
	VALUES ('Maria Fernanda', 'Oviedo Sánchez','Argentina', 'mariaf1999@gmail.com', '8546-3567');
    
INSERT INTO `sinlimites`.`cliente` (`nombre`, `apellidos`,`pais`, `correo`, `telefono`)
	VALUES ('Maria Laura', 'Valverde Loaiza','Costa Rica', 'lulu2343@gmail.com', '8932-5687');



/*Insertar 4 registros de empleado*/
INSERT INTO `sinlimites`.`empleado` (`nombre`, `apellidos`,`categoria`,`correo`, `telefono`)
	VALUES ('Alberto','Mata Quesada','Administrador','empleado2022@gmail.com','8567-5667');
    
INSERT INTO `sinlimites`.`empleado` (`nombre`, `apellidos`,`categoria`, `correo`, `telefono`)
	VALUES ('Pablo','Peña Valverde','Guía Turístico','empleado20223@gmail.com','7856-5676');
    
INSERT INTO `sinlimites`.`empleado` (`nombre`, `apellidos`,`categoria`, `correo`, `telefono`)
	VALUES ('Daniela','Oviedo Sánchez','Administrador','empleado2021@gmail.com','2574-3347');
    
INSERT INTO `sinlimites`.`empleado` (`nombre`, `apellidos`,`categoria`, `correo`, `telefono`)
	VALUES ('Julián','Valverde Loaiza','Departamento de Sistemas','empleado2020@gmail.com','8678-5876');


/*Insertar 4 hoteles de hotel*/
INSERT INTO `sinlimites`.`hotel` (`nombre`, `localidad`,`descripcion`,`servicios`, `precio`)
	VALUES ('Destellos de Luna','Limón','complejo paisaje de montañas.','Todo Incluido, actividades turisticas','250');
    
INSERT INTO `sinlimites`.`hotel` (`nombre`, `localidad`,`descripcion`, `servicios`, `precio`)
	VALUES ('Arena Blanca','Pérez Zeledón',' delirante vista con el mejor Todo Incluido.','Todo Incluido, actividades turisticas, Actividades Acuaticas, caminatas','260');
    
INSERT INTO `sinlimites`.`hotel` (`nombre`, `localidad`,`descripcion`, `servicios`, `precio`)
	VALUES ('RIU','Guanacaste','la belleza que rodea el complejo y la delirante vista con el mejor Todo Incluido.','Spa todo incluido','400');
    
INSERT INTO `sinlimites`.`hotel` (`nombre`, `localidad`,`descripcion`, `servicios`, `precio`)
	VALUES ('Condovac','Guanacaste','delirante vista con el mejor Todo Incluido.','Todo Incluido','460');
    

/*Insertar 4 hoteles de tours*/
INSERT INTO `sinlimites`.`tours` (`tipo`, `localidad`,`descripcion`, `precio`)
	VALUES ('Faldas del Volcan','Cartago','Recorrido por el hermoso volcan irazú.','25');
    
INSERT INTO `sinlimites`.`tours` (`tipo`, `localidad`,`descripcion`, `precio`)
	VALUES ('Cascadas','Puntarenas','Caminata hasta llegar a la cascada uvita.','100');

INSERT INTO `sinlimites`.`tours` (`tipo`, `localidad`,`descripcion`, `precio`)
	VALUES ('Crucero al atardecer en catamarán con esnórquel de Marlín del Rey desde Tamarindo','Guanacaste','Este crucero al atardecer en Tamarindo incluye esnórquel y kayak para disfrutar del agua, además de barra libre con bebidas premium y el almuerzo.','110');
    
INSERT INTO `sinlimites`.`tours` (`tipo`, `localidad`,`descripcion`, `precio`)
	VALUES ('Aguas Termales','San Carlos','Hermosas Aguas termanes para pasar una tarde increible en pareja o en familia.','10');
