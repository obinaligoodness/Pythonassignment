import java.util.Scanner;

public class SecondLargestNumber {
    Scanner scanner = new Scanner(System.in);
    public  int getSecondLargestNumber(){
        System.out.println("how many numbers would you like to input");
        int noOfTimes = scanner.nextInt();
        int[]numbers = new int[noOfTimes];
        int highestNumber = 0;
        int secondLargestNumber = 0;
        for (int i = 0; i < numbers.length ; i++) {
            System.out.println("enter a number");
            int number = scanner.nextInt();
            numbers[i] = number;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>highestNumber) highestNumber = numbers[i];
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i]>numbers[j]&&numbers[i]<highestNumber) secondLargestNumber = numbers[i];
            }
        }
        return secondLargestNumber;
    }

    public static void main(String[] args) {
        SecondLargestNumber trial = new SecondLargestNumber();
        System.out.println(trial.getSecondLargestNumber());
    }
}
