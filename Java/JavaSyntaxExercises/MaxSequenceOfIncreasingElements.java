package JavaSyntaxExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfIncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int counter=0;
        int maxSequence=0;
        int endIndex=0;

        for (int i = 0; i < numbers.length-1; i++) {
            if(numbers[i+1]>numbers[i]){
                counter++;
                if(counter>maxSequence){
                    maxSequence=counter;
                    endIndex=i+1;
                }
            }else{
                counter=0;
            }
        }

        int startIndex=endIndex-maxSequence;
        for (int i =startIndex; i<=endIndex; i++ ){
            System.out.printf("%d ", numbers[i]);
        }
    }
}
