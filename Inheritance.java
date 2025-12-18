import java.util.Scanner;

// Base class
class Plate {
    double length, width;

    Plate(double l, double w) {
        length = l;
        width = w;
        System.out.println("Plate constructor executed");
        System.out.println("Length = " + length + ", Width = " + width);
    }
}

// Derived class
class Box extends Plate {
    double height;

    Box(double l, double w, double h) {
        super(l, w);   // Calls Plate constructor
        height = h;
        System.out.println("Box constructor executed");
        System.out.println("Height = " + height);
    }
}

// Derived class
class WoodBox extends Box {
    double thick;

    WoodBox(double l, double w, double h, double t) {
        super(l, w, h);   // Calls Box constructor
        thick = t;
        System.out.println("WoodBox constructor executed");
        System.out.println("Thickness = " + thick);
    }
}

// Main class
public class Inheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double l = sc.nextDouble();

        System.out.print("Enter width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.print("Enter thickness: ");
        double t = sc.nextDouble();

        // Creating object of most derived class
        WoodBox wb = new WoodBox(l, w, h, t);

        sc.close();
    }
}