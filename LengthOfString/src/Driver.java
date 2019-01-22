import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        System.out.println("Enter any word");
        word = sc.next();

        StringLength Obj = new StringLength();
        Obj.FindLength(word);
    }
}
