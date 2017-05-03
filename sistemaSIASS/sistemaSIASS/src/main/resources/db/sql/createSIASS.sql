CREATE SCHEMA `siass` DEFAULT CHARACTER SET utf8 ;
USE `siass`;

CREATE TABLE Taller (
	id int AUTO_INCREMENT NOT NULL,
    fecha DATE NOT NULL,
    ubicacion VARCHAR(50) NOT NULL,
    PRIMARY KEY (ID)
);

CREATE TABLE Alumno (
	matricula VARCHAR(45) NOT NULL,
    nombre VARCHAR(45) NOT NULL,
    apellido1 VARCHAR(45) NOT NULL,
    apellido2 VARCHAR(45) NOT NULL,
    carrera VARCHAR(45) NOT NULL,
    semestre int NOT NULL,
    taller_id int, /*Foreign Key de Taller*/
    PRIMARY KEY (matricula),
	FOREIGN KEY (taller_id) REFERENCES Taller(id)
);

CREATE TABLE Opcion (
	id int AUTO_INCREMENT NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    tipo VARCHAR(15) NOT NULL,
    fechaInicio DATE NOT NULL,
    fechaFin DATE NOT NULL,
    nombreContacto VARCHAR(100) NOT NULL,
    telefono VARCHAR(10),
    descripcion TEXT NOT NULL,
    horasOfrecidas int NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE AlumnoOpcion (
	alumno VARCHAR(45) NOT NULL,
    opcion int NOT NULL,
    horasAsignadas int NOT NULL,
    PRIMARY KEY (alumno, opcion),
    FOREIGN KEY (alumno) REFERENCES Alumno(matricula),
    FOREIGN KEY (opcion) REFERENCES Opcion(id)
);
