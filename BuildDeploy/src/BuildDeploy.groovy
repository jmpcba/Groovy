/**
 * Created by palacios on 26/3/2017.
 */
class BuildDeploy {

   private String[] envVars(hostName){
       String[] envVars = ["ANT_OPTS=-Xms256m -Xmx256m",
                           "CLIENTSAS=-Dcom.ibm.CORBA.ConfigURL=file:/opt/IBM/ResServices_WebSphere8.5/profiles/$hostName/properties/sas.client.props",
                           "CLIENTSOAP=-Dcom.ibm.SOAP.ConfigURL=file:/opt/IBM/ResServices_WebSphere8.5/profiles/$hostName/properties/soap.client.props",
                           "CLIENTSSL=-Dcom.ibm.SSL.ConfigURL=file:/opt/IBM/ResServices_WebSphere8.5/profiles/$hostName/properties/ssl.client.props",
                           "CLIENT_CONNECTOR_INSTALL_ROOT=/opt/IBM/ResServices_WebSphere8.5/profiles/$hostName/installedConnectors",
                           "CONFIG_ROOT=/opt/IBM/ResServices_WebSphere8.5/profiles/$hostName/config",
                           "ITP_LOC=/opt/IBM/ResServices_WebSphere8.5/deploytool/itp",
                           "JAVA_HOME=/opt/IBM/ResServices_WebSphere8.5/java_1.8_64",
                           "LD_LIBRARY_PATH=/db/app/oracle/product/11.2.0/instantclient_11_2:",
                           "ORACLE_HOME=/db/app/oracle/product/11.2.0/instantclient_11_2",
                           "OSGI_CFG=-Dosgi.configuration.area=/opt/IBM/ResServices_WebSphere8.5/profiles/$hostName/configuration",
                           "OSGI_INSTALL=-Dosgi.install.area=/opt/IBM/ResServices_WebSphere8.5",
                           "PATH=/opt/IBM/ResServices_WebSphere8.5/java/ibm_bin:/opt/IBM/ResServices_WebSphere8.5/java/bin/:/opt/IBM/ResServices_WebSphere8.5/java/jre/bin:/ibm_bin:/bin/:/jre/bin:/db/app/oracle/product/11.2.0/instantclient_11_2/bin:/usr/kerberos/bin:/usr/local/bin:/bin:/usr/bin:/opt/r/bin:/opt/accurev/bin:/db/app/oracle/product/11.2.0/instantclient_11_2:/home/aacorncm/bin:/home/aacorncm/bin/funcs:/sbin:/usr/sbin:/usr/local/sbin:/home/aacorncm/jenkins:/home/aacorncm/apache-maven-2.2.1/bin:/home/aacorncm/sonar/sonar-3.5/bin:/home/aacorncm/sonar/sonar-runner-2.0/bin:/opt/IBM/ResServices_WebSphere8.5/bin:/db/app/oracle/product/11.2.0/instantclient_11_2:/home/aacorncm/bin:/home/aacorncm/bin/funcs:/sbin:/usr/sbin:/usr/local/sbin:/home/aacorncm/jenkins:/home/aacorncm/apache-maven-2.2.1/bin:/home/aacorncm/sonar/sonar-3.5/bin:/home/aacorncm/sonar/sonar-runner-2.0/bin:/opt/IBM/ResServices_WebSphere8.5/bin', 'SERVERSAS=-Dcom.ibm.CORBA.ConfigURL=file:/opt/IBM/ResServices_WebSphere8.5/profiles/`hostname`/properties/sas.server.props', 'STDINCLIENTSAS=-Dcom.ibm.CORBA.ConfigURL=file:/opt/IBM/ResServices_WebSphere8.5/profiles/$hostName/properties/sas.stdinclient.props",
                           "TNS_ADMIN=/db/app/oracle/product/11.2.0/instantclient_11_2/network/admin",
                           "WASPROFILE=ResServices_WebSphere8.5",
                           "WAS_CELL=ResServicesCell",
                           "WAS_CLASSPATH=:/opt/IBM/ResServices_WebSphere8.5/properties:/opt/IBM/ResServices_WebSphere8.5/lib/startup.jar:/opt/IBM/ResServices_WebSphere8.5/lib/bootstrap.jar:/opt/IBM/ResServices_WebSphere8.5/lib/lmproxy.jar:/opt/IBM/ResServices_WebSphere8.5/lib/urlprotocols.jar:/opt/IBM/ResServices_WebSphere8.5/java/lib/tools.jar:/opt/IBM/ResServices_WebSphere8.5/lib/j2ee.jar",
                           "WAS_ENDORSED_DIRS=//endorsed_apis:/jre/lib/endorsed', 'WAS_EXT_DIRS=/opt/IBM/ResServices_WebSphere8.5/java/lib:/opt/IBM/ResServices_WebSphere8.5/classes:/opt/IBM/ResServices_WebSphere8.5/lib:/opt/IBM/ResServices_WebSphere8.5/installedChannels:/opt/IBM/ResServices_WebSphere8.5/lib/ext:/opt/IBM/ResServices_WebSphere8.5/web/help:/opt/IBM/ResServices_WebSphere8.5/deploytool/itp/plugins/com.ibm.etools.ejbdeploy/runtime",
                           "WAS_HOME=/opt/IBM/ResServices_WebSphere8.5",
                           "WAS_LIBPATH=/opt/IBM/ResServices_WebSphere8.5/lib/native/linux/x86_64/:/opt/IBM/ResServices_WebSphere8.5/bin",
                           "WAS_LOGGING=-Djava.util.logging.manager=com.ibm.ws.bootstrap.WsLogManager -Djava.util.logging.configureByServer=true",
                           "WAS_USER_SCRIPT=/opt/IBM/ResServices_WebSphere8.5/profiles/`hostname`/bin/setupCmdLine.sh",
                           "WAS_USER_SCRIPT_FILE_NOT_EXISTS=false"]
       return envVars

    }

    def build(hostName){
        withEnv(envVars(hostName)){
            //INTRSUCTIONS HERE
        }
    }

}
