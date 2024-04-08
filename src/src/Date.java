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
            this.month = newMonth();
        }
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            if(day > 0 && day <= 31){
                this.day = day;
            }else{
                this.day = newDay();
            }
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
            if(day > 0 && day <= 30){
                this.day = day;
            }else{
                this.day = newDay();
            }
        } else{

        }

    }

    public static int newMonth(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Error, invalid month, reenter month: ");
        int input = keyboard.nextInt();
        if(input > 0 && input <= 12){
             return input;
        } else {
            System.out.println("Error, invalid month, reenter month: ");
            return newMonth();
        }
    }
    public static int newDay(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("");

    }

}
