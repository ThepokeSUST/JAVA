public class EnhancedForLOOP{
       

       public static void main(String[] arg){
        
         // loops are fundamental constructs for iterating over data structures or repeating blocks of code
         

         /*
           The enhanced for loop, also known as the for-each loop, is a streamlined way to iterate over collections and arrays. It eliminates the need for managing the loop’s counter or bounds manually.
          */


         int[] arr= new int[10];
         
         for(int ele: arr){
            System.out.print(ele+" ");
         }
         System.out.println();

      //update
         for(int ele: arr){
             ele=999;
         }
      //print
      for(int ele: arr)
          System.out.print(ele+" ");
       System.out.println();  
       //not updated 



       /*
       //now update
       for(final int ele: arr){ //error
        ele=999;
       }
       //print
       for(int ele: arr) 
           System.out.print(ele+" ");
        System.out.println();  
      */
       
       /*
         To update an array directly, use a traditional for loop.
          A for-each loop is more suitable for read-only operations or when you're working with collections and don't need to modify the array's elements.
        */


         

       }
}