import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner cat = new Scanner(System.in);
        System.out.print("Enter the digit to be generated upto: ");
        int reps = cat.nextInt();
        int n1 = 0, n2 = 1, sum;
        System.out.printf("\nThe fibonacci series upto %d digits are:\n", reps);
        System.out.printf("%d\t%d", n1, n2);
        for (int i = 0; i < reps-2; i++) {
            System.out.printf("\t%d", sum = n1 + n2);
            n1 = n2;
            n2 = sum;
        }
    }
}
