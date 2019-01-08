# Apache Axis2 User's Guide - Creating Clients

## Choosing a Client Generation Method
Three of these options are Axis2 DataBinding Framework, XMLBeans, and JiBX databinding.

## Generating Clients
Code Listing 5 - Generating Clients from the WSDL File
http://axis.apache.org/axis2/java/core/docs/userguide-codelisting5.html

## Axis Data Binding (ADB)
sh /opt/axis2-1.7.9/bin/wsdl2java.sh  -uri Axis2UserGuide.wsdl -p org.apache.axis2.axis2userguide -d adb -s
Using AXIS2_HOME: /opt/axis2-1.7.9
Using JAVA_HOME:  /opt/jdk1.8.0_172
Retrieving document at 'Axis2UserGuide.wsdl'.
