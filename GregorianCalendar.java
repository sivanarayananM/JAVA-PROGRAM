public class GregorianCalendar {
    public static void main(String[] args) {

        String date = "2019-02-10";
        int year =Integer.parseInt(date.substring(0,4));   //Converting string into integer
        int month=Integer.parseInt(date.substring(5,7));
        int day=Integer.parseInt(date.substring(8,10));

        System.out.println(DayOfYear(day,year,month));
    }

    public static boolean LeapYear(int year){    //Checking for leap year
        if(year%4==0 && (year%100!=0 || year%400==0)){
            return true;
        }return false;
    }
   public static int DayOfYear(int day,int year,int month){  //Finding day number of the year
       int[] daysInmonths={31,28,31,30,31,30,31,31,30,31,30,31};
       if(LeapYear(year)) {      //If leap year 2nd month=29 days
           daysInmonths[1]=29;
       }
       int DayofYear=day;
       for (int i = 0; i < month-1; i++) {
           DayofYear+=daysInmonths[i];
       }
       return DayofYear;
   }

}

/*
Example 1:
Input: date = "2019-01-09"
Output: 9
Explanation: Given date is the 9th day of the year in 2019.
Example 2:
Input: date = "2019-02-10"
Output: 41
 */