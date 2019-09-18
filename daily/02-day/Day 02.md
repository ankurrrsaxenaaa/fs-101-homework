# **Day 02 Questions**

- Find one programming language that is dynamically typed and compiled
-  Find one programming language that is statically typed and interpreted
-  What is the difference between binary compatibility and source compatibility? Is Java binary compatible or source compatible?
-  How will you decide whether you need to create an interface or an abstract class?
-  Write a Java function that takes a positive integer greater than 0 and generate a sequence that follow rules:
  - If the current number is even then it divides by two else if is odd it multiplies by three and add one
  - It stops if number is 1

```java
For example, if I give number 3 then I should get [10, 5, 16, 8, 4, 2, 1] 

When number is 4 I get [2,1]

When number is 7 I get [22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1]

```

**Reference slide:** [Link](http://bit.ly/fs101-day02)

# **A programming language that is dynamically typed and compiled**

## **Julia** 

Julia a **high-level programming language** designed for high-performance **numerical analysis** and **computational science**. 

#### **Features**

* At its core it has **Multiple Dispatch** which means it has the ability to define function behavior across many combinations of argument types.

* It is **dynamically typed**.

* Its code can be **statically compiled** and can be deployed on a web server as well.

* It has a built in **package manager**. 

* User-defined types are as fast and compact as built-ins.

#### **Notable uses**


* It is being used by an investment management corporation called **BlackRock**. They use it mostly for **time-series analytics**.
* It has also been used by **AVIVA**, which is an insurance company. It uses Julia for **risk calculation**.
* Another notable use is by **Federal Reserve Bank of New York** which uses it for making models of the US economy.




# **A programming language that is statically typed and interpreted**

## **Haskell**

Haskell is a **statically typed**, purely **functional programming language** with **type inference** and **lazy evaluation**.

#### **Features**

- It features **lazy evaluation** which is a strategy that delays the evaluation of an expression until its value is needed non-strict evaluation and which also avoids repeated evaluations.
- It has a strong, **static type** system.
- It is an **interpreted** language.

#### **Notable uses**

- **Facebook** implements its anti-spam programs in Haskell.
- **Swift Navigation**  implements significant portions of its product in Haskell.

# **Binary Compatibility vs Source Compatibility**

**Binary Compatibility** means that when something is updated, we continue to work without needing to even recompile.

Whereas **Source Compatibility** means that we need to recompile to keep things working, but we don't have to actually change the sources. 

For **Java** programs, there are three main categories of compatibility:

1. **Source:** Source compatibility concerns translating Java source code into class files.
2. **Binary:** Binary compatibility is defined in The Java Language Specification(JLS) as preserving the ability to link without error.
3. **Behavioral:** Behavioral compatibility includes the semantics of the code that is executed at runtime.

# **When to create Interfaces or Abstract Classes**

Whether to choose between Interface or abstract class for providing a contract for subclasses is a design decision and depends on many factors. A **contract** is an agreement that the class will expose certain methods, certain properties, and certain behaviors. Following are some points to consider while choosing whether Interfaces are the better choice over abstract classes and vice versa.

1. Java doesn’t support multiple class level inheritance, so every **class can extend only one superclass**. But a **class can implement multiple interfaces**. So most of the times Interfaces are a good choice for providing the base for class hierarchy and contract. Also coding in terms of interfaces is one of the best practices for coding in java.
2. If there are a **lot of methods in the contract, then abstract class is more useful** because we can provide a default implementation for some of the methods that are common for all the subclasses. Also if subclasses don’t need to implement a particular method, they can avoid providing the implementation but **in case of interface**, the **subclass will have to provide the implementation for all the methods** even though it’s of no use and implementation is just empty block.
3. If our **base contract keeps on changing** then **interfaces can cause issues** because we can’t declare additional methods to the interface without changing all the implementation classes, with the abstract class we can provide the default implementation and only change the implementation classes that are actually going to use the new methods.



# **A Java function that takes a positive integer greater than 0 and generate a sequence that follow rules:**

- If the current number is even then it divides by two else if is odd it multiplies by three and add one
- It stops if number is 1

## **Answer**

The sequence can be identified as the **Hailstone Sequence**. Following can be implemented to get the required result:

```java
public static ArrayList<Integer> GenerateHailstoneSequence(int number){
   ArrayList<Integer> hailstoneSequence = new ArrayList<Integer>();
    while(true){
        if(number==1){
            break;
        }
        else if(number%2==0){
            number = number / 2;
        	hailstoneSequence.add(number);
        }else{
            number = (number * 3) + 1;
            hailstoneSequence.add(number);
        }
    }
    return hailstoneSequence;
}
```

