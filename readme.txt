--- WAR
-------

$ cd ~/code/sample-webapp
$ mvn clean verify

--- TomEE Runner 
----------------

$ cd ~/code/tomee-runner
$ mvn clean verify
$ java -jar target/tomee-runner.jar ../sample-webapp/target/sample-webapp.war

$ cd ~/code
$ sudo docker build -t tomee-runner tomee-runner/
$ sudo docker build -t sample-webapp-tomee -f sample-webapp/Dockerfile-tomee sample-webapp/
$ sudo docker run -d -p 8080:8080 --name container-1 sample-webapp-tomee
$ sudo docker ps -a
$ sudo docker logs container-1
$ sudo docker stop container-1 
$ sudo docker rm container-1

--- Jetty Runner
----------------

$ cd ~/code/jetty-runner
$ mvn clean verify
$ java -jar target/jetty-runner.jar ../sample-webapp/target/sample-webapp.war

$ cd ~/code
$ sudo docker build -t jetty-runner jetty-runner/
$ sudo docker build -t sample-webapp-jetty -f sample-webapp/Dockerfile-jetty sample-webapp/
$ sudo docker run -d -p 8080:8080 --name container-1 sample-webapp-jetty
$ sudo docker ps -a
$ sudo docker logs container-1
$ sudo docker stop container-1 
$ sudo docker rm container-1
