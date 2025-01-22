
abstract class Parant1 {

    public Parant1() {
        System.out.println("this is Base1 class constructor");
    }

    public abstract void greet();

    public void dis() {
        System.out.println("this is parant1");
    }
}

class Child2 extends Parant1 {

    public Child2() {
        System.out.println("constructor of Child 2 class");
    }

    // public abstract void greet();
    @Override
    public void greet() {
        System.out.println("namashte from child 2");
    }
}

public class AbstractMethod {

    public static void main(String[] arg) {
        Child2 ch = new Child2();
        ch.greet();
        ch.dis();
    }

}
