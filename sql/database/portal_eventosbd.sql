CREATE DATABASE portal_eventosbd;
USE portal_eventosbd;

-- TABLA USUARIO
CREATE TABLE usuario(
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    nombre_usuario VARCHAR(100) NOT NULL,
    correo VARCHAR(100) NOT NULL,
    contraseña VARCHAR(20) NOT NULL
    );
    
-- TABLA ORGANIZADOR
CREATE TABLE organizador(
    id_organizador INT AUTO_INCREMENT PRIMARY KEY,
    nombre_organizador VARCHAR(100) NOT NULL,
    contacto VARCHAR(100)
    );
    
-- TABLA CATEGORIA
CREATE TABLE categoria(
    id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nombre_categoria VARCHAR(100)
    );

-- TABLA UBICACION
CREATE TABLE ubicacion(
    id_ubicacion INT AUTO_INCREMENT PRIMARY KEY,
    tipo ENUM('Presencial','Online', 'Ambas'),
    direccion_enlace VARCHAR(200)
    );

-- TABLA EVENTO
CREATE TABLE evento(
    id_evento INT AUTO_INCREMENT PRIMARY KEY,
    nombre_evento VARCHAR(100) NOT NULL,
    fecha DATE NOT NULL,
    duracion INT NOT NULL,
    id_categoria INT,
    id_organizador INT,
    FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria),
    FOREIGN KEY (id_organizador) REFERENCES organizador(id_organizador)
    );


-- TABLA INSCRIPCIÓN
CREATE TABLE inscripcion(
    id_evento INT,
    id_usuario INT,
    PRIMARY KEY (id_evento, id_usuario),
    FOREIGN KEY (id_evento) REFERENCES evento(id_evento),
    FOREIGN KEY (id_usuario) REFERENCES usuario(id_usuario)
);

