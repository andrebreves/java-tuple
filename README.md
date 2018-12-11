# java-tuple
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.andrebreves.java/java-tuple/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.andrebreves.java/java-tuple)

Yet another Tuple library for Java 8 and up.

Maven
=====
Add to ```pom.xml```:
```xml
<dependencies>
    <dependency>
        <groupId>com.andrebreves.java</groupId>
        <artifactId>java-tuple</artifactId>
        <version>1.0.0</version>
    </dependency>
</dependencies>
```

Usage
=====

Java 8:
```java
Tuple3<String, String, String> tuple = Tuple.of("v01", "v02", "v03");
System.out.println(tuple.v1()); // "v01"
System.out.println(tuple.v3()); // "v03"

List<Tuple3<String, Integer, String>> list = Arrays.asList(
    Tuple.of("v10", 11, "v12"),
    Tuple.of("v20", 21, "v22"),
    Tuple.of("v30", 31, "v32")
);

list.stream()
    .map(Tuple::v3)
    .forEachOrdered(System.out::print); // "v12v22v32"
```

Java 10:
```java
var tuple = Tuple.of("v01", "v02", "v03");
System.out.println(tuple.v1()); // "v01"
System.out.println(tuple.v3()); // "v03"

var list = List.of(
    Tuple.of("v10", 11, "v12"),
    Tuple.of("v20", 21, "v22"),
    Tuple.of("v30", 31, "v32")
);

list.stream()
    .map(Tuple::v3)
    .forEachOrdered(System.out::print); // "v12v22v32"
```
