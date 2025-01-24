package before_OPP;

public class methods {
    // Java Methods are blocks of code that perform a specific task. A method allows
    // us to reuse code, improving both efficiency and organization. All methods in
    // Java must belong to a class. Methods are similar to functions and expose the
    // behavior of objects.

    /*
     * Key Components of a Method Declaration
     * Modifier: It specifies the method’s access level (e.g., public, private,
     * protected, or default).
     * Return Type: The type of value returned, or void if no value is returned.
     * Method Name: It follows Java naming conventions; it should start with a
     * lowercase verb and use camel case for multiple words.
     * Parameters: A list of input values (optional). Empty parentheses are used if
     * no parameters are needed.
     * Exception List: The exceptions the method might throw (optional).
     * Method Body: It contains the logic to be executed (optional in the case of
     * abstract methods).
     */

    /*
     * Types of Methods in Java
     * 1. Predefined Method
     * Predefined methods are the method that is already defined in the Java class
     * libraries. It is also known as the standard library method or built-in
     * method.
     * 2. User-defined Method
     * The method written by the user or programmer is known as a user-defined
     * method. These methods are modified according to the requirement.
     */

    /*
     * Rules to Name a Method:
     * 
     * While defining a method, remember that the method name must be a verb and
     * start with a lowercase letter.
     * If the method name has more than two words, the first name must be a verb
     * followed by an adjective or noun.
     * In the multi-word method name, the first letter of each word must be in
     * uppercase except the first word. For example, findSum, computeMax, setX, and
     * getX.
     */

    /*
     * Generally, a method has a unique name within the class in which it is defined
     * but sometimes a method might have the same name as other method names within
     * the same class as method overloading is allowed in Java.
     */
    static void A(int a, int b) {
        System.out.println("int int  " + a + b);
    }

    static void A(float a, int b) {
        System.out.println("float int " + a + b);
    }

    static void A(int a, float b) {
        System.out.println("int float " + a + b);
    }
    /*
     * Method Signature
     * It consists of the method name and a parameter list.
     * 
     * number of parameters
     * type of the parameters
     * order of the parameters
     * : The return type and exceptions are not considered as part of it.
     */

    public static void main(String[] arg) {

        A(4, 5);
        A(3.4f, 5);
        A(4, 5.99f);
    }

    /*
     * Advantages of Methods
     * Reusability: Methods allow us to write code once and use it many times.
     * Abstraction: Methods allow us to abstract away complex logic and provide a
     * simple interface for others to use.
     * Encapsulation: Allow to encapsulate complex logic and data
     * Modularity: Methods allow us to break up your code into smaller, more
     * manageable units, improving the modularity of your code.
     * Customization: Easy to customize for specific tasks.
     * Improved performance: By organizing your code into well-structured methods,
     * you can improve performance by reducing the amount of code.
     * FAQs
     */

}
