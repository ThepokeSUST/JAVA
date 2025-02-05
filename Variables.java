
class A {
    static int a = 9;
    int aa = 7;// instance variable

    static void stameth() {
        // static int b = 8;//error
    }

    void s() {
        // static int b = 8;//error

        int aa = 9;// local varibale so duplicate allowed.

        int bb = 6;
        {
            // int bb = 6;// error:duplicate local variable
        }
    }
}

public class Variables {

    public static void main(String[] arg) {
        // variables are the containers for the data or you can say it is the name given
        // to the memory location of data.
        // 3 types of variable are in java
        // local variable,instance variable & static variable;
        // local variable..
        // it is the variable that is defined in a block,method or constractor is called
        // local variable.
        // initialization is mandatory before using local variable
        // local variable is created at the time of declaration and destroyed after
        // axiting from the block ar when method returns.
        // the scope of the local variable is in only the block where it it defined.

        // instance variable
        // it is the variable that is defined in a class out side of any
        // block,constractor or method.
        // initialization is not mandetory.
        // we can initialize via instance block or constractor.
        // Scope of instance variable is throughout the class.Except the Static context.
        // we may use access specifier on instance variable.
        // these variable is created when object of class is created and destroyed when
        // object is destroyed.

        // static variable.
        // Static variable is declared in the class outside of any block or method or
        // constructor prefixed with static word.
        // static variable is also called class variable.
        // unlike instance variable there is only onne copy of static variable per
        // class,that is shared irrespective of how many object of this class is created
        // initialization is not mandatory
        // static variables are created at the start of the program and destroyed at
        // when execution ends.
        // We can access static variables via object name .In this case compiler will
        // automatically replace object name with class name.
        // static variable cannot declared locallly inside an instance method
        // static blocks can be used to initialize static variables.
    }
}
