                                                                    CORE JAVA
Eclipse - https://www.eclipse.org/downloads/packages/release/oxygen/3a/eclipse-ide-java-ee-developers
Java –  https://download.oracle.com/java/19/latest/jdk-19_windows-x64_bin.exe
JAVA INTRODUCTION
•	Java is a simple programing language
•	Writing, compilation and debugging a program is very easy in java
•	It helps to create reusable code
Java has more features,
1. Platform independent
2. Open source
3. Multithreading
4. More secure
5. Portable
1. Platform independent
•	During the compilation the java program converts into byte code
•	Using byte code we can run the application to any platform such as windows, mac, linux, 
etc
2. Open source:
•	A program in which source code is available to the general public for use and/or modification from its original design at free of cost is called open source
3. Multithreading:
•	Java supports multithreading
•	It enables a program to perform several task simultaneously
4. More secure:
•	It provides the virtual firewall between the application and the computer
•	So it’s doesn't grant unauthorized access
5. Portable:
•	"Write once run anywhere"
•	Java code written in one machine can run on another machine
Terminology:
1. JDK
2. JRE
3. JVM
JDK:
•	Java Development Kit
•	If run any applications we need JDK have to installed
•	JDK versions: 1.0 to 1.9
•	Mostly V1.8 is used now
JRE:
•	Java Runtime Environment
•	It is a pre-defined. class files (i.e.) library files
JVM:
•	Java Virtual Machine
•	It is mainly used to allocate the memory and compiling
TOOLS:
1. Notepad
2. Net bean
3. Eclipse
4. J Developer-oracle
5. RAD-IBM
Nowadays we mostly used eclipse (75% of the people using).
Versions of eclipse:
•	Juno
•	Kepler
•	Luna
•	Mars
•	Neon
OOPS, CONCEPT:
•	Object Oriented Programming Structure
•	OOPS is a method of implementation in which programs are organized as collection of 
•	objects, class and methods
Oops principles are
1. Class
2. Method
3. Object
4. Abstraction
5. Encapsulation
6. Inheritance
7. Polymorphism

CLASS:
 Class is nothing but collection of methods or collection of objects.
•	Project name : Should be in Pascal notation
•	Pascal notation : Each word of the first letter should be in capital
•	src - Source file
•	Class name: Pascal notation
•	Package creation: ex, org.cts.scope-All small letters
Syntax:
(First type class name and click ctrl +space)
public class Bank {
} // Bank is a class name
Public-Access specifier
METHOD:
•	Set of action to be performed 
•	Method name: camel notation
•	Camel notation: First word should be small after every word of the first letter should be capital 
Syntax:
public void bank() {
// Here bank is a method name
 }
Main Method:
public static void main(String[] args) {
}
Main method
OBJECT:
•	Run time memory allocation
•	Using object we call the any methods
Syntax:
(Class name) (Object name) =new (Class name) ();
•	Alignment ctrl + shift+ F
•	 Run  ctrl +F11 main and click ctrl +space
ENCAPSULATION
•	Structure of creating folders

POLYMORPHISM:
•	Poly-many
•	Morphism-forms
•	Taking more than one forms is called polymorphism or one task completed by many ways
It has 2 types,
1.Method overloading(static binding/compile time polymorphism)
2.Method overriding(dynamic binding/run time polymorphism)
1.Method overloading:
Class-same
Method-same
Argument-differ
•	In a same class method name is same and the argument is different is called method overloading the argument is depends on
•	data types
•	data types count
•	data type order
Example Program:
 
}
•	In the same method the argument can't use int and byte because int &byte both are 
•	numbers. so it doesn't work.
•	public void employeeID(int num, byte num2) is not correct
2.Method overriding:
Class name-differ(using extends)
Method-same
Argument- same
•	In a different class , the method name should be same and argument name should be same is called overriding
Example Program:

Program 1: 
public class ICIC {
	public void savings() {
		System.out.println("5%");
	}
	public void fixed() {
		System.out.println("18%");
	}
}


Program 2 :
public class HDFC extends ICIC{
  public void fixed()
  {
	  System.out.println("8%");
	  }
  public void deposite() {
	System.out.println("7%");  
  }

  public static void main(String[] args)
  {
  HDFC bank = new HDFC();
  bank.savings();
  bank.deposite();
  bank.fixed();
  }
}
•	The same method name in both class it take sub class only
•	If we satisfied with super class we go for super class method but we won't satisfy with super class we go for sub class method 
•	We can assign our sub class to our super class but can't reverse

INHERITANCE:
•	We can access one class property into another class using 'extend' keyword and reusable purpose
Child class Sub class
Parent class  Super class
Types:
1. Single Inheritance
2. Multilevel Inheritance
3. Multiple Inheritances
4. Hybrid Inheritance
5. Hierarchical Inheritance
SYNTAX :
Class superclass{
//business logic
}
class subclass extends superclass
{
//logic
}
A B C D  Class 

1. Single Inheritance:
•	One parent class is directly supported into one child class using extend keyword

 
2. Multilevel Inheritance:
•	One child class and more than one parent class
 

3. Multiple Inheritance:
•	More than one parent class parallelly support into one child class but it won't support in 
java because 
1. Priority problem
2. Compilation error/syntax error
 (i.e) if both parent classes have the g same method name it will get a Priority problem so doesn’t work in java
 Parent class  child class  parent class
 

4. Hybrid Inheritance:
•	It is a combination of single and multiple inheritance
 
5. Hierarchical Inheritance:
•	One parent class and more than one child class
 

ABSTRACTION:
 Hiding the implementation part is called abstraction
it has 2 types,
1.Partially abstraction(abstract class)
2.Fully abstraction(interface)


1.Partially Abstraction(Abstract class):

•	It will support abstract method and non-abstract method. 
•	We can’t create object for abstract class because in the method signature we didn't mention any business logic. so
•	In abstract method, we only mention abstract signature, won't create business logic
•	It have 2 class, abstract class(sub class) and superclass. we create object and business logic only in superclass, won't create in abstract class 2. Interface/fully abstraction;
•	It will support only abstract methods, won't support non-abstract method
•	 In the interface "public abstract" is the default. we no need to mention
•	 It using implements keywords

Difference between abstract class and interface
Abstract class:
•	It is partially an abstraction
•	It supports both abstract method and non-abstract method
•	It’s using the "extends" keyword
•	Here "public abstract" have to mention
•	We can use whatever access specifier we want
Interface:
•	It is fully abstraction
•	It support only abstract method
•	It’s using "implement" keyword
•	"public Abstract" is default. no need to mention
•	Here we use only public( access specifier) 

