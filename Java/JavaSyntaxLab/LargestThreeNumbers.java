package JavaSyntaxLab;

import java.util.Arrays;
import java.util.Scanner;

public class LargestThreeNumbers {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String[] numbersAsText = scanner
                .nextLine()
                .split(" ");

        int[] numbers = new int[numbersAsText.length];

        for(int i=0; i<numbers.length;i++){
            numbers[i]=Integer.parseInt(numbersAsText[i]);
        }

        Arrays.sort(numbers);

        int counter=0;
        for (int i=numbers.length-1; i>=0;i--) {
            if(counter>=3){
                break;
            }
            System.out.println(numbers[i]);
            counter++;
        }
    }
}
