import java.util.Scanner;

public class Overloading {
    public static void HitungLuas(int a, int b) {
        int nilai = a * b;
        System.out.println("Maka hasil luas: " + nilai);
    }
    public static void HitungLuas(double value1, double value2) {
        double nilai = value1 * value2;
        System.out.println("Maka hasil luas: " + nilai);
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Masukkan nilai integer 1: ");
        int integer1 = input.nextInt();
        System.out.print("Masukkan nilai integer 2: ");
        int integer2 = input.nextInt();
        HitungLuas(integer1, integer2);// memanggil method HitungLuas dengan parameter integer

        System.out.print("Masukkan nilai double 1: ");
        double double1 = input.nextDouble();
        System.out.print("Masukkan nilai double 2: ");
        double double2 = input.nextDouble();
        HitungLuas(double1, double2);// memanggil method HitungLuas dengan parameter double

    }
}
