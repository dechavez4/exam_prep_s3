[![Build Status](https://travis-ci.org/dat3startcode/rest-jpa-devops-startcode.svg?branch=master)](https://travis-ci.org/dat3startcode/rest-jpa-devops-startcode)

*This project is meant as start code for projects and exercises given in Flow-1+2 at http://cphbusiness.dk in the Study Program "AP degree in Computer Science"*

*Projects which are expected to use this start-code are projects that require all, or most of the following technologies:*
 - *JPA and REST*
- *Testing, including database test*
- *Testing, including tests of REST-API's*
- *CI and CONTINUOUS DELIVERY*

### Preconditions
*In order to use this code, you should have a local developer setup + a "matching" droplet on Digital Ocean as described in the 3. semester guidelines* 
# Getting Started

This project contains two major documentation files: 
 - [First time users - getting started](README_proof_of_concept.md)
 - [How to use for future projects](README_how_to_use.md)


### `My guide to setup the backend`
1. Other Sources -> default package -> config.properties
- change the dc.database name so it matches your database name. Do the same with dbtest. 

2. Project Files -> pom.xml
- the the remote.server to your URL. (<remote.server>https://renzcph.dk/manager/text</remote.server>)

3. open the project folder and git bash in the root folder. 
in the terminal: sudo nano /opt/tomcat/bin/setenv.sh

export DEPLOYED="DEV_ON_DIGITAL_OCEAN"
export USER="dev"
export PW="ax2"
export CONNECTION_STR="jdbc:mysql://localhost:3306/CA3" 

4.afterwards restart tomcat. sudo systemctl restart tomcat

5. find Travis.yml filen i root folderen. 
ændre database navn i linie 40(CREATE DATABASE ??) til database navnet i den lokal database. (CA3_test)

6. https://travis-ci.org/
    på travis sæt REMOTE_USER til "script_user" og REMOTE_PW til script_user’s password.
    
    -- brug følgende kommando for at finde password til brugeren hvis nødvendigt.
    sudo nano /opt/tomcat/conf/tomcat-users.xml

7. når alle steps er kørt igennem SÅ HUSK AT CLEAN AND BUILD PROJEKTET. 



