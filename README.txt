# ultron
# author: yogendra.singh@dineout.co.in
Dineout Spring cloud server.

For config git repo please check 
src/main/resources/application.properties

Steps to configure project:

sudo apt-get install maven

mvn -version

cd /projects root directory

mvn clean install

mvn compile

mvn clean package

java -jar -Dapple.awt.UIElement="true" target/ultron-0.0.1-SNAPSHOT.jar -h

{server}:8888/ultron/config/master/config-prod.json
{server}:8888/ultron/config/master/config-staging.json
{server}:8888/ultron/config/master/config-dev.json
