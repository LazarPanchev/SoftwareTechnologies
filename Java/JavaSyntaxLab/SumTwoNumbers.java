package JavaSyntaxLab;

import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double firstNum = scan.nextDouble();
        double secondNum = scan.nextDouble();

        double result = firstNum + secondNum;
        System.out.println(result);
    }
}