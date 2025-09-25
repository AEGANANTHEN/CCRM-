CCRM (Campus Course & Records Manager)
📘 Project Overview

CCRM is a Java-based console application designed to manage student records and courses. It offers a menu-driven interface to:

Add, update, delete, and view student and course data

Demonstrate Object-Oriented Programming (OOP) principles

Utilize file handling for data persistence

▶️ How to Run

JDK Version: Ensure you have JDK 17 or higher installed.

Clone the Repository:

git clone https://github.com/AEGANANTHEN/CCRM-
cd CCRM-


Compile and Run:

javac *.java
java Main


Alternatively, if using Eclipse:

Import the project into Eclipse.

Right-click Main.java → Run As → Java Application.

🧬 Evolution of Java

1991: Java was initiated at Sun Microsystems as "Oak".

1995: Renamed to Java and released as JDK 1.0.

1997: JDK 1.1 introduced inner classes, JavaBeans, and RMI.

2004: JDK 5.0 introduced generics, metadata annotations, and the enhanced for-loop.

2017: JDK 9 introduced the module system.

2021: JDK 17 became the latest Long-Term Support (LTS) release.

⚖️ Java ME vs SE vs EE
Edition	Purpose	Use Cases
SE	Core Java libraries and APIs	Desktop applications, utilities
EE	Enterprise-level applications	Web apps, enterprise systems
ME	Mobile and embedded devices	Mobile apps, IoT devices

Note: Java ME is now largely replaced by Android development.

🧱 JDK vs JRE vs JVM

JDK (Java Development Kit): A full-featured software development kit for Java, including JRE and development tools like compilers.

JRE (Java Runtime Environment): Provides libraries, Java Virtual Machine (JVM), and other components to run applications written in Java.

JVM (Java Virtual Machine): Executes Java bytecode and provides platform independence.

Source: IBM

🖥️ Windows Installation Steps

Download JDK: Visit the Oracle JDK download page
 and download the installer for Windows.

Run Installer: Execute the downloaded .exe file and follow the installation prompts.

Set Environment Variables:

Open System Properties → Advanced → Environment Variables.

Under "System Variables", click "New":

Variable Name: JAVA_HOME

Variable Value: Path to your JDK installation (e.g., C:\Program Files\Java\jdk-17)

Find the Path variable in "System Variables", click "Edit", and add the following:

%JAVA_HOME%\bin

Verify Installation:

java -version
javac -version


Note: For detailed steps, refer to GeeksforGeeks
.

🧰 Eclipse Setup Steps

Download Eclipse: Visit the Eclipse Downloads page
 and download "Eclipse IDE for Java Developers".

Install Eclipse: Run the installer and follow the setup instructions.

Import Project:

Open Eclipse.

Go to File → Import → Existing Projects into Workspace.

Browse to the cloned CCRM- directory and select it.

Run the Application:

Right-click Main.java → Run As → Java Application.

Note: For detailed steps, refer to GeeksforGeeks
.

🗂️ Mapping Table: Syllabus Topics → Code Implementation
Syllabus Topic	File/Class/Method Demonstrated
OOP Concepts	Student.java, Course.java
File Handling	StudentService.java
Menu-Driven Interface	Main.java
✅ Enabling Assertions in Java

Assertions help in debugging by testing assumptions made in the code.

Enable Assertions:

java -ea Main


Enable Assertions for Specific Class:

java -ea:Main Main


Enable Assertions for Specific Package:

java -ea:com.myapp... Main


Source: Stack Overflow
