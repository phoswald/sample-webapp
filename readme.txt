
$ cd ~/code/sample-webapp
$ mvn clean verify

$ cd ~/code/tomee-runner
$ mvn clean verify
$ java -jar target/tomee-runner.jar ../sample-webapp/target/sample-webapp.war

$ cd ~/code
$ sudo docker build -t tomee-runner tomee-runner/
$ sudo docker build -t sample-webapp-tomee sample-webapp/
$ sudo docker run -d -p 8080:8080 --name container-1 sample-webapp-tomee
$ sudo docker ps -a
$ sudo docker logs container-1
$ sudo docker stop container-1 
$ sudo docker rm container-1
