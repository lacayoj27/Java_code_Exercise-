
public class DayOfTheWeek1{

/*Write a method with the name printDayOfWeek that has one parameter 
of type int and name it day.

The method should return any value (hint:void)

Using a switch statement print "Sunday", "Monday",...,"Saturday" if the int
parameter "day" is 0, 1,...,6 respectively, otherwise it should print "Invalid day"

Bonus: Write a second solution that uses if-else instead of switch 


*/

public static void main(String[] args) {
    

    printDayOfWeek(-1);
    printDayOfWeek(1);
    printDayOfWeek(2);
    printDayOfWeek(3);
    printDayOfWeek(4);
    printDayOfWeek(5);
    printDayOfWeek(6);
    printDayOfWeek(7);



}


public static void printDayOfWeek(int day)
{


    if(day == 1)
    {
        System.out.println("Monday");
    }else if(day == 2)
    {   
        System.out.println("Tuesday");
    }else if(day == 3)
    {
        System.out.println("Wednesday");
    }else if(day == 4)
    {
        System.out.println("Thursday");
    }else if(day == 5)
    {
        System.out.println("Friday");      
    }else if(day == 6)
    {
        System.out.println("Saturday");
    }else


    System.out.println("Invalid day");


    switch(day)
    {

    
        case 1:
        System.out.println("Monday");
        break;

        case 2:
        System.out.println("Tuesday");
        break;

        case 3:
        System.out.println("Wednesday");
        break;

        case 4:
        System.out.println("Thusday");
        break;

        case 5:
        System.out.println("Friday");
        break;

        case 6:
        System.out.println("Saturday");
        break;

        default:
        System.out.println("Invalid");


    }



}




}