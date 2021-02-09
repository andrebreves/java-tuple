# java-tuple

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.andrebreves/java-tuple/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.andrebreves/java-tuple)

Yet another Tuple library for Java 8 and up.

# Maven

Add to ```pom.xml```:

```xml
<dependencies>
    <dependency>
        <groupId>com.andrebreves</groupId>
        <artifactId>java-tuple</artifactId>
        <version>2.0.0-SNAPSHOT</version>
    </dependency>
</dependencies>
```

# Usage

Java 8:

```java
Tuple2<String, String> tuple = Tuple.of("v01", "v02");
System.out.println(tuple.v1()); // "v01"
System.out.println(tuple.v2()); // "v02"

Tuple3<String, String, String> newTuple = tuple.concat("v03");
System.out.println(newTuple.v1()); // "v01"
System.out.println(newTuple.v2()); // "v02"
System.out.println(newTuple.v3()); // "v03"

List<Tuple3<String, Integer, String>> tuples = Arrays.asList(
    Tuple.of("v10", 11, "v12"),
    Tuple.of("v20", 21, "v22"),
    Tuple.of("v30", 31, "v32")
);

tuples.stream()
    .map(Tuple::v3)
    .forEachOrdered(System.out::print); // "v12v22v32"
```

Java 10 and up:

```java
var tuple = Tuple.of("v01", "v02");
System.out.println(tuple.v1()); // "v01"
System.out.println(tuple.v2()); // "v02"

var newTuple = tuple.concat("v03");
System.out.println(newTuple.v1()); // "v01"
System.out.println(newTuple.v2()); // "v02"
System.out.println(newTuple.v3()); // "v03"

var tuples = List.of(
    Tuple.of("v10", 11, "v12"),
    Tuple.of("v20", 21, "v22"),
    Tuple.of("v30", 31, "v32")
);

tuples.stream()
    .map(Tuple::v3)
    .forEachOrdered(System.out::print); // "v12v22v32"
```
