# User login tracker service hook
A sample of Liferay service hook using OSGi Declarative Services


## Configuration

1) add <liferay.home> to your maven profile (location of the Liferay server):
	
	<profiles> 
	...
	 <profile>
			<id>liferay7.0-M6</id>
            <properties>
				<liferay.home>/Labs/Liferay/Servers/liferay-portal-7.0-ce-m6</liferay.home>
            </properties>	
	 </profile>
	
	</profiles>

## Run the hook:
  
2) perform the following maven command in order to deploy the bundle to the Liferay OSGi container:

mvn clean package -Pliferay7.0-M6

3) check the deployment: sign in Liferay then check the logs:

![Check hook deployment](/com.innovsquare.showcase.hook.userlogintracker/screenshots/35.png?raw=true "Check hook deployment")

