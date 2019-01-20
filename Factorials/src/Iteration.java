
public class Iteration {
    private int N;
    private int i;
    public Iteration() {
        N = 0;
        i = 0;
    }

    public Iteration(int n, int i) {
        N = n;
        this.i = i;
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void calculation(int x){
        N = x;
        int y = 1;
        for(i = x ; i > 0; i--){
            if( i == 0)
            {
                break;
            }
            else{

                y *= i;
            }

        }
        System.out.println("The Factorial of " + N + " is " + y);
        System.out.println("Using Iteration");
    }

}
