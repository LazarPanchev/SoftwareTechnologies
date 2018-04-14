package JavaSyntaxExercises;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");
        while (!tokens[0].equals("END")) {
            String command = tokens[0];
            String name = tokens[1];
            if (command.equals("A")) {
                String number = tokens[2];
                if (!map.containsKey(name)) {
                    map.put(name, "");
                }
                map.put(name, number);

            } else {
                if (map.containsKey(name)) {
                    System.out.printf("%s -> %s%n",name,map.get(name));
                }else{
                    System.out.printf("Contact %s does not exist.%n",name);
                }
            }

            tokens = scanner.nextLine().split("\\s+");

        }
    }
}
