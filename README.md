#Java demo application for the Azure partner DevCamp 2016-2017

This application uses the Spring boot framework.

To build and run, install the Java JDK8 and the gradle build tool.

```
git clone
cd devcamp
```

then to build and run the sample:

`gradle bootRun`

to create a WAR file for deployment to Tomcat on Azure Web Apps:

`gradle war`

The application needs some configuration to run properly.  These environment variables need to be set in the operating system:
```
set AZURE_STORAGE_ACCESS_KEY=<your storage access key>
set AZURE_STORAGE_ACCOUNT=<your storage account>
set AZURE_STORAGE_BLOB_CONTAINER=<your storage container name>
set AZURE_STORAGE_QUEUE=<your storage queue name>
set INCIDENT_API_URL=<the complete hostname for the incident api>
set REDISCACHE_HOSTNAME=<redis cache host name>
set REDISCACHE_PORT=<redis cache port>
set REDISCACHE_PRIMARY_KEY=<redis cache key>
set REDISCACHE_SSLPORT=<redis cache ssl port>
```
