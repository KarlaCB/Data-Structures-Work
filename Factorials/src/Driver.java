import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y;
        int x;

        System.out.println("Please enter a number");
        y = sc.nextInt();

        Iteration Obj = new Iteration();
        Obj.calculation(y);

        System.out.println();

        Recursion Obj1 = new Recursion();
        x = Obj1.calculation(y);

        Obj1.result(y,x);
    }
}
