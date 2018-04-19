package JavaSyntaxExercises;

import java.util.Scanner;

public class ChangeToUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        int opentag = inputText.indexOf("<upcase>");
        int closetag = inputText.indexOf("</upcase>");
        while (opentag != -1 && closetag != -1) {
            String textForReplace = inputText.substring(opentag, closetag+9);
            String textForUpper=inputText.substring(opentag+8,closetag).toUpperCase();
            inputText=inputText.replace(textForReplace, textForUpper);

            opentag = inputText.indexOf("<upcase>");
            closetag = inputText.indexOf("</upcase>");
        }

        System.out.println(inputText);
    }
}
