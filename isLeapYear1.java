public class isLeapYear1 {

/**
 * 
 * Leap year calculator 
 * 
 * Write a method isLeapYear with a parameter of type int year
 * The parameter needs to be greater than or equal to 1 and less than or equal
 * to 9999
 * 
 * If the parameter is not in that range return false
 * 
 * Otherwise if it is in range, calculate if the year is a leap year and return 
 * true if it is a year is a leap year
 * 
 * To determine whether a year is a leap year 
 * 
 *          1.If the year is evenly divisible by 4, step 2, otherwise step 5
 *          2.If the year is evenly divisible by 100, step 3, otherwise step 4
 *          3.If the year is evenly divisible by 400, step 4, otherwise step 5
 *          4.The year is a leap year(366 days). Method returns true 
 *          5.The year is not a leap year(365 days). Method returns false
 * 
 *      System.out.println(isLeapYear(1600));      True
        System.out.println(isLeapYear(2000));      True
        System.out.println(isLeapYear(-1600));     False
        System.out.println(isLeapYear(2017));      False
 * 
 * 
 */


    public static void main(String[] args) {
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(2017));
    }


    public static boolean isLeapYear(int year)
    {

        if(year >= 0 && year <= 9999)
        {

            if(year % 4 == 0)
            {
                if(year % 100 == 0)
                {
                    if(year % 400 == 0)
                    {
                        return true;
                    }else 
                
                        return false;
                }else
                    return true;

            }else return false;

        }else return false;


    }


    
}
