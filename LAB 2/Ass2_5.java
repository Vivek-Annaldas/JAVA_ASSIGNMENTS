interface MyInterface {
    void show();
}

class Outer {
    class Inner {
        void display() {
            System.out.println("This is inner class.");
        }
    }

    void createAnonymous() {
        MyInterface obj = new MyInterface() {
            public void show() {
                System.out.println("This is anonymous class.");
            }
        };
        obj.show();
    }
}

public class Ass2_5 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
        outer.createAnonymous();
    }
}
