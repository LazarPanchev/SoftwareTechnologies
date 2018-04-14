package JavaSyntaxExercises;
import java.util.*;

public class PhoneBookUpgrade {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            if (command.equals("A")) {
                String name = tokens[1];
                String number = tokens[2];
                if (!map.containsKey(name)) {
                    map.put(name, "");
                }
                map.put(name, number);

            } else if (command.equals("S")){
                String name = tokens[1];
                if (map.containsKey(name)) {
                    System.out.printf("%s -> %s%n",name,map.get(name));
                }else{
                    System.out.printf("Contact %s does not exist.%n",name);
                }
            }else if(command.equals("ListAll")) {
                for (Map.Entry<String, String> entry : map.entrySet()){
                    System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
                }


            }

            input = scanner.nextLine();

        }
    }
}
