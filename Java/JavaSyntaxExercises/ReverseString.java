package JavaSyntaxExercises;

import java.io.Console;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String word=scanner.nextLine();
        for (int i=word.length()-1; i>=0; i--){
            System.out.print(word.charAt(i));
        }
    }
}
