public class StaticMethodDemo {

}

class MathUtils {
    // A static method to calculate the square of an integer
    public static int square(int num) {
        return num * num;
    }

    // Another static method to calculate the factorial of an integer
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

class StaticMrthodDemo {
    public static void main(String[] args) {
        // Call the static methods directly using the class name
        int squaredValue = MathUtils.square(5);
        System.out.println("Square of 5 is: " + squaredValue);

        int factorialValue = MathUtils.factorial(5);
        System.out.println("Factorial of 5 is: " + factorialValue);
    }
}

/*
 * In Java (and in object-oriented programming in general), objects are created
 * to encapsulate data and behavior together. Here are some reasons why we
 * create objects:
 * 
 * 1. **Encapsulation:** Objects encapsulate data (attributes) and behavior
 * (methods) into a single unit. This allows us to model real-world entities or
 * abstract concepts in a structured way.
 * 
 * 2. **Data Abstraction:** Objects provide a way to hide the internal state
 * (data) of an object and only expose necessary operations through methods.
 * This helps in managing complexity and improving the maintainability of the
 * code.
 * 
 * 3. **Modularity and Reusability:** Objects promote modularity by breaking
 * down a program into smaller, self-contained units. These units (objects) can
 * be reused in different parts of the program or in different programs, leading
 * to more efficient and maintainable code.
 * 
 * 4. **Security:** Objects can enforce access control through encapsulation. By
 * using access modifiers (like private, protected, public), we can control how
 * data is accessed and modified, thus enhancing security and preventing
 * unintended modifications.
 * 
 * 5. **Polymorphism:** Objects support polymorphism, where different objects
 * can respond to the same message (method call) in different ways. This allows
 * for flexible and extensible code design.
 * 
 * In summary, creating objects in Java allows us to implement encapsulation,
 * data abstraction, modularity, reusability, security, and polymorphism, which
 * are fundamental concepts in object-oriented programming. This approach helps
 * in writing clearer, more organized, and maintainable code.
 */