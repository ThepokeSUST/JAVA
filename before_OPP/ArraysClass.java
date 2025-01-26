package before_OPP;

import java.util.Arrays;
import java.util.List;

public class ArraysClass {
    /*
     * Last Updated : 04 Jan, 2025
     * The Arrays class in java.util package is a part of the Java Collection
     * Framework. This class provides static methods to dynamically create and
     * access Java arrays. It consists of only static methods and the methods of
     * Object class. The methods of this class can be used by the class name itself.
     * 
     * The class hierarchy is as follows:
     * 
     * java.lang.Object
     * ? java.util.Arrays
     * Geek, now you must be wondering why do we need java Arrays class when we are
     * able to declare, initialize and compute operations over arrays. The answer to
     * this though lies within the methods of this class which we are going to
     * discuss further as practically these functions help programmers expanding
     * horizons with arrays for instance there are often times when loops are used
     * to do some tasks on an array like:
     * 
     * Fill an array with a particular value.
     * Sort an Arrays.
     * Search in an Arrays.
     * And many more.
     * Here Arrays class provides several static methods that can be used to perform
     * these tasks directly without the use of loops, hence forth making our code
     * super short and optimized.
     */

    public static void main(String[] arg) {

        // asList()
        // Returns a fixed-size list backed by the specified Arrays
        // ..........................................
        System.out.println("As List");
        Integer[] arr = { 1, 2, 3, 3, 5 };
        List<Integer> li = java.util.Arrays.asList(arr);
        System.out.println(li.size());
        System.out.println();
        // binarySearch()
        // Searches for the specified element in the array with the help of the Binary
        // Search Algorithm
        /*
         * Return Type:
         * 
         * It returns the index of the key, if the index is found.
         * If the index not found, it returns - (insertion point) - 1, where the
         * insertion point is where the key would fit in a sorted array.
         */
        // ...................................
        System.out.println("Binary search");
        System.out.println(Arrays.binarySearch(arr, 4));

        // Example 3: binarySearch(array, fromIndex, toIndex, key, Comparator) Method
        /*
         * This method searches a range of the specified array for the specified object
         * using the binary search algorithm.
         * 
         */
        // ..........................................
        System.out.println("Binary search in range");
        System.out.println(Arrays.binarySearch(arr, 0, 2, 3));

        // compare(array 1, array 2)
        // Compares two arrays passed as parameters lexicographically.
        // ..........................................
        System.out.println("compare");
        int comA[] = { 1, 2, 3, 4 };
        int comB[] = { 2, 2, 3, 4 };
        System.out.println(Arrays.compare(comA, comB));
        int twocomA[][] = { { 1, 2 }, { 2, 3 } };
        int twocomB[][] = { { 1, 2 }, { 2, 3 } };
        // System.out.println(Arrays.compare(twocomA, twocomB)); error becoause compare
        // mathod not supports int[][] arguments......

        // copyOf(originalArray, newLength)
        // Copies the specified array, truncating or padding with the default value (if
        // necessary) so the copy has the specified length.
        // ..............................................
        System.out.println("copy of");
        int copyofA[] = { 1, 2, 3 };
        int copyofB[] = Arrays.copyOf(copyofA, 5);
        for (int ele : copyofA)
            System.out.print(ele + " ");
        System.out.println();
        System.out.println(Arrays.toString(copyofB));
        int a[][][] = { { { 1, 2, 3, 4 }, { 4, 5, 5, 6 } } };
        int b[][][] = Arrays.copyOf(a, 7);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println();

        // copyOfRange(originalArray, fromIndex, endIndex) Method
        // ...................................................
        System.out.println("copy of range");
        int copyofrangeA[] = { 1, 2, 3, 4 };
        int copyofrangeB[] = Arrays.copyOfRange(copyofrangeA, 0, 2);
        System.out.println(Arrays.toString(copyofrangeB));

        // deepEquals(Object[] a1, Object[] a2) Method
        // ..........................................
        System.out.println("Deap Equals");
        ArraysClass mainclass[] = new ArraysClass[3];
        ArraysClass mainclass2[] = new ArraysClass[3];
        int deepA[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        int deepB[][] = { { 1, 2, 3, 4 }, { 5, 6, 8, 8 } };
        System.out.println("deep equals " + Arrays.deepEquals(deepA, deepB));
        // System.out.println(Arrays.deepEquals(comA, comB));
        System.out.println(Arrays.deepEquals(mainclass, mainclass2));
        mainclass2[2] = new ArraysClass();
        System.out.println(Arrays.deepEquals(mainclass, mainclass2));
        // System.out.println(Arrays.compare(mainclass, mainclass2));
        // Arrays.compare() is designed to compare two arrays of primitive types or
        // arrays of objects that implement the Comparable interface, such as Integer[],
        // String[], etc.
        Integer[][] integerA = { { 1, 2, 3, 4 } };
        Integer[][] integerB = { { 1, 2, 3, 4 } };
        // System.out.println(Arrays.compare(integerA, integerB));
        // Arrays.compare() is not designed to compare multidimensional arrays of
        // objects (like Integer[][]). It works for one-dimensional arrays of primitives
        // or Comparable types.

        // equals(array1, array2)
        /// Checks if both the arrays are equal or not.
        // ..........................................
        System.out.println("Equals");
        System.out.println(Arrays.equals(comA, comB));
        System.out.println(Arrays.equals(integerA, integerB));// analysis.........

        ArraysClass mainclass3[] = new ArraysClass[3];
        ArraysClass mainclass4[] = new ArraysClass[3];
        System.out.println(Arrays.equals(mainclass3, mainclass4));
        mainclass4[2] = new ArraysClass();
        System.out.println(Arrays.equals(mainclass3, mainclass4));

    }
}
