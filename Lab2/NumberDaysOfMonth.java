package Lab2;
import java.util.Scanner;
public class NumberDaysOfMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int number_Of_DaysInMonth = 0; 
        String MonthOfName = "Unknown";

        
        int month = 0;
        String NameofMonth = null; 
        while(month == 0) {
        	System.out.print("Input a month number: ");
        	NameofMonth = input.next();
        	if( NameofMonth.equals("1")||
        		NameofMonth.equals("January")||
        		NameofMonth.equals("Jan")||
        		NameofMonth.equals("Jan."))month =1;
        	else if( NameofMonth.equals("2")||
            		NameofMonth.equals("February")||
            		NameofMonth.equals("Feb")||
            		NameofMonth.equals("Feb."))month =2;
        	else if( NameofMonth.equals("3")||
        			NameofMonth.equals("Marth")||
            		NameofMonth.equals("Mar")||
            		NameofMonth.equals("Mar."))month =3;
        	else if( NameofMonth.equals("4")||
            		NameofMonth.equals("April")||
            		NameofMonth.equals("Apr")||
            		NameofMonth.equals("Apr."))month =4;
        	else if( NameofMonth.equals("5")||
            		NameofMonth.equals("May")||
            		NameofMonth.equals("May")||
            		NameofMonth.equals("May."))month =5;
        	else if( NameofMonth.equals("6")||
            		NameofMonth.equals("June")||
            		NameofMonth.equals("Jun")||
            		NameofMonth.equals("Jun."))month =6;
        	else if( NameofMonth.equals("7")||
            		NameofMonth.equals("July")||
            		NameofMonth.equals("Jul")||
            		NameofMonth.equals("Jul."))month =7;
        	else if( NameofMonth.equals("8")||
            		NameofMonth.equals("August")||
            		NameofMonth.equals("Aug")||
            		NameofMonth.equals("Aug."))month =8;
        	else if( NameofMonth.equals("9")||
            		NameofMonth.equals("September")||
            		NameofMonth.equals("Sep")||
            		NameofMonth.equals("Sep."))month =9;
        	else if(NameofMonth.equals("10")||
            		NameofMonth.equals("Octember")||
            		NameofMonth.equals("Oct")||
            		NameofMonth.equals("Oct."))month =10;
        	else if( NameofMonth.equals("11")||
        			NameofMonth.equals("November")||
        			NameofMonth.equals("Nov")||
        			NameofMonth.equals("Nov."))month =11;
        	else if( NameofMonth.equals("12")||
        			NameofMonth.equals("December")||
        			NameofMonth.equals("Dec")||
        			NameofMonth.equals("Dec."))month =12;
        }
        
        int year = -1000;
        while(year < 0){
        	System.out.print("Input a year: ");
        	year= input.nextInt();

        };

        switch (month) {
            case 1:
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    number_Of_DaysInMonth = 29;
                } else {
                    number_Of_DaysInMonth = 28;
                }
                break;
            case 3:
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                number_Of_DaysInMonth = 31;
        }
        System.out.print(NameofMonth + " " + year + " has " + number_Of_DaysInMonth + " days\n");
    }
}

