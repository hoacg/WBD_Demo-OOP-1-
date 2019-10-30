
// Superclass
class Base {

    // Static method in base class which will be hidden in subclass
    public static void display() {
        System.out.println("Static or class method from Base");
    }

    // Non-static method which will be overridden in derived class
    public void print()  {
        System.out.println("Non-static or Instance method from Base");
    }
}

// Subclass
class Derived extends Base {

    // This method hides display() in Base
    public static void display() {
        System.out.println("Static or class method from Derived");
    }

    // This method overrides print() in Base
    public void print() {
        System.out.println("Non-static or Instance method from Derived");
    }
}

public class Main {



    public static void main(String[] args) {

        Base obj1 = new Derived();
        obj1.display();
        obj1.print();

        System.out.println("--------------------------------------------------");

        Derived obj2 = new Derived();
        obj2.display();
        obj2.print();

    }
}
