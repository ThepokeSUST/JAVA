public class variable {
   
    
    public static void main(String[] arg){
      A aa=new A();
      aa.disa();

    }
}

class A{


    static float a; //default value assigned
    int b; //instance ... default value assigned
    void disa(){
   System.out.println("static: "+a);
   System.out.println("instance: "+ b);
    }
    static void statdis(){
        //static int b; //cannt declare static variable......
        //b=90; //cannt use non-static field
    }
}