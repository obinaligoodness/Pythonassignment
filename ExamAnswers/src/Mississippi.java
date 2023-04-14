public class Mississippi {
    public String counterForSAndI(String word){
        int counterS = 0;
        int counterI = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)=='s') counterS += 1;
            if (word.charAt(i)== 'i') counterI += 1;
        }
        return "The number of 's' is: " + counterS + "\nThe number of 'i' is: " + counterI;
    }

    public static void main(String[] args) {
        Mississippi trial = new Mississippi();
        System.out.println(trial.counterForSAndI("Mississippi"));
    }
}
