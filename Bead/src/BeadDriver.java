import java.util.Scanner;

public class BeadDriver {

        public static void main(String[] args) {
            int i = 0, num;
          Bead beads[] = new Bead[4]; // array in java with
//            Bead setOfBeads[] = new Bead[]{
//                   new Bead(), new Bead()
//            }; // bead array and putting objects into array
            Bead bead2 = new Bead(2.0f,4.0f, "red", "John", 1);
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

