# Devsu-technical-test
## Librerias
- **Java 17**
- **Maven**
- **Lombok**
- **Docker**
- **Mysql 8.028**
- **Spring boot 3.2.2**
- **Spring boot data JPA**
- **Spring boot starter web**
- **Spring boot devtools**
- **Postman**

## Introducción
Se elaboran dos microservicios “technical-test” y “technical-test-account-management” este segundo consume del primero para su funcionamiento. 
Configuración

## 1.	Configuración de la base de datos 
Se configuro la base de datos y los 2 microservicios en un entorno Docker utilizando un archivo docker-compose.yml que se encuentra en la raíz del reposotorio
```
./docker-compose.yml
```

Ejecuta Docker compose: en la terminal de tu proyecto ejecuta el siguiente comando para iniciar los servicios de tu archivo docker-compose.yml
```
docker compose up
```
Si no tienes los permisos, utiliza el comando sudo para ejecutar el comando como administrador
```
sudo docker compose up
```
Estos es lo que se cargara en el docker
- **MySql**: `Puerto` 3306
- **Microservicio technical-test**: `Puerto` 8088
- **Microservicio technical-test-account-management**: `Puerto` 8089

## 2.Acceso a la API
•	Accede a la API mediante las direcciones http://localhost:8088 y http://localhost:8089 usando cualquier cliente(preferiblemente postman)

## 3.Probar los endpoits
Para probar los endpoints de tu API utilizando Postman  debes importar la colección que esta en la raíz del repositorio de git:
```
./Devsu-Tecnical-Test.postman_collection.json
```
- **Importa la colección postman.**
- **Revisar la Colección Importada.**
- **Configurar Variables de Entorno (Si es Necesario).**

## 4.Endpoints

## CLIENTES

- **POST Create Cliente joseLema**
  - `http://localhost:8088/clientes`

- **POST Create Cliente Mairanela Montalvo**
  - `http://localhost:8088/clientes`

- **GET Find all**
  - `http://localhost:8088/clientes`

- **GET Find by ClienteId**
  - `http://localhost:8088/clientes/{id}`

- **PUT Update**
  - `http://localhost:8088/clientes`

- **PATCH Patch**
  - `http://localhost:8088/clientes/1`

- **DELETE Delete**
  - `http://localhost:8088/clientes/1`

## CUENTA

- **POST Create account type ahorros**
  - `http://localhost:8089/cuentas`

- **POST Create account type corriente**
  - `http://localhost:8089/cuentas`

- **GET Find all**
  - `http://localhost:8080/cuentas`

- **GET Find By Id**
  - `http://localhost:8088/cuentas/{id}`

- **PUT Update**
  - `http://localhost:8088/cuentas`

- **PATCH Patch**
  - `http://localhost:8088/cuentas/1`

- **DELETE Delete**
  - `http://localhost:8088/cuentas/2`

## Movimiento

- **POST Create Crédito**
  - `http://localhost:8089/movimientos`

- **POST Create Débito**
  - `http://localhost:8089/movimientos`

- **GET Find all**
  - `http://localhost:8088/movimientos`

- **GET Find by Id**
  - `http://localhost:8088/movimientos/1`

- **PUT Update**
  - `http://localhost:8088/movimientos`

- **DELETE Delete**
  - `http://localhost:8088/movimientos/1`

## Reporte

- **GET Generate report by cliente id**
  - `http://localhost:8089/reportes?clienteId=1&fechaInicial=2024-01-23&fechaFinal=2024-01-24`

  Query Params:
    - clienteId: 1
    - fechaInicial: 2024-01-23
    - fechaFinal: 2024-01-24

