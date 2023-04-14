import java.util.Arrays;

public class MergeTwoArrays {
    public int[] sort(int[] num, int[] number){
    int newLength = num.length + number.length;
    int[]newArr = new  int[newLength];
        for (int i = 0; i < newArr.length; i++) {

            if (i<num.length){
                newArr[i] = num[i];
                System.out.println("kk");}

            if (i>=num.length){
                for (int j = number.length - newLength ;j < ; j++) {
                newArr[i] = number [j];
            }
        }
    }
        for (int i = 0; i < newArr.length-1; i++) {
        if (newArr[i]>newArr[i+1]){
            int temp = newArr[i+1];
            newArr[i+1] = newArr[i];
            newArr[i] = temp;
        }
    }
        return newArr;
}

    public static void main(String[] args) {

        MergeTwoArrays trial = new MergeTwoArrays();
        int[]num = {1,3,4,5};
        int [] number = {2,6,7,8};
        System.out.println(Arrays.toString(trial.sort(num,number)));
    }
}
