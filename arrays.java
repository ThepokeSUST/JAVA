public class arrays{
      
      public static void main(String[] arg){
         /* Arrays are fundamental structures in Java that allow us to store multiple values of the same type in a single variable. They are useful for storing and managing collections of data. Arrays in Java are objects, which makes them work differently from arrays in C/C++ in terms of memory management.
          */

         /*
           For primitive arrays, elements are stored in a contiguous memory location. For non-primitive arrays, references are stored at contiguous locations, but the actual objects may be at different locations in memory.
          */

         /*
          To declare an array in Java, use the following syntax:

           type[] arrayName;
           The array is not yet initialized.

           To create an array, you need to allocate memory for it using the new keyword:

          // Creating an array of 5 integers
              int[] numbers = new int[5]; 

          We can access array elements using their index, which starts from 0:    
          */



         int[] arr=new int[5];
         for(int i=0;i<5;i++)
            arr[i]=999;
         //System.out.print(arr[0]);
         int[] brr=arr.clone();

         System.out.println(arr==brr);

         int Arr[][]={{1,2,3},{1,2}};
         int Brr[][]=Arr.clone();

System.out.println((Arr==Brr)+" "+ (Arr[0]==Brr[0])+" "+(Arr[1]==Brr[1]));

//System.out.println(Arr[0]==Brr[0]);
System.out.println();
  System.out.println("Array of object");
   String[] str1={"dipok","dipu"};
   String[] str2=str1.clone();
    System.out.println(str1==str2);
    str1[1]="fifu";
    System.out.println(str2[1]);
    
    //System.out.println(str1);


    System.out.println("\n"+"\n" + "class A array");
    A[] array=new A[5];
    array[0]=new A(0);
    array[1]=new A(1);
    array[2]=new A(2);
    array[3]=new A(3);
    array[4]=new A(4);
    
    A brray[]=array.clone();
    array[0].a=888;
    brray[0].get();
    
    final int crr[]={1,2,3,4,5};
    int drr[]=crr;
    drr[1]=999;
    //crrr[0]=123450;
    for(int ele: drr){
      System.out.println(ele);
    }

    int i[]={1,2,3,4,5};
    int j[]=i;
    i[1]=223;
    for(int ele: j){
      System.out.print(ele+" ");
    }
      }
}


class A{
      public int a=999;

      A(int aa){
        a=aa;
      }
      public void get(){
        System.out.println(a);
      }
  }