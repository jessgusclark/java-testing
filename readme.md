# Readme   

A test repository for learning java, JUnit and design patterns within Eclipse.

## Resources 
* http://www.vogella.com/tutorials/JUnit/article.html

## Testing from the command line on CSU machines

This worked for cs414.a1.

### Add JUnit and Testing to the CLASSPATH:

Java classes are located here: `/usr/share/java/`

```
$ export CLASSPATH="$CLASSPATH:/usr/share/java/junit.jar"
```

### Compile files

```
$ javac -d ./build *.java
```

### Test fils

```
$ cd build
$ java -cp /usr/share/java/junit.jar:/usr/share/java/hamcrest/core.jar:. org.junit.runner.JUnitCore cs414.a1.gusclark.TestAll
```

References:

* http://stackoverflow.com/questions/9941296/how-do-i-make-a-jar-from-a-java