import java.util.Scanner;

public class Productoftwonumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("number 1 =  ");
        int num_1 = sc.nextInt();

        System.out.print("number 2 = ");
        int num_2 = sc.nextInt();

        int mult = num_1*num_2;

        System.out.println("the product is = " + mult);
    }
}
