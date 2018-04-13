package JavaSyntaxExercises;

import java.util.Scanner;

public class BooleanVariable {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String boolVar=scanner.nextLine();

        boolean variable=Boolean.parseBoolean(boolVar);
        if (variable){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
