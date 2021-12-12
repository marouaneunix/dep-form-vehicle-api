FROM tomcat:9.0-jdk11-openjdk-slim
COPY target/vehicle-api.war ${CATALINA_HOME}/webapps/ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]


