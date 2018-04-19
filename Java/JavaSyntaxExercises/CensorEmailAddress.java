package JavaSyntaxExercises;

import java.util.Scanner;

public class CensorEmailAddress {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String email= scanner.nextLine();
        String username=email.split("@")[0];
        String domain=email.split("@")[1];
        String text=scanner.nextLine();

        String replacement=ReplaceText(username)+'@'+domain;
        System.out.println(text.replace(email,replacement));
    }

    private static String ReplaceText(String username) {
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<username.length(); i++){
            sb.append('*');
        }

        return sb.toString();
    }
}
