
--- TomEE Runner 
----------------

$ cd ~/code/tomee-runner
$ java -jar target/tomee-runner.jar ../sample-webapp/target/sample-webapp.war

$ cd ~/code
$ sudo docker build -t tomee-runner tomee-runner/
$ sudo docker build -t sample-webapp-tomee -f sample-webapp/Dockerfile-tomee sample-webapp/
$ sudo docker run -d --name my-container -p 8080:8080 sample-webapp-tomee

--- Jetty Runner
----------------

$ cd ~/code/jetty-runner
$ java -jar target/jetty-runner.jar ../sample-webapp/target/sample-webapp.war

$ cd ~/code
$ sudo docker build -t jetty-runner jetty-runner/
$ sudo docker build -t sample-webapp-jetty -f sample-webapp/Dockerfile-jetty sample-webapp/
$ sudo docker run -d --name my-container -p 8080:8080 sample-webapp-jetty

--- Both Runners
----------------

$ sudo docker exec -it my-container /bin/sh
$ sudo docker ps -a
$ sudo docker logs my-container
$ sudo docker stop my-container 
$ sudo docker rm my-container

--- IBM Websphere 9
-------------------

$ cd ~/code/sample-webapp
$ docker build -t was9-sample-webapp .
$ docker run -d --name mywas9 -h test -p 9080:9080 -p 9043:9043 -p 9443:9443 was9-sample-webapp
$ docker exec -it mywas9 cat /tmp/PASSWORD

- https://localhost:9043/ibm/console/login.do?action=secure
- https://localhost:9443/sample/
- http://localhost:9080/sample/
