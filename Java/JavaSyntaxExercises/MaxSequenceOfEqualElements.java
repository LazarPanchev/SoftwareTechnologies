package JavaSyntaxExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int count=1;
        int maxCount=0;
        int searchedNum=0;
        for(int i=1; i<numbers.length;i++){
            if(numbers[i]==numbers[i-1]){
                count++;
                if(count>maxCount){
                    maxCount=count;
                    searchedNum=numbers[i];
                }
            }else{
                count=1;
            }
        }

        for(int i=0; i<maxCount; i++){
            System.out.printf("%d ",searchedNum);
        }
    }
}
