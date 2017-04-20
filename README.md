# Java reflection utilities (Beta).

Using it you now can scan your classpath, get resources, classes, fields, methods and constructors filtered by your predicates.

It's immutable, fluent, simple, inspired by Guava [ClassPath](https://github.com/google/guava/blob/master/guava/src/com/google/common/reflect/ClassPath.java) and [reflections](https://github.com/ronmamo/reflections).

### Maven

```xml
<dependency>
    <groupId>io.ytcode</groupId>
    <artifactId>reflect</artifactId>
    <version>0.1.0</version>
</dependency>
```

### Usage

```java
for (Resource r : Resources.scan("/io/ytcode/").suffix(".xml").get()) {
  System.out.println(r.name());
}
```

```java
Classes classes = Resources.scan("/").classes();
for (Class<?> c : classes.subTypeOf(Supplier.class).annotatedWith(SomeAnnotation.class).get()) {
  System.out.println(c);
}
```

```java
ImmutableSet<Field> fields = classes.fields().annotatedWith(SomeAnnotation.class).filter(new Predicate<Field>() {...}).get();
ImmutableSet<Method> methods =classes.methods().filter(new Predicate<Method>() {...}).get();
ImmutableSet<Constructor<?>> constructors = classes.constructors().filter(new Predicate<Constructor<?>>() {...}).get();
```

### TODO

- Better Doc
- More Tests
- More user friendly APIs

### License

Reflect is licensed under the open-source [Apache 2.0 license](LICENSE).