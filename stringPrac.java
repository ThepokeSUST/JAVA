public class stringPrac {
      
    public static void main(String[] arg){
          
        String str= new String("okk");// first check in string constant pool if found then use it
                                               //else create object on pool then create  object on heap
        String strr= new String("ok");
        String str1="ok";//creat on pool if not found
        String strr1="ok";
        System.out.println(str==strr);
        System.out.println(str1==strr1);
        System.out.println(str==str1);
        String s=str.intern();
        System.out.println(str1==s);
        System.out.println(s);
        String ss="okk";
        System.out.println(s==ss);
    }
}
