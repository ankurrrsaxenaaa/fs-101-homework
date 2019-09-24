# Day 06

- [ ] Find one example of `SOURCE`, `CLASS`, and `RUNTIME`  annotation in the JDK

- [ ] Create a runtime annotation called `Document` that can be put on classes. The annotation should have an attribute called `collection`  as shown below. Write code that can find all the classes that have `@Document` annotation on them.

   ```java
   @Document(collection="users")
   public class User{}
   ```

- [ ] Implement `ImmutableDate` that is built on top of Date.  The `ImmutableDate` need to have following contract

   ```java
   public class ImmutableDate {
     public ImmutableDate(Date date){}
     public ImmutableDate addYears(int yearsToAdd);
     public ImmutableDate addMonths(int monthsToAdd);
     public ImmutableDate addDays(int daysToAdd);
   }
   ```


Reference: [Link](http://bit.ly/fs101-day06)

# Examples by Annotation Type in JDK

## `SOURCE` Annotation

**`@Override`:**

`@Override` annotation informs the compiler that the element is meant to **overrride** a method declaration in a superclass. If a method is annotated with this annotation type compilers are required to generate an error message unless at least one of the following conditions hold:

-  The method does override or implement a method declared in a supertype. 
-  The method has a signature that is override-equivalent to that of any public method declared in Object. 

```java 
@Target(value=METHOD)
@Retention(value=SOURCE)
public @interface Override
```

## `CLASS` Annotaion








## `RUNTIME` **Annotation**

**`@Deprecated`**

A `@Deprecated` annotation indicates that the marked element is **deprecated** and should no longer be used. The compiler generates a warning whenever a program uses a method, class, or field with the `@Deprecated` annotation. When an element is deprecated, it should also be documented using the Javadoc `@deprecated` tag

```java  
@Documented
@Retention(value=RUNTIME)
@Target(value={CONSTRUCTOR,FIELD,LOCAL_VARIABLE,METHOD,PACKAGE,PARAMETER,TYPE})
public @interface Deprecated
```