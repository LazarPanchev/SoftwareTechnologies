package JavaSyntaxExercises;

import java.util.Scanner;

public class VariableInHexadecimalFormat {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String numberHexadecimal=scanner.nextLine();
        int number=Integer.parseInt(numberHexadecimal, 16);

        System.out.println(number);

    }
}
