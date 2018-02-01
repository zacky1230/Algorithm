package Test;

public class TestAbstractClass {
    public static void main(String[] args) {
        C c = new C();
        c.doingSomething();
    }
}

abstract class A {
    abstract void say();

    abstract void eat();

    public void doingSomething() {
        say();
        eat();
    }
}

abstract class B extends A{
    @Override
    void say() {
        System.out.println("b say");
    }

    @Override
    void eat() {
        System.out.println("b eat");
    }
}

class C extends B{
    @Override
    void say() {
        System.out.println("c say");
    }

    @Override
    void eat() {
        System.out.println("c eat");
    }

//    public void doingSomething() {
//        say();
//        eat();
//        System.out.println("cc");
//    }
}
