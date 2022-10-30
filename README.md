
### Ukázkový projekt pro Actis s.r.o. 
Do databáze jsou uloženy záznamy studentů: každý má jméno, příjmení, datum narození a informace o zaměstnaní jako atributy.

##### com.actis.actisproject.model - definice třídy Student jako entity tabulky
##### com.actis.actisproject.exception - exception handling
##### com.actis.actisproject.controller - funkce getAllStudents() a getStudentById() pro jednotlivé výpisy.
##### com.actis.actisproject.repository - JPA repozitář

#### Uložení záznamu do PostgreSQL databáze pomocí SQL
```
INSERT INTO students (birth_date, first_name, second_name, is_employed) VALUES 
('1998-09-10', 'Fred', 'Perry', TRUE);
INSERT INTO students (birth_date, first_name, second_name, is_employed) VALUES 
('1999-06-16', 'Alex', 'Smith', TRUE);
INSERT INTO students (birth_date, first_name, second_name, is_employed) VALUES 
('1999-05-17', 'John', 'Doe', FALSE);
INSERT INTO students (birth_date, first_name, second_name, is_employed) VALUES 
('2001-11-29', 'Fedor', 'Elchaninov', FALSE);
INSERT INTO students (birth_date, first_name, second_name, is_employed) VALUES 
('2002-01-03', 'Melissa', 'Brown', TRUE);
INSERT INTO students (birth_date, first_name, second_name, is_employed) VALUES 
('2000-02-07', 'Alice', 'Goldsmith', TRUE);
INSERT INTO students (birth_date, first_name, second_name, is_employed) VALUES 
('1999-04-07', 'Kate', 'Cortex', FALSE);
INSERT INTO students (birth_date, first_name, second_name, is_employed) VALUES 
('1997-04-09', 'Denis', 'Jones', TRUE);
INSERT INTO students (birth_date, first_name, second_name, is_employed) VALUES 
('1997-04-09', 'Roland', 'Jones', FALSE);
INSERT INTO students (birth_date, first_name, second_name, is_employed) VALUES 
('1996-09-09', 'Andrew', 'Reynolds', TRUE);
```
#### Příklady API odpovědí
***GET http://localhost:8080/api/students/***
```
[{"id":1,"firstName":"Alex","secondName":"Smith","birthDate":"1999-06-16","employed":true},
{"id":2,"firstName":"Fred","secondName":"Perry","birthDate":"1998-09-10","employed":true},
{"id":3,"firstName":"John","secondName":"Doe","birthDate":"1999-05-17","employed":false},
{"id":4,"firstName":"Fedor","secondName":"Elchaninov","birthDate":"2001-11-29","employed":false},
{"id":5,"firstName":"Melissa","secondName":"Brown","birthDate":"2002-01-03","employed":true},
{"id":6,"firstName":"Alice","secondName":"Goldsmith","birthDate":"2000-02-07","employed":true},
{"id":7,"firstName":"Kate","secondName":"Cortex","birthDate":"1999-04-07","employed":false},
{"id":8,"firstName":"Denis","secondName":"Jones","birthDate":"1997-04-09","employed":true},
{"id":9,"firstName":"Roland","secondName":"Jones","birthDate":"1997-04-09","employed":false},
{"id":10,"firstName":"Andrew","secondName":"Reynolds","birthDate":"1996-09-09","employed":true}]
```
***GET http://localhost:8080/api/students/4***
```
{"id":4,"firstName":"Fedor","secondName":"Elchaninov","birthDate":"2001-11-29","employed":false}
```
***GET http://localhost:8080/api/students/11***
```
{"timestamp":"2022-10-30T17:01:14.063+00:00","message":"Student not found ::11"}
```
