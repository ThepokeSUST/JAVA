package before_OPP;

public class VariableArgumentsVarargs {

    // Variable Arguments (Varargs) in Java is a method that takes a variable number
    // of arguments. Variable Arguments in Java simplify the creation of methods
    // that need to take a variable number of arguments.
    /*
     * Need of Java Varargs
     * Until JDK 4, we cant declare a method with variable no. of arguments. If
     * there is any change in the number of arguments, we have to declare a new
     * method. This approach increases the length of the code and reduces
     * readability.
     * Before JDK 5, variable-length arguments could be handled in two ways.
     * One uses an overloaded method(one for each).
     * Another puts the arguments into an array and then passes this array to the
     * method. Both of them are potentially error-prone and require more code.
     * To resolve these problems, Variable Arguments (Varargs) were introduced in
     * JDK 5. From JDK 5 onwards, we can declare a method with a variable number of
     * arguments. Such types of methods are called Varargs methods. The varargs
     * feature offers a simpler, better option.
     */

    /*
     * A method can have variable length parameters with other parameters too, but
     * one should ensure that there exists only one varargs parameter that should be
     * written last in the parameter list of the method declaration.
     */

    /*
     * Specifying two Varargs in a single method:
     * void method(String… gfg, int… q)
     * {
     * // Compile time error as there
     * // are two varargs
     * }
     * 
     * 
     */

    /*
     * Case 2: Specifying Varargs as the first parameter of the method instead of
     * the last one:
     * 
     * void method(int… gfg, String q)
     * {
     * // Compile time error as vararg
     * // appear before normal argument
     * }
     */

    /*
     * Important Points
     * Vararg Methods can also be overloaded, but overloading may lead to ambiguity.
     * Before JDK 5, variable length arguments could be handled in two ways: One was
     * using overloading, other was using array argument.
     * There can be only one variable argument in a method.
     * Variable argument (Varargs) must be the last argument.
     * 
     */

}
