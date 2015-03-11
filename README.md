RayTracer
=========

This is a raytracer project implemented in Java.
There are currently three branches in the project. Master, gui and core_improvement.
In order to run the gui based RayTracer clone the gui branch and build it using maven.
Maven 2 or above is needed. Also `Oracle JDK 7.0` or above must be available in your system.
Use the command `mvn package -Dmaven.test.skip=true` to build the project witouht running 
tests since some tests are currently failing (work is ongoing to fix them).

You will have two packages under target directory after a successful build.
If you are in MS Windows or some unkown OSs then choose the package with dependencies.
Run it by the command `java -jar PACKAGE_NAME`.
From the gui windown select a xml file under `${basedir}/src/main/resources/ppm` 
folder and hit `Trace the scene` button very hard!

