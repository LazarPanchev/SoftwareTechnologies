package JavaSyntaxLab;

import java.util.Scanner;

public class SymmetricNumbers {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        for (int i=1;i<=number; i++ ){
            String currentNum=""+i;
            if(IsSymmetric(currentNum)){
                System.out.print(currentNum + " ");
            }

        }
    }

    public static boolean IsSymmetric(String number){
        for(int i =0; i<number.length() /2 ;i++){
            if(number.charAt(i) != number.charAt(number.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
