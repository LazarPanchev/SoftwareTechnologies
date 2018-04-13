package JavaSyntaxLab;
import java.util.Scanner;

public class ThreeIntegersSum {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int firstNum= scanner.nextInt();
        int secondNum= scanner.nextInt();
        int thirdNum= scanner.nextInt();

        if(!checkNumbers(firstNum,secondNum,thirdNum)
                && !checkNumbers(firstNum,thirdNum,secondNum)
                && !checkNumbers(secondNum,thirdNum,firstNum)){
            System.out.println("No");
        }



    }

    public static boolean checkNumbers(int first, int second, int sum) {

        if(first+second == sum) {
            if(first>second){
                int temp=first;
                first=second;
                second=temp;
            }

            System.out.printf("%d + %d = %d", first,second,sum);
            return true;
        }else {
            return false;
        }

    }
}
