package JavaSyntaxExercises;

import javax.xml.crypto.Data;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CountWorkingDays {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String firstDate=scanner.nextLine();
        String secondDate=scanner.nextLine();
        int totalDays=0;

        int[] holidayDays={
                1, 3, 1, 6, 24, 6, 22, 1, 24, 25, 26
        };

        int[] holidayMonths = {
                1, 3, 5, 5, 5, 9, 9, 11, 12, 12, 12
        };

        LocalDate startDate= LocalDate
                .parse(firstDate,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate endDate= LocalDate
                .parse(secondDate,DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        for(LocalDate currentDate=startDate;
            currentDate.isBefore(endDate.plusDays(1));
            currentDate=currentDate.plusDays(1)){

            DayOfWeek day = currentDate.getDayOfWeek();
            int dayAsNumber=day.getValue();
            if(dayAsNumber==6 || dayAsNumber==7){
                continue;
            }

            int month= currentDate.getMonthValue();
            int dayAsInt = currentDate.getDayOfMonth();

            boolean isHoliday=false;



            for(int i=0; i<holidayDays.length; i++){
                if(holidayDays[i]==dayAsInt && holidayMonths[i]==month){
                    isHoliday=true;
                    break;
                }
            }

            if(isHoliday){
                continue;
            }

            totalDays++;
        }

        System.out.println(totalDays);
    }
}
