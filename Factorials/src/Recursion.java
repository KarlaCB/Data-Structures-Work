public class Recursion {

        private int N;
        private int i;
        public Recursion() {
            N = 0;
            i = 0;
        }

        public Recursion(int n, int i) {
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

        public int calculation(int x){
            N = x;
//            int y;
            if(x <=1){
                return 1;
            }
            else{
                return x * calculation(x -1);
            }
        }

        public  void result(int x, int y){
            System.out.println("The Factorial of " + x + " is " + y);
            System.out.println("Using Recursion");
        }

    }

