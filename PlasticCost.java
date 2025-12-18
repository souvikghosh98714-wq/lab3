import java.util.Scanner;

// 2D Sheet class
class Sheet2D {
    double length;
    double breadth;
    double costPerSqFt = 40;

    void getData(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculateCost() {
        double area = length * breadth;
        return area * costPerSqFt;
    }
}

// 3D Box class inheriting 2D Sheet
class Box3D extends Sheet2D {
    double height;
    double costPerCuFt = 60;

    void getData(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double calculateCost() {
        double volume = length * breadth * height;
        return volume * costPerCuFt;
    }
}

// Main class
public class PlasticCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter choice:");
        System.out.println("1. 2D Sheet");
        System.out.println("2. 3D Box");
        int choice = sc.nextInt();

        if (choice == 1) {
            Sheet2D sheet = new Sheet2D();

            System.out.print("Enter length: ");
            double l = sc.nextDouble();

            System.out.print("Enter breadth: ");
            double b = sc.nextDouble();

            sheet.getData(l, b);
            System.out.println("Cost of 2D Sheet = Rs " + sheet.calculateCost());
        }
        else if (choice == 2) {
            Box3D box = new Box3D();

            System.out.print("Enter length: ");
            double l = sc.nextDouble();

            System.out.print("Enter breadth: ");
            double b = sc.nextDouble();

            System.out.print("Enter height: ");
            double h = sc.nextDouble();

            box.getData(l, b, h);
            System.out.println("Cost of 3D Box = Rs " + box.calculateCost());
        }
        else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
