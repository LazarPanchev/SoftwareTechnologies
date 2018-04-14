package JavaSyntaxExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays
                .stream(scanner.nextLine()
                        .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        int[] tokens = Arrays
                .stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int bomb = tokens[0];
        int power = tokens[1];
        while (numbers.contains(bomb)) {
            int bombIndex = numbers.indexOf(bomb);
            int startIndex = Math.max(0, bombIndex - power);
            int endIndex = Math.min(numbers.size() - 1, bombIndex + power);
            numbers.subList(startIndex,endIndex+1).clear();
        }

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);


    }
}
