
//multiple inheritance by extends keyword
interface sub extends Add, speek {
      int b = 10;

      static void staticMethod() {
            System.out.println("static mathod " + b);
      }

      int subtructNUm(int a, int b);
}

interface speek {
      void say();

      // this method can overrid in the class but not mandatory
      // default method only allowed in interface
      default void bark() {
            System.out.println("gheu gheu");
      }
}

interface Add {

      int addNumber(int a, int b);

}

interface fx {
      // this is public by default
      void showid();
}

class Cal implements sub, fx {
      @Override
      public void showid() {
            System.out.println("1223n3243kq3q2");
      }

      @Override
      public int addNumber(int a, int b) {

            return a + b;
      }

      @Override
      public int subtructNUm(int a, int b) {
            return a - b;
      }

      @Override
      public void say() {
            System.out.println("this is calculator");
      }
}

public class interFace {

      public static void main(String[] arg) {
            Cal A = new Cal();
            A.say();
            A.bark();
            sub.staticMethod();
            // A.b; error
            // A.staticMethod(); error
      }

}
