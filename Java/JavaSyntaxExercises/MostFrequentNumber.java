package JavaSyntaxExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int counter=1;
        int mostFrequent=0;
        int searchedNum=0;

        for (int i = 0; i < numbers.length-1; i++) {
            int currentNum=numbers[i];
            for (int j=0; j<numbers.length; j++)
            if(currentNum==numbers[j]){
                counter++;
                if(counter>mostFrequent){
                    mostFrequent=counter;
                    searchedNum=currentNum;
                }
            }else{
                counter=1;
            }
        }

        if(numbers.length==1){
            System.out.printf("%d",numbers[0]);
        }else {
            System.out.printf("%d", searchedNum);
        }
    }
}
