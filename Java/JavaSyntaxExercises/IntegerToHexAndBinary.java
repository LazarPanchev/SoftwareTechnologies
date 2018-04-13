package JavaSyntaxExercises;

import java.util.Scanner;

public class IntegerToHexAndBinary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        String numInHex=Integer.toHexString(num);
        String numInBinary=Integer.toString(num,2);

        System.out.println(numInHex.toUpperCase());
        System.out.println(numInBinary);
    }
}
