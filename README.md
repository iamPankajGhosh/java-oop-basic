# Java and Object-Oriented Programming (OOP):

## Set Up Your Development Environment:

- Download and install the Java Development Kit (JDK) from the official Oracle website

- Choose an Integrated Development Environment (IDE) such as Eclipse or Visual Studio Code for a smoother coding experience.

## Basics of Java:

- ### What is Java?

  Java is a widely used, high-level, object-oriented programming language developed by Sun Microsystems (now owned by Oracle).

- ### History of Java

  It was first released in 1995 and has since become one of the most popular programming languages in the world. Java is known for its platform independence, meaning that Java programs can run on any device or platform that has a Java Virtual Machine (JVM) installed.

- ### Features of Java

  Here are some key features of Java:

  - #### Object-Oriented:

    Java follows the principles of object-oriented programming (OOP), which includes concepts like classes, objects, inheritance, and polymorphism.

  - #### Platform Independence :

    Java applications are compiled into an intermediate form called bytecode, which can be executed on any device or operating system with a compatible JVM. This "write once, run anywhere" philosophy is a key advantage of Java.

  - #### Security:

    Java has built-in security features to protect systems from harmful activities. The JVM includes a security manager and various APIs to create secure applications.

  - ### Rich Standard Library:

    Java supports multithreading, allowing developers to write programs that can perform multiple tasks simultaneously. This is useful for creating responsive and efficient applications.

  - ### Automatic Memory Management:

    Java uses a garbage collector to automatically manage memory, helping developers avoid memory leaks and making memory management more convenient.

  - ### Community Support:

    Java has a large and active community of developers, which means extensive resources, documentation, and third-party libraries are available.

  - ### Versatility:

    Java is used in a variety of applications, from desktop and web applications to mobile development (Android applications), enterprise systems, and large-scale distributed systems.

- ## C++ vs Java

  | Title                   | C++                                                                       | java                                                              |
  | ----------------------- | ------------------------------------------------------------------------- | ----------------------------------------------------------------- |
  | Paradigm                | Supports procedural and object-oriented programming.                      | Primarily object-oriented.                                        |
  | Memory Management       | Manual memory management with pointers.                                   | Automatic memory management (garbage collection).                 |
  | Pointers                | Supports explicit pointers.                                               | No explicit pointers.                                             |
  | Platform Independence   | Platform-specific compilation.                                            | Write once, run anywhere (platform independence through the JVM). |
  | Performance             | Generally considered faster due to low-level control.                     | Slightly slower due to JVM abstraction.                           |
  | Use Cases               | Systems programming, game development, performance-critical applications. | Enterprise applications, web development, mobile (Android) apps.  |
  | Community and Ecosystem | Strong community with focus on performance.                               | Large community, especially in enterprise development.            |

- ## Hello Java Program

  Here's a simple "Hello, Java!" program in java

  ```
  public class HelloWorld {
      public static void main(String[] args) {
          System.out.println("Hello, Java!");
      }
  }
  ```

- ## Internal How to set the path?

  - ### Find the Path to Your Java Installation:

    Locate the directory where Java is installed. This is typically something like C:\Program Files\Java\jdk<version> for the JDK or C:\Program Files\Java\jre<version> for the JRE.

  - ### Copy the Path:

    Copy the path to the "bin" directory inside the Java installation directory (e.g., C:\Program Files\Java\jdk-<version>\bin).

  - ### Set the PATH Environment Variable:

    - Right-click on "This PC" or "Computer" on your desktop or in File Explorer.
    - Choose "Properties" -> "Advanced system settings" -> "Environment Variables."
    - In the "System variables" section, select the "Path" variable and click "Edit."
    - Add a new entry with the copied path to the "bin" directory.

  - ### Verify the Setup:
    Open a new Command Prompt and type java -version and javac -version to verify that the Java executable is recognized.

- ## JDK, JRE, and JVM (Java Virtual Machine)

  - ### JDK (Java Development Kit):

    Used by developers for Java application development; includes compilers, debuggers, and the JRE.

  - ### JRE (Java Runtime Environment):

    Required by end-users to run Java applications; includes the JVM and libraries.

  - ### JVM (Java Virtual Machine):
    Executes Java bytecode, providing platform independence; manages memory and ensures security during runtime.

- ## JVM Memory Management

  - ### Heap Memory:

    - Allocates and manages objects.
    - Young Generation (Eden, Survivor spaces) and Old Generation.

  - ### Stack Memory:

    - Thread-specific memory for local variables and method calls.

  - ### Method Area (Metaspace):

    - Stores class metadata, static variables, and method information.

  - ### Garbage Collection:

    - Reclaims memory from unused objects.
    - Young Generation, Old Generation, occasional Full GC.

  - ### Automatic Memory Management:

    - Garbage Collector identifies and reclaims memory automatically.

  - ### Tuning and Configuration:

    - Developers can configure JVM memory settings and garbage collection parameters.

  - ### Out of Memory (OOM):
    - Occurs when JVM can't allocate enough memory.
    - Causes include memory leaks and insufficient heap size.

- ## Internal Details of JVM

  - ### Class Loader Subsystem:

    Loads classes dynamically into memory.

  - ### Runtime Data Areas:

    Method Area (Metaspace), Heap (Young and Old Generation), Stack, PC Registers.

  - ### Execution Engine:

    Interpreter reads bytecode, JIT Compiler translates to native code.

  - ### Garbage Collection:

    Automatic memory management with Generational GC (Young and Old Generation).

  - ### Execution Monitoring and Profiling:
    Tools like jconsole and Java Flight Recorder for monitoring and profiling.
  - ### Native Interface:

    JNI allows integration with native code (e.g., C/C++).

  - ### Security:

    Security Manager enforces policies, Access Controller controls resource access.

  - ### Thread Management:

    JVM manages Java Threads for concurrent execution.

  - ### Exception Handling:

    Throwable class hierarchy for exception and error handling.

  - ### Java Native Interface (JNI):
    Allows interaction with applications written in other languages.

- ## Unicode System:

  Unicode is a character encoding standard that represents most of the world's written languages. It assigns a unique code to each character regardless of the platform or program.

- ## Operators:

  - ### Arithmetic Operators:

    "+" (addition), - (subtraction), \* (multiplication), / (division), % (modulo).

  - ### Comparison Operators:

    == (equal to), != (not equal to), < (less than), > (greater than), <= (less than or equal to), >= (greater than or equal to).

  - ### Logical Operators:

    && (logical AND), || (logical OR), ! (logical NOT).

  - ### Assignment Operators:
    = (assign), +=, -=, \*=, /=, %=.

- ## Keywords:

  Words that have a special meaning in the language and cannot be used as identifiers.

  Examples: int, if, else, switch, for, while, break, continue, return, class, public, static, etc.

- ## Control Statements:

  If-Else:

  ```
    if (condition) {
        // Code to execute if the condition is true
    } else {
        // Code to execute if the condition is false
    }
  ```

  Switch:

  ```
  switch (expression) {
    case value1:
        // Code to execute if expression equals value1
        break;
    case value2:
        // Code to execute if expression equals value2
        break;
    // ... more cases ...
    default:
        // Code to execute if expression doesn't match any case
    }
  ```

  For Loop:

  ```
    for (initialization; condition; update) {
        // Code to repeat as long as the condition is true
    }
  ```

  While Loop:

  ```
     while (condition) {
        // Code to repeat as long as the condition is true
    }
  ```

## Class, Objects, and Types of Classes

- ### Naming conventions of Java

  - #### Package Names:
    Should be in lowercase.
    Follow a reversed domain name pattern, e.g., com.example.myproject.
  - #### Class and Interface Names:
    Should start with an uppercase letter.
    Use camelCase, e.g., MyClass, MyInterface.
  - #### Method Names:
    Should start with a lowercase letter.
    Use camelCase, e.g., calculateTotal, getUserInfo.
  - #### Variable Names:
    Should start with a lowercase letter.
    Use camelCase, e.g., myVariable, totalAmount.
  - #### Constants:
    Should be in uppercase letters.
    Use underscores to separate words, e.g., MAX_SIZE, PI.
  - #### Enum Types:
    Should follow the same conventions as class names.
    Enum constants should be in uppercase letters, separated by underscores.
  - #### Method Parameters:
    Should start with a lowercase letter.
    Use camelCase, e.g., calculateArea(int radius).
  - #### Local Variables:
    Should start with a lowercase letter.
    Use camelCase, e.g., count, result.
  - #### Boolean Variables and Methods:
    Should start with "is," "has," or similar prefixes.
    Use camelCase, e.g., isEnabled(), hasPermission().
  - #### Acronyms and Abbreviations:
    Acronyms should be treated as words, e.g., URL, XML.
    Abbreviations should be avoided or used sparingly.
  - #### Packages and Classes for Testing:
    For test classes, it's common to use the same name as the class being tested followed by "Test," e.g., MyClassTest.
  - #### File Names:
    Should match the name of the public class or interface defined in the file.
    Use camelCase for file names, e.g., MyClass.java.

- ### Classes:

  A class is a blueprint or a template for creating objects.
  It defines the properties (attributes) and behaviors (methods) that the objects of the class will have.

  - #### Properties (Attributes):

    Represent characteristics or data associated with objects.
    Example: In a Car class, properties could include model, color, and year.

  - #### Methods (Behaviors):

    Define actions or operations that objects of the class can perform.
    Example: In a Car class, methods could include startEngine(), accelerate(), and brake().

  - #### Constructor:

    Special method used for initializing objects when they are created.
    Often used to set initial values for object properties.

  - #### Encapsulation:

    Bundling of data (attributes) and methods that operate on the data within a single unit (class).
    Access modifiers control the visibility of members (public, private, protected).

- ### Objects:

  - #### Definition:

    An object is an instance of a class.
    It is a real-world entity that can be identified and manipulated in a program.

  - #### Instantiation:

    The process of creating an object from a class.
    Example: Car myCar = new Car();

  - #### Attributes:

    The properties of an object hold specific values.

    Example: myCar.model = "Toyota";

  - #### Methods:
    Objects can perform actions through methods.
    Example: myCar.startEngine();
