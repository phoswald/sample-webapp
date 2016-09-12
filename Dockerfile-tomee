FROM tomee-runner
COPY target/sample-webapp.war /usr/tomee-runner/
WORKDIR /usr/tomee-runner
CMD exec java -jar tomee-runner.jar sample-webapp.war
