# Java Data Types - Notes

## Primitive Data Types

- **byte**: Used for storing 8-bit integer values with a range of -128 to 127.
- **short**: Stores 16-bit integer values with a range of -32,768 to 32,767.
- **int**: Used to store 32-bit integer values with a range of -2^31 to 2^31 - 1.
- **long**: Stores 64-bit integer values with a range of -2^63 to 2^63 - 1.
- **float**: Used for single-precision floating-point numbers with a range of approximately ±3.40282347E+38F and 7-digit precision.
- **double**: Stores double-precision floating-point numbers with a range of approximately ±1.79769313486231570E+308 and 15-digit precision.
- **char**: Used to store a single 16-bit Unicode character with a range from 0 to 65,535.
- **boolean**: Stores true or false values.

## Reference Data Types

- **String**: Used to store a sequence of characters.
- **Arrays**: Used to store multiple elements of the same type.
- **Classes**: Custom classes created by the user.

## Default Values

- Numeric data types (byte, short, int, long, float, and double) default to 0.
- `char` defaults to '\u0000' (null character).
- `boolean` defaults to false.
- Reference data types (String, Arrays, and custom classes) default to null.

## Example Usage

```java
public class DataTypesExample {
    public static void main(String[] args) {
        int age = 30;
        double height = 1.75;
        char grade = 'A';
        boolean isStudent = true;
        String name = "John Doe";
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Numbers: " + Arrays.toString(numbers));
    }
}

```
## Java Constructor - Notes

In Java, a constructor is a special type of method used for initializing objects. It is called automatically when an object is created using the `new` keyword. Constructors have the same name as the class they belong to and do not have a return type, not even `void`.

## Default Constructor

If a class does not explicitly define any constructors, Java provides a default constructor with no arguments. It initializes the object with default values (numeric types to 0, booleans to `false`, and object references to `null`).

```java
public class MyClass {
    // Default constructor (automatically provided if not explicitly defined)
}
```

### Parameterized Constructor
Developers often define parameterized constructors to set initial values for the object's attributes during object creation.

```java
public class Employee {
    private String name;
    private int age;

    // Parameterized constructor
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

```

### Constructor Overloading
Java supports constructor overloading, which means you can have multiple constructors in the same class with different parameter lists.
```java
public class Rectangle {
    private int width;
    private int height;

    // Parameterized constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Default constructor with width and height set to 1
    public Rectangle() {
        this(1, 1);
    }
}

```

### 'this' Keyword in Constructors
Within a constructor, the this keyword refers to the current object being initialized. It is often used to differentiate between the constructor's parameters and the class's instance variables.

```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name; // Using 'this' to refer to instance variable
        this.age = age;   // Using 'this' to refer to instance variable
    }
}

```
### Chaining Constructors
Java allows constructor chaining, where one constructor can call another using the this keyword

```java
public class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(String make) {
        this(make, "Unknown"); // Chaining to the parameterized constructor
    }
}

```