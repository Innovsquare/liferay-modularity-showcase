# Sample DS Portlet
Sample Portlet bundle using OSGi Declarative Services


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

## Run the application:

2) run the following maven command in order to deploy the bundle to the Liferay OSGi container:

mvn clean package -Pliferay7.0-M6

3) check the portlet deployment: login in Liferay then check the portlet under Sample category:

![Check portlet deployment](/com.innovsquare.showcase.portlet.sample/screenshots/24.png?raw=true "Check portlet deployment")

