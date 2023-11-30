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

    |Title|C++|java|
    |-------|-------|-------|
    |Paradigm|Supports procedural and object-oriented programming.|Primarily object-oriented.|
    |Memory Management|Manual memory management with pointers.|Automatic memory management (garbage collection).|
    |Pointers|Supports explicit pointers.|No explicit pointers.|
    |Platform Independence|Platform-specific compilation.|Write once, run anywhere (platform independence through the JVM).|
    |Performance|Generally considered faster due to low-level control.|Slightly slower due to JVM abstraction.|
    |Use Cases| Systems programming, game development, performance-critical applications.| Enterprise applications, web development, mobile (Android) apps.|
    |Community and Ecosystem| Strong community with focus on performance.| Large community, especially in enterprise development.|

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
        - Thread-specific memory for local  variables and method calls.

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