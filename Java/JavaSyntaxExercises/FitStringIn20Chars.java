package JavaSyntaxExercises;

import java.util.Scanner;

public class FitStringIn20Chars {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String text= scanner.nextLine();
        if(text.length()<20){
            System.out.println(text+RightPad(20-text.length()));
        }else {
            System.out.println(text = text.substring(0, 20));
        }

    }

    private static String RightPad(int length) {
        String result="";
        for(int i=0; i<length; i++)
        {
            result+='*';
        }
        return result;
    }
}
