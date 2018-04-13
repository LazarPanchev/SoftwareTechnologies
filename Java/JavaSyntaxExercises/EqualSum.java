package JavaSyntaxExercises;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int searchedIndex = 0;
        boolean isThereIndex = false;
        for (int i = 0; i < nums.length; i++) {
            int currentIndex = i;
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < currentIndex; j++) {
                leftSum += nums[j];
            }

            for (int j = currentIndex + 1; j <= nums.length - 1; j++) {
                rightSum += nums[j];
            }

            if (leftSum == rightSum) {
                searchedIndex = currentIndex;
                isThereIndex = true;
            }
        }


        if (isThereIndex || nums.length == 1) {
            System.out.println(searchedIndex);
        } else {
            System.out.println("no");
        }
    }
}
