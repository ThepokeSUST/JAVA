package before_OPP;

import java.util.stream.IntStream;

public class arrays {

    // Arrays are fundamental structures in Java that allow us to store multiple
    // values of the same type in a single variable. They are useful for storing and
    // managing collections of data. Arrays in Java are objects, which makes them
    // work differently from arrays in C/C++ in terms of memory management.

    // For primitive arrays, elements are stored in a contiguous memory location.
    // For non-primitive arrays, references are stored at contiguous locations, but
    // the actual objects may be at different locations in memory.

    /*
     * 1. Array Declaration
     * To declare an array in Java, use the following syntax:
     * 
     * type[] arrayName;
     */
    /*
     * 2. Create an Array
     * To create an array, you need to allocate memory for it using the new keyword:
     * 
     * // Creating an array of 5 integers
     * numbers = new int[5];
     * This statement initializes the numbers array to hold 5 integers. The default
     * value for each element is 0.
     */

    /*
     * Array Properties
     * In Java, all arrays are dynamically allocated.
     * Arrays may be stored in contiguous memory [consecutive memory locations].
     * Since arrays are objects in Java, we can find their length using the object
     * property length. This is different from C/C++, where we find length using
     * size of.
     * A Java array variable can also be declared like other variables with [] after
     * the data type.
     * The variables in the array are ordered, and each has an index beginning with
     * 0.
     * Java array can also be used as a static field, a local variable, or a method
     * parameter.
     */

    /*
     * // declaring array
     * int intArray[];
     * 
     * 
     * // allocating memory to array
     * intArray = new int[20];
     * 
     * 
     * // combining both statements in one
     * int[] intArray = new int[20];
     */

    /*
     * Array Literal in Java
     * In a situation where the size of the array and variables of the array are
     * already known, array literals can be used.
     * 
     * // Declaring array literal
     * int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
     * 
     * 
     * The length of this array determines the length of the created array.
     * There is no need to write the new int[] part in the latest versions of Java.
     */

    /*
     * Advantages of Java Arrays
     * Efficient Access: Accessing an element by its index is fast and has constant
     * time complexity, O(1).
     * Memory Management: Arrays have fixed size, which makes memory management
     * straightforward and predictable.
     * Data Organization: Arrays help organize data in a structured manner, making
     * it easier to manage related elements.
     * Disadvantages of Java Arrays
     * Fixed Size: Once an array is created, its size cannot be changed, which can
     * lead to memory waste if the size is overestimated or insufficient storage if
     * underestimated.
     * Type Homogeneity: Arrays can only store elements of the same data type, which
     * may require additional handling for mixed types of data.
     * Insertion and Deletion: Inserting or deleting elements, especially in the
     * middle of an array, can be costly as it may require shifting elements.
     */

    // jagged arrays
    // In Java, Jagged array is an array of arrays such that member arrays can be of
    // different sizes, i.e., we can create a 2-D array but with a variable number
    // of columns in each row.

    /*
     * Advantages of using Jagged Array in Java:
     * Dynamic allocation: Jagged arrays allow you to allocate memory dynamically,
     * meaning that you can specify the size of each sub-array at runtime, rather
     * than at compile-time.
     * Space utilization: Jagged arrays can save memory when the size of each
     * sub-array is not equal. In a rectangular array, all sub-arrays must have the
     * same size, even if some of them have unused elements. With a jagged array,
     * you can allocate just the amount of memory that you need for each sub-array.
     * Flexibility: Jagged arrays can be useful when you need to store arrays of
     * different lengths or when the number of elements in each sub-array is not
     * known in advance.
     * Improved performance: Jagged arrays can be faster than rectangular arrays for
     * certain operations, such as accessing elements or iterating over sub-arrays,
     * because the memory layout is more compact.
     * It’s important to note that jagged arrays also have some disadvantages, such
     * as increased complexity in the code and a potentially less readable codebase,
     * so they should be used carefully and appropriately.
     */

    static void takeArray(int[] A) {
        for (int i = 0; i < A.length; i++)
            A[i] = 999;
    }

    public static void main(String[] arg) {

        int[] array = new int[23];

        for (int ele : array)
            System.out.print(ele + " ");
        System.out.println();
        int[][] brray;
        brray = new int[3][];
        brray[0] = new int[2];
        System.out.println(brray[0].length);

        System.out.println();
        takeArray(array);
        for (int ele : array)
            System.out.print(ele + " ");
        // array initialization
        // Advanced Initialization Using Streams
        // An array can be initialized by using a stream interface. The IntStream
        // interface in Java offers additional ways to initialize arrays with sequential
        // or predefined values.

        // Below are three instream interfaces that are used to initialize an integer
        // type array.

        /*
         * 1. Using IntStream.range()
         * It is used to initialize an array of integers within a given range.
         * 
         * The first parameter is the starting element.
         * And the second parameter defines the upper limit (exclusive).
         * It means the array will include elements greater than or equal to the first
         * parameter but less than the second one.
         */
        System.out.println();
        int[] A = java.util.stream.IntStream.range(1, 5).toArray();
        for (int ele : A)
            System.out.print(ele + " ");
        System.out.println();

        /*
         * 2. Using IntStream.rangeClosed()
         * It creates an array within a range (inclusive of the end).
         */
        int B[] = IntStream.rangeClosed(1, 5).toArray();
        for (int ele : B)
            System.out.print(ele + " ");
        System.out.println();

        /*
         * 3. Using IntStream.of()
         * It directly initializes an array with specified values.
         */
        int[] C = java.util.stream.IntStream.of(1, 2, 3, 4, 5, 6).toArray();
        for (int ele : C)
            System.out.print(ele + " ");

    }
}
