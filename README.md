# person
 
Rapport SonarQube : https://sonarcloud.io/dashboard?id=com.example%3Aperson

# Application goal

The goal of Person is to create, read , update and delete a contact from an API. Using Mongo DB for data persistance. 

# Configuring Mongo DB

After launching Mongo Compas : 
- Click on the button create database 
- Enter in database name : person_db
- Enter in collection name : person_db

Importing our collection :
- After installing : https://fastdl.mongodb.org/tools/db/mongodb-database-tools-windows-x86_64-100.3.1.msi
- Register this into your system variable 
- Download the file db.json available in the project
- Open up a windows cmd 
- Run the commande : mongoimport --db person_db --collection person_db --file db.json

This will help you with project stability and avoid you to interfere with the code while testing.

# Running the project

After clonning the project and opening it into your favorite editor.
Open up the CLI and run : mvn spring-boot:run or mvwn spring-boot:run
This commands will run every things the system needs to works.

Also you might want to run in the CLI : curl http://localhost:8080/api/persons, to see the web application. 

# Running test 

Todo
