public class SpeedConverter1 {

/*

Write a method called toMilesPerHour that has 
one parameter of type double with the name kilometerPerHour
This method needs to return the rounded value of the 
calculation type long 

If the parameter kilometerPerHour is < 0 the method toMilesPerHour return -1
to indicate invalid value.

Otherwise if positive, calculate the value of miles per hour,
round it and return it

Write a method printConversion with parameter double named kilometerPerHour
The method is void. It needs to calculate milesPerHour form KilometersPerHour

            xxkm/h = yymi/h

If parameter is < 0 print invalid value 
Use method Math.Round()  1 mile = 1.609kilometer/hour


*/
public static void main(String[] args) {
    

    toMilesPerHour(1.609);
    toMilesPerHour(-3);
    toMilesPerHour(300);

    printConversion(1.609);
    printConversion(-3);
    printConversion(300);




}

public static long toMilesPerHour(double kilometerPerHour)
{

    if(kilometerPerHour < 0)
    {
        return -1;
    }else

        return Math.round(kilometerPerHour/1.609);

}

public static void printConversion(double kilometerPerHour)
{

    if(kilometerPerHour < 0)
    {

        System.out.println("Invalid Value");

    }else

    if(kilometerPerHour > 0)
    {

        long milesPerHour = toMilesPerHour(kilometerPerHour);
        System.out.println(kilometerPerHour + "km/h = " + milesPerHour + "Mi/h");

    }

}



    
}
