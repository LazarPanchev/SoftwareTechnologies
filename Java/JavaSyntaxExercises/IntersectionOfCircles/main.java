package JavaSyntaxExercises.IntersectionOfCircles;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static boolean IsIntersect(Circle first, Circle second){
        double firstPart=Math.pow(first.getCenter().getX() - second.getCenter().getX(), 2);
        double secondPart= Math.pow(first.getCenter().getY() - second.getCenter().getY(), 2);
        double distance=Math.sqrt(firstPart+secondPart);

        if(first.getRadius()+second.getRadius()>=distance){
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int[] firstCircle= Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int firstX=firstCircle[0];
        int firstY=firstCircle[1];
        int firstR=firstCircle[2];

        int[] secondCircle= Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int secondX=secondCircle[0];
        int secondY=secondCircle[1];
        int secondR=secondCircle[2];

        Circle first= new Circle(
                new Point(firstX,firstY),firstR

        );

        Circle second = new Circle(
                new Point(secondX,secondY),secondR
        );

        if(IsIntersect(first,second)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }



}
