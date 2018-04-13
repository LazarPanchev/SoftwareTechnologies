package JavaSyntaxExercises;

import java.util.Scanner;

public class VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[] vowels = {'a', 'e', 'o', 'u', 'y', 'i'};
        char inputChar=scanner.next().charAt(0);
        boolean isVowel=false;
        for(int i=0; i<vowels.length;i++){
            if(inputChar == vowels[i]){
                isVowel=true;
            }
        }

        boolean isDigit=true;


        if(isVowel){
            System.out.println("vowel");
        }else if(inputChar>=48 && inputChar<=57){
            System.out.println("digit");
        }else {
            System.out.println("other");
        }
    }
}
