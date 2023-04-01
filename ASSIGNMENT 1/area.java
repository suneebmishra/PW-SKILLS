import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("length = ");
       int l = sc.nextInt();
        System.out.print("breadth= ");

        int b = sc.nextInt();

        int area = l*b;
        System.out.println("area is = " + area);
    }
}
