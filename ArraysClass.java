
/*
 The Arrays class of the java.util package contains several static methods that can be used to fill, sort, search, etc in arrays. 
 */

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class ArraysClass {
  
  public static void main(String[] arg){

    //asList
    /*Integer brr[]={1,2,30 ,4,5,6,7};
    List<Integer> ll=Arrays.asList(brr); 
    System.out.println(ll);
    //ll.add(56); //this will throws UnsupportedOperationException
    //System.out.println(ll);
    */

    //sort
    /*Integer A[]={32,43,2,4};
    Arrays.sort(A);
    System.out.println(Arrays.toString(A));
    */
    //autoboxing and unboxing......
    /*List<Integer> ll2=new ArrayList<>();
    ll2.add(10);//autoboxing......
    int x= ll2.get(0);//unboxing......
    System.out.println(x);
    */

    //binarySearch
    /*int arr[]={436,54,23,7};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.binarySearch(arr,4)); 
    //return (-(insertion index)-1)......
    */

    //BinarySearch in subarray
    /*int arr[]={1,2,3,4,6};
    Arrays.sort(arr);
    System.out.println(Arrays.binarySearch(arr,0,4,4 ));
    */

    //compare to array......for int[]
    /*int arr[]={1,2,3,4,5,6};
    int brr[]={2,3,4,5,6,7};
    System.out.println(Arrays.compare(arr, brr));
    //return 1 if arr>brr
    //return -1 if arr<brr
    //return 0 if arr==brr
    */
    //compare unsigned




    //copy of
    /*int arr1[]={1,2,3,4};
    int brr1[]= Arrays.copyOf(arr1, 3);
    arr1[1]=0;
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(brr1));
    //copyOfRange(arr1,1,3);
    */
    
    //deep Equas......int[][],Objects 
   /*int arr[][]={{1,2,3,4},{1,2,3,4}};
   int brr[][]={{4,5,6,7},{4,5,6,7}};
   System.out.println(Arrays.deepEquals(arr, brr));
   //return true or false
  int arr1[][][]={{{1,2,3,4}}};
  int brr1[][][]={{{1,2,3,4}}};
  System.out.println(Arrays.deepEquals(arr1, brr1));
   */

   //equals

   


   
   //fill
   /*int arr[]={1,2,3,4};
   System.out.println(Arrays.toString(arr));
   Arrays.fill(arr,999);
   System.out.println(Arrays.toString(arr));
   Arrays.fill(arr, 0,3,888);
   System.out.println(Arrays.toString(arr));
   */
  }
}
