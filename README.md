El proyecto es un crud en spring boot 
version 3.1.3, relacionado a los datos de un Medico

#### 1. Ejecutar Script SQL
Se debe ejecutar el script que esta en la ruta
```
> database/create-database.sql
```
* Éste script debe ser ejecutado en el motor de base de datos MySQL
* El servicio de base de datos debe estar ejecutándose para
no tener errores

#### 2. Instalar dependencias de maven
Se debe construir las dependencias mediante el asistente
de maven.

#### 3. Ejecutar proyecto
Al compilar y ejecutar el proyecto
construirá las tablas para la base de datos 
usando Flywaydb el cuál ejecutará las migraciones.

* El proyecto se ejecuta en la siguiente dirección
http://localhost:3000/api/medicos
  



