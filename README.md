# Frostylight
Frostylight is a shared java library that can be use to configure the selenium element highlighter and step descriptor. Selenium element highlighter can highlight the element during the execution of selenium test script and step descriptor can display the message in a container on the web page while executing the test script. User can modify the style of the highlighter as well as can use the custom colors in both element highlighter and step descriptor.

### Starting the test:
 * **Step1**: Change the chromedriver path in FrostylightData.java file.
 * **Step2**: Execute the test by using below command.
 ```
                                             mvn clean test
 ```

### Installation
You need to have Java 1.8 or higher. Add the below dependency in your maven POM file.
```
<dependency>
 <groupId>com.github.frostyaxe</groupId>
 <artifactId>frostylight</artifactId>
 <version>1.0</version>
</dependency>
```

### Usage
