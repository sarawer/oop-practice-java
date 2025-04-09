import java.util.Scanner;
public class BoxVolume {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height: ");
        int h = sc.nextInt();

        System.out.print("Enter width: ");
        int w = sc.nextInt();

        System.out.print("Enter depth: ");
        int d = sc.nextInt();

        Box box1 = new Box(h, w, d);
        box1.volume();

        sc.close();
    }

    public static class Box {
        int h, w, d;

        Box(int a, int b, int c) {
            h = a;
            w = b;
            d = c;
        }

        int volume() {
            int vol = h * w * d;
            System.out.println("Volume: " + vol);
            return vol;
        }
    }
}
