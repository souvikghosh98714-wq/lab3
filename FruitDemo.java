class Apple {
    void show() {
        System.out.println("This is Apple class show() method");
    }
}

// Derived class
class Banana extends Apple {
    void show() {
        System.out.println("This is Banana class show() method");
    }
}

// Derived class
class Cherry extends Apple {
    void show() {
        System.out.println("This is Cherry class show() method");
    }
}

// Main class
public class FruitDemo {
    public static void main(String[] args) {

        Apple a = new Apple();
        Banana b = new Banana();
        Cherry c = new Cherry();

        // Calling show() of each class
        a.show();
        b.show();
        c.show();
    }
}