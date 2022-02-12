

public class NumberDaysMonth1 {

    /*
     * 
     * Write a method isLeapYear with a parameter of type int named year
     * 
     * The parameter needs to be greater than or equal to 1 and less than or equal
     * to 9999
     * 
     * If the parameter is not in that range return false.
     * 
     * Otherwise, if it is in the valid range, calculate if the year is a leap year
     * and return true
     * if it is, otherwise return false.
     * 
     * A year is a leap year if it is divisible by 4 but not by 100,
     * or divisible by 400
     * 
     * isLeapYear(-1600); return false
     * isLeapYear(1600); return true
     * isLeapYear(); return false
     * isLeapYear(); return true
     * 
     * Write another method getDaysInMonth with two parameters month and year.
     * Both of type int
     * 
     * If parameter month is < 1 or > 12 return -1
     * If parameter year is < 1 or > 9999 return -1
     * 
     * This method needs to return the number of days in the month. Be careful about
     * leap years they have 29 days in month 2(Februrary).
     * 
     * You should check if the year is a leap year using the method isLeapYear 
     * 
     * getDaysInMonth(1 , 2020);  return 31 since January has 31 days
     * getDaysInMonth(2 , 2020);  return 29 since February has 29 days in a leap year and 2020 is a leap year
     * getDaysInMonth(2, 2018);   return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year
     * getDaysInMonth(-1, 2020);  return -1 since since the parameter month is invalid 
     * getDaysInMonth(1, -2020);  return -1 since the parameter year is outside the range
     * 
     * Use the switch statement 
     * 
     */



public static void main(String[] args) {
    
    System.out.println(isLeapYear(1600));
    System.out.println(isLeapYear(2000));
    System.out.println(isLeapYear(-1600));
    System.out.println(isLeapYear(2017));
    
    System.out.println(getDaysInMonth(1, 2020));
    System.out.println(getDaysInMonth(2, 2020));
    System.out.println(getDaysInMonth(2, 2018));
    System.out.println(getDaysInMonth(-1, 2020));
    System.out.println(getDaysInMonth(1, -2020));   

}

    public static boolean isLeapYear(int year) {

        if(year >=  0 && year <= 9999)
        {
            if(year % 4 == 0)
            {
                if(year % 100 == 0)
                {
                    if(year % 400 == 0)
                    {
                        return true;

                    }else return false;

                }else return true;

            }else return false;

        }else return false;
    }

    public static int getDaysInMonth(int month, int year){

      if((year >= 9999 && year < 1) && (month >= 1) && (month <= 12))
      {

            if(isLeapYear(year))
            {

                switch(month)
                {

                    case 1:case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;

                    case 2:
                    return 29;

                    case 4: case 6: case 9: case 11:
                    return 30;

                    default :
                    return -1;

                }

            }else{

                switch(month)
                {

                    case 1:case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;

                    case 2:
                    return 28;

                    case 4: case 6: case 9: case 11:
                    return 30;

                    default :
                    return -1;

                }

            }

        } return -1;
    
    }

}
