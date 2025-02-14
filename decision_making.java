

public class decision_making{

    public static void main(String[] arg){
           
    //Decision-making statements in Java execute a block of code based on a condition.
     
     //if
     //if else
     //nested if
     //if else if ladder

     int a=9;

     switch (a){//without break statement
         case 9:
            System.out.println("in case 9");
            System.out.println("ok");

         case 0:
            System.out.println("case 0");
            System.out.println("okay");
         case 4:
            System.out.println("case 4");

         default:
            System.out.println("default ");
            System.out.println("last");      
               
     }
     System.out.println();

         switch (a){//without break statement
         case 9:
            System.out.println("in case 9");
            System.out.println("ok");
            //break;

         case 0:
            System.out.println("case 0");
            System.out.println("okay");
            break;
         case 4:
            System.out.println("case 4");
           // break;

         default:
            System.out.println("default ");
            System.out.println("last");
            //break;      
               
         case 56:
            System.out.println("after default");      
     }
     

     //switch( expression){}
     /* The expression can be of type byte, short, int char, or an enumeration. Beginning with JDK7, the expression can also be of type String.
     */
    //Duplicate case values are not allowed
    //The default statement is optional.
    //The break statement is used inside the switch to terminate a statement sequence.
    //The break statements are necessary without the break keyword, statements in switch blocks fall through.  
    //If the break keyword is omitted, execution will continue to the next case.
    System.out.println();
    System.out.println();
    //String l="d";
    char l='r';
    switch(l){
         
         case 'r':
            System.out.println("next");
              break;     
    }

    //Jamp statements
    /*Java supports three jump statements: break, continue and return. These three statements transfer control to another part of the program.  */


    /*A:{
        System.out.println("level A");
        continue ;//error
    }
    */
   /*the continue keyword in Java cannot be used outside of a loop. It is specifically designed to control the flow within loops (such as for, while, and do-while loops) by skipping the remaining statements in the current iteration and continuing with the next iteration of the loop.

If you try to use continue outside of a loop, you will get a compile-time error.  */

    }
}