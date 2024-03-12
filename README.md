# Dmytro Krutenko's SDET Technical Task

### Instructions for setting up the framework

1) Make sure that you have installed valid Java-JDK.

Click **FILE** button in top left corner and select **Project Structure**
from the dropdown or use next Hotkeys:
```
Ctrl+Alt+Shift+S
```

![project_structure.jpg](images%2Fproject_structure.jpg)

Then,click on the drop-down list next to the SDK text

![project_sdk.jpg](images%2Fproject_sdk.jpg)


If you don't have the right version of SDK - please download it from the [Official Oracle Website](https://www.oracle.com/java/technologies/downloads/)
and install it by following this [instruction](https://docs.oracle.com/en/java/javase/21/install/overview-jdk-installation.html#GUID-8677A77F-231A-40F7-98B9-1FD0B48C346A).



2) Click on **MAVEN** in upper right corner of the IDE.
3) Navigate on **install** and press the right mouse button. Then click on **Run Maven Build**.

![maven_install.jpg](images%2Fmaven_install.jpg)

Or you can install it via the command line using this command:

```shell
mvn install
```

It should perform the installation of framework with the necessary tools and run the test. 

### If you want to run test again - please click on this [hyperlink](src/test/java/globallogic/tech/task/SearchFilmTest.java) or navigate to its location manually by following this path:
```
src/test/java/globallogic/tech/task/SearchFilmTest.java
```
