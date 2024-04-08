import java.util.Scanner;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day){
        this.year = year;
        if(month > 0 && month <= 12){
            this.month = month;
        } else{
            System.out.println("Error, invalid month, reenter month: ");
            this.month = newMonth();
        }
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){

        }
    }

    public static int newMonth(){
        Scanner keyboard = new Scanner(System.in);
        int input = keyboard.nextInt();
        if(input > 0 && input <= 12){
             return input;
        } else {
            System.out.println("Error, invalid month, reenter month: ");
            return newMonth();
        }
    }

}
