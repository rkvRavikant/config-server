# Simple example of Centralized config server with spring boot

-This repository contains one spring boot project that is created as a configuration server and one property file that is going to be referred from the config server project.

-This repository has 2 branches: main and master, so you can change the branch(label) value in the application properties of config-server application to refer any properties present in both the branches.

- Once we start the application we can hit the url on localhost to find the response of the property read. **url**: **http://localhost:8085/config-mgmt-service/default**. 
  - here port(8085) can be changed accourding to the port number present in application.properties. 
  - config-mgmt-service can be changed according to property file name present in the referred repository(if we are using this config-server from some of our micro-service then it will be taken as our micro-service name by-default. For example: If we are using this in microservice named as microservice1 then url will be:                         http://localhost:8085/microservice1/default). 
  - 'default' is here used for telling the profile. For each microservice if we don't provide profile, it will be taken as 'default'. if profile is 'default' then it will search just based on the property file name provided. For Example: In case of http://localhost:8085/microservice1/default it will search for microservice1.properties. If we provide profile as Dev then it will concat the dev keyword in the property file name. so it will concat the property file name and the profile to search for the file. For example: If we hit the url as http://localhost:8085/myclient-microservice-name/dev it will look for property file named as myclient-microservice-name-dev.properties. if we provide any profile that doesn't exist then it will take the profile as default.
