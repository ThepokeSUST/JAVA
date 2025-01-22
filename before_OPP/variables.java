package before_OPP;

public class variables {

    // Variables are the containers for storing the data values or you can also call
    // it a memory location name for the data.
    // data type - variable name - value

    // There are three types of variables in Java – Local, Instance, and Static.

    // Local variables...........
    // ..........................
    // A variable defined within a block or method or constructor is called a local
    // variable.
    /*
     * The Local variable is created at the time of declaration and destroyed after
     * exiting from the block or when the call returns from the function.
     * The scope of these variables exists only within the block in which the
     * variables are declared, i.e., we can access these variables only within that
     * block.
     * Initialization of the local variable is mandatory before using it in the
     * defined scope.
     */

    // Instance variable........................
    // ......................
    // Instance variables are non-static variables and are declared in a class
    // outside of any method, constructor, or block.
    /*
     * As instance variables are declared in a class, these variables are created
     * when an object of the class is created and destroyed when the object is
     * destroyed.
     * Unlike local variables, we may use access specifiers for instance variables.
     * If we do not specify any access specifier, then the default access specifier
     * will be used.
     * Initialization of an instance variable is not mandatory. Its default value is
     * dependent on the data type of variable. For String it is null, for float it
     * is 0.0f, for int it is 0, for Wrapper classes like Integer it is null, etc.
     * Scope of instance variables are throughout the class except the static
     * contexts.
     * Instance variables can be accessed only by creating objects.
     * We initialize instance variables using constructors while creating an object.
     * We can also use instance blocks to initialize the instance variables.
     */

    // Static variable...............
    // .......................
    // Static variables are also known as class variables
    /*
     * These variables are declared similarly to instance variables. The difference
     * is that static variables are declared using the static keyword within a class
     * outside of any method, constructor, or block.
     * Unlike instance variables, we can only have one copy of a static variable per
     * class, irrespective of how many objects we create.
     * Static variables are created at the start of program execution and destroyed
     * automatically when execution ends.
     * Initialization of a static variable is not mandatory. Its default value is
     * dependent on the data type of variable. For String it is null, for float it
     * is 0.0f, for int it is 0, for Wrapper classes like Integer it is null, etc.
     * If we access a static variable like an instance variable (through an object),
     * the compiler will show a warning message, which won’t halt the program. The
     * compiler will replace the object name with the class name automatically.
     * If we access a static variable without the class name, the compiler will
     * automatically append the class name. But for accessing the static variable of
     * a different class, we must mention the class name as 2 different classes
     * might have a static variable with the same name.
     * Static variables cannot be declared locally inside an instance method.
     * Static blocks can be used to initialize static variables.
     * 
     */

}
