import java.util.Scanner;

public class Date {
    private int year;
    private int month;
    private int day;

    public static void main(String[]args){
        Date date = new Date(9, 4, 2004);
        date.report();
        date.nextDay();
        int age = 0;
        //as of 4/9/24 this gets you from my birth to today, and tells me happy birthday every time
        for(int i = 0; i < 7156; i++){
            date.nextDay();
            if(date.getDay() == 4 && date.getMonth() == 9){
                age ++;
                System.out.println("Happy birthday, you are " + age);
            }
        }
        date.report();
    }

    //constructor checks if the date is valid
    public Date(int month, int day, int year){
        this.year = year;
        if(month > 0 && month <= 12){
            this.month = month;
        } else{
            this.month = newMonth(true, 0);
        }
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            if(day > 0 && day <= 31){
                this.day = day;
            }else{
                this.day = newDay(true, 0);
            }
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
            if(day > 0 && day <= 30){
                this.day = day;
            }else{
                this.day = newDay(true, 0);
            }
        }else if(year % 4 != 0){
            if(day > 0 && day <= 28){
                this.day = day;
            } else{
                this.day = newDay(true, 0);
            }
        } else{
            if(year % 100 == 0 && year % 400 != 0){
                if(day > 0 && day <= 28){
                    this.day = day;
                } else{
                    this.day = newDay(true, 0);
                }
            } else{
                if(day > 0 && day <= 29){
                    this.day = day;
                } else{
                    this.day = newDay(true, 0);
                }
            }
        }

    }
    public void setDate(int month, int day, int year){
        this.year = year;
        newDay(false, day);
        newMonth(false, month);
    }

    //updates date + one day
    public void nextDay(){
        if(month != 12){
            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10){
                if(day == 31){
                    day = 1;
                    month ++;
                }else{
                    day ++;
                }
            }else if(month == 4 || month == 6 || month == 9 || month == 11){
                if(day == 30){
                    day = 1;
                    month ++;
                }else{
                    day ++;
                }
            }else if(year % 4 != 0){
                if(day == 28){
                    day = 1;
                    month ++;
                } else{
                    day ++;
                }
            } else{
                if(year % 100 == 0 && year % 400 != 0){
                    if(day == 28){
                        day = 1;
                        month ++;
                    } else{
                        day ++;
                    }
                } else{
                    if(day == 29){
                        day = 1;
                        month ++;
                    } else{
                        day ++;
                    }
                }
            }
        } else{
            if(day == 31){
                year ++;
                month = 1;
                day = 1;
            } else{
                day ++;
            }
        }
    }

    @Override
    public String toString(){
        return month + "/" + day + "/" + year;
    }
    public void report(){
        System.out.println(month + "/" + day + "/" + year);
    }

    //day & month checkers
    public static int newMonth(boolean userInput, int inMonth){
        int input;
        if(userInput){
            input = input();
        } else{
            input = inMonth;
        }
        if(input > 0 && input <= 12){
             return input;
        } else {
            System.out.println("Error invalid month, reenter month: ");
            return newMonth(true, 0);
        }
    }
    public int newDay(boolean userInput, int inDay){
        if(userInput){
            day = input();
        } else{
            day = inDay;
        }
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            if(day > 0 && day <= 31){
                return day;
            }else{
                System.out.println("Error invalid day, enter new day: ");
                return newDay(true, 0);
            }
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
            if(day > 0 && day <= 30){
                return day;
            }else{
                System.out.println("Error invalid day, enter new day: ");
                return newDay(true, 0);
            }
        }else if(year % 4 != 0){
            if(day > 0 && day <= 28){
                return day;
            } else{
                System.out.println("Error invalid day, enter new day: ");
                return newDay(true, 0);
            }
        } else{
            if(year % 100 == 0 && year % 400 != 0){
                if(day > 0 && day <= 28){
                    return day;
                } else{
                    System.out.println("Error invalid day, enter new day: ");
                    return newDay(true, 0);
                }
            } else{
                if(day > 0 && day <= 29){
                    return day;
                } else{
                    System.out.println("Error invalid day, enter new day: ");
                    return newDay(true, 0);
                }
            }
        }
    }

    //getters & setters
    public void setDay(int inDay) {
        newDay(false, inDay);
    }
    public void setMonth(int inMonth){
        newMonth(false, inMonth);
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }

    public static int input(){
        Scanner keyboard = new Scanner(System.in);
        return keyboard.nextInt();
    }

}