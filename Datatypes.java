public class Datatypes {

    public static void main(String[] arg) {

        // Data types
        // it is the type of the data that can store in the variable that is declared
        // follows by that data type.
        // data type defines that what amount of memory can store a variable.
        // data type specify what kind of data a variable can store.

        // java has two categories of data type.

        // primitive data types.
        // there are eight primitive types.
        // the primitive types are also referred to as simple types.
        // Primitive types represents single values,it has no extra capabilities
        
        //boolean Data Type
        /*
         The boolean data type represents a logical value that can be either true or false. Conceptually, it represents a single bit of information, but the actual size used by the virtual machine is implementation-dependent and typically at least one byte (eight bits) in practice. Values of the boolean type are not implicitly or explicitly converted to any other type using casts. However, programmers can write conversion code if needed.
         */

        // byte Data Type
        /*
         The byte data type is an 8-bit signed two’s complement integer. The byte data type is useful for saving memory in large arrays.
         */

         //short Data Type
         /*
          The short data type is a 16-bit signed two’s complement integer. Similar to byte, a short is used when memory savings matter, especially in large arrays where space is constrained.
          */

          //int Data Type
          /*
           It is a 32-bit signed two’s complement integer.

            Remember:  In Java SE 8 and later, we can use the int data type to represent an unsigned 32-bit integer, which has a value in the range [0, 2  32  -1]. Use the Integer class to use the int data type as an unsigned integer.
           */

           //long Data Type
           /*
            The long data type is a 64-bit signed two’s complement integer. It is used when an int is not large enough to hold a value, offering a much broader range.

             Remember:  In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 2  64  -1. The Long class also contains methods like comparing Unsigned, divide Unsigned, etc to support arithmetic operations for unsigned long. 
            */

            //float Data Type
            /*
             The float data type is a single-precision 32-bit IEEE 754 floating-point. Use a float (instead of double) if you need to save memory in large arrays of floating-point numbers. The size of the float data type is 4 bytes (32 bits).
             */
            // double Data Type
            /*
             The double data type is a double-precision 64-bit IEEE 754 floating-point. For decimal values, this data type is generally the default choice. The size of the double data type is 8 bytes or 64 bits.

              Note:  Both float and double data types were designed especially for scientific calculations, where approximation errors are acceptable. If accuracy is the most prior concern then, it is recommended not to use these data types and use BigDecimal class instead. 
             */

             //char Data Type
             /*
              The char data type is a single 16-bit Unicode character with the size of 2 bytes (16 bits).
              */


              //Non-Primitive (Reference) Data Types
              /*
               The Non-Primitive (Reference) Data Types will contain a memory address of variable values because the reference types won’t store the variable value directly in memory. They are strings, objects, arrays, etc.
               */

    }
}
