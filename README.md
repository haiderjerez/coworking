# 🏢 Sistema de Gestión de Reservas para Coworking

Este sistema es un gestor de Reservas de salones que te permite consultar los salones disponibles, reservar salones disponibles, modificar salones,eliminar salones y consultar los salones reservados.

## Tecnologias Usadas 🖥️

- Spring Boot 
- PostgreSQL
- HTML5
- CSS3

## Instrucciones de instalación y ejecución del proyecto 📖
1. Clonar el repositorio
2. Instalar las dependencias con maven
3. Crear una base de datos en PostgreSQL
4. Configurar la base de datos en el archivo application.properties
5. Ejecutar el proyecto con Spring Boot
6. Acceder al sistema a través de la URL `http://localhost:8081`

##  📊 Diagrama EER
![Diagrama EER](Coworking-ER.png)

## 📜 Scripts SQL 



### Usar la base de datos en PostgreSQL:
```sql
CREATE DATABASE coworking;
```
### Inserciones para Disponibilidad
```sql
INSERT INTO Disponibilidad (1,'Disponible');
INSERT INTO Disponibilidad (2,'No Disponible');
```
### Inserciones para TipoEspacio
```sql
INSERT INTO TipoEspacio (1,'Oficinas privadas');
INSERT INTO TipoEspacio (2,' Salas de reuniones');
INSERT INTO TipoEspacio (3,'Escritorios compartidos');
```
### Inserciones para EstadoReserva
```sql
INSERT INTO EstadoReserva (1,'Pendiente');
INSERT INTO EstadoReserva (2,'Confirmada');
INSERT INTO EstadoReserva (3,'Cancelada');
```

### Inserciones para Reservas:
```sql
INSERT INTO Reservas(1,1,'2022-01-01','6 AM','7 AM',1);
INSERT INTO Reservas(2,2,'2022-02-02','7 AM','8 AM',2);
INSERT INTO Reservas(3,3,'2022-03-03','8 AM','9 AM',3);
INSERT INTO Reservas(4,4,'2022-04-04','9 AM','10 AM',1);
INSERT INTO Reservas(5,5,'2022-05-05','10 AM','11 AM',2);
INSERT INTO Reservas(6,6,'2022-06-06','11 AM','12 AM',3);
INSERT INTO Reservas(7,7,'2022-07-07','12 PM','1 PM',1);
INSERT INTO Reservas(8,8,'2022-08-08','1 PM','2 PM',2);
INSERT INTO Reservas(9,9,'2022-09-09','2 PM','3 PM',3);
INSERT INTO Reservas(10,10,'2022-10-10','3 PM','4 PM',1);
```
### Inserciones para Salones:
```sql
INSERT INTO Espacios(1,"Salon1",1,"5 personas",1);
INSERT INTO Espacios(2,"Salon2",2,"30 personas",2);
INSERT INTO Espacios(3,"Salon3",3,"15 personas",1);
INSERT INTO Espacios(4,"Salon4",1,"5 personas",2);
INSERT INTO Espacios(5,"Salon5",2,"30 personas",1);
INSERT INTO Espacios(6,"Salon6",3,"15 personas",2);
INSERT INTO Espacios(7,"Salon7",1,"5 personas",1);
INSERT INTO Espacios(8,"Salon8",2,"30 personas",2);
INSERT INTO Espacios(9,"Salon9",3,"15 personas",1);
INSERT INTO Espacios(10,"Salon10",1,"5 personas",2);
```
### Lista de Endpoints 📋
## /disponibilidad
- GET: Obtiene la lista de disponibilidad
- POST: Crea una nueva disponibilidad

## /disponibilidad/{id}
- GET: Obtiene la disponibilidad con el id especificado

## /disponibilidad/eliminar/{id}
- DELETE: Elimina la disponibilidad con el id especificado

## /disponibilidad/guardar
- POST: Guarda la disponibilidad

## /espacios
- GET: Obtiene la lista de espacios
- POST: Crea un nuevo espacio
- PUT: Actualiza un espacio
- DELETE: Elimina un espacio

## /espacios/{id}
- GET: Obtiene el espacio con el id especificado
- DELETE: Elimina el espacio con el id especificado
- PUT: Actualiza el espacio con el id especificado
- POST: Crea un nuevo espacio

## /espacios/eliminar/{id}
- DELETE: Elimina el espacio con el id especificado

## /espacios/guardar 
- POST: Guarda el espacio

## /estados-reservas
- GET: Obtiene la lista de estados de reservas
- POST: Crea un nuevo estado de reserva
- PUT: Actualiza un estado de reserva
- DELETE: Elimina un estado de reserva

## /estados-reservas/{id}
- GET: Obtiene el estado de reserva con el id especificado

## /estados-reservas/eliminar/{id}
- DELETE: Elimina el estado de reserva con el id especificado

## /estados-reservas/guardar
- POST: Guarda el estado de reserva

## /reservas
- GET: Obtiene la lista de reservas
- POST: Crea una nueva reserva
- PUT: Actualiza una reserva

## /reservas/eliminar/{id}
- DELETE: Elimina la reserva con el id especificado

## /reservas/guardar
- POST: Guarda la reserva

## /tipoEspacio
- GET: Obtiene la lista de tipos de espacios
- POST: Crea un nuevo tipo de espacio
- PUT: Actualiza un tipo de espacio

## /tipoEspacio/{id}
- GET: Obtiene el tipo de espacio con el id especificado
- PUT: Actualiza el tipo de espacio con el id especificado
- POST: Crea un nuevo tipo de espacio

## /tipoEspacio/eliminar/{id}
- DELETE: Elimina el tipo de espacio con el id especificado

## /tipoEspacio/guardar
- POST: Guarda el tipo de espacio

## Creadores
github:
haiderjerez: https://github.com/haiderjerez
sebastian santos: https://github.com/RaitonOwO
