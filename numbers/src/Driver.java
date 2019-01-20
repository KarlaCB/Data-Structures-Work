import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        int i = 0, num;
        Scanner sc = new Scanner(System.in);
        while(i < 3){
            System.out.println("What is the next number?");
            num = sc.nextInt();
            System.out.println("You Entered: \t" + num);
            i++;
        }
        sc.close();
    }
}
