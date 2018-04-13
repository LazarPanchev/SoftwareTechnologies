package JavaSyntaxExercises;

        import java.util.Scanner;

public class IndexOfLetters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[] wordsChars=scanner.next().toLowerCase().toCharArray();

        for (int i=0; i<wordsChars.length; i++){
            char currentChar=wordsChars[i];
            int index=wordsChars[i]-97;
            System.out.printf("%c -> %d%n", currentChar,index);
        }
    }
}
