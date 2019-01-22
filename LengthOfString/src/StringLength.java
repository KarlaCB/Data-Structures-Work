public class StringLength {
    private char[] word;
    private String input;

    public StringLength() {
        char[] word = {'c', 'b'};
        input = "Good Job";
    }

    public StringLength(char[] word, String input) {
        this.word = word;
        this.input = input;
    }

    public char[] getWord() {
        return word;
    }

    public void setWord(char[] word) {
        this.word = word;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public void FindLength(String input){ // converting string to char array function
        int i = 0;
        for(char word : input.toCharArray()){ // size of array is loop counter
            i++; // keeps track/ counts elements in array to find size

            System.out.println(word);
        }
        System.out.println();
        System.out.println("Length of Word " + i);
    }
}
