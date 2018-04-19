package JavaSyntaxExercises;

import java.util.Scanner;

public class UrlParser {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String protocol="";
        String resources="";
        if(input.contains("://")){
            int index=input.indexOf(':');
            protocol=input.substring(0,index);
            input=input.substring(index+3,input.length());
        }

        if(input.contains("/")){
            int index=input.indexOf('/');
            resources=input.substring(index+1,input.length());
            input=input.substring(0,index);
        }

        System.out.printf("[protocol] = \"%s\"%n",protocol);
        System.out.printf("[server] = \"%s\"%n",input);
        System.out.printf("[resource] = \"%s\"%n",resources);
    }
}
