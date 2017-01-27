This project is a example how to build a library based maven-shade-plugin.
The test call methods of libraries and each one must return correct version which used in yours libraries.

my-system is a project to use libraries poi-1.0.jar and my-mpxj-16.jar.
my-mpxj-16.jar is a library that create based maven-shade-plugin with poi-2.0.jar and mpxj-0.0.16.jar.
mpxj-0.0.16.jar represent a library of the MS Project 2016 which depends poi-2.0.jar.
poi-2.0.jar represent a library of the MS Office 2016.
poi-1.0.jar represent a library of the older MS Office.

The objective is update mpxj library without update poi-1.0 that used in my-system project. How new mpxj depends poi-2.0, could be used wrong features if mpxj used poi-1.0 library.

Reference of Mpxj and your dependencies
http://mpxj.sourceforge.net/
https://mvnrepository.com/artifact/net.sf.mpxj/mpxj

Reference to create and test this project
https://www.elastic.co/blog/to-shade-or-not-to-shade

Reference to add my library in local maven repository
http://www.mkyong.com/maven/how-to-include-library-manully-into-maven-local-repository/
mvn install:install-file -Dfile=[...]\maven-shade-plugin-example\poi\target\poi-1.0.jar -DgroupId=br.com.tuboi.msoffice -DartifactId=poi -Dversion=1.0 -Dpackaging=jar
mvn install:install-file -Dfile=[...]\maven-shade-plugin-example\poi\target\poi-2.0.jar -DgroupId=br.com.tuboi.msoffice -DartifactId=poi -Dversion=2.0 -Dpackaging=jar
mvn install:install-file -Dfile=[...]\maven-shade-plugin-example\mpxj\target\mpxj-0.0.16.jar -DgroupId=br.com.tuboi.msproject -DartifactId=mpxj -Dversion=0.0.16 -Dpackaging=jar
