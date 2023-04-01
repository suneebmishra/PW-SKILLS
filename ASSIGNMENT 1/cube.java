import java.util.Scanner;

public class cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number =  ");
        int num_1 = sc.nextInt();

        int cube = num_1 * num_1 * num_1;
        System.out.println("the cube is = " + cube);
    }
}
