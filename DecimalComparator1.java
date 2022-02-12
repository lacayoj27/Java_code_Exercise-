public class DecimalComparator1 {

/**
 * 
 * Method areEqualByThreeDecimalPlaces with two parameters of type double
 * 
 * The Method should return boolean and it needs to return true if two
 * double numbers are the same up to three decimals. Otherwise return false
 * 
 * areEqualByThreeDecimalPlaces(-3.1756, -3.175);  True
 * areEqualByThreeDecimalPlaces(3.175, 3.176);     False
 * 
 */

public static void main(String[] args) {

    System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));

}

public static boolean areEqualByThreeDecimalPlaces(double num1, double num2)
{

    return (long)(num1 * 1000) == (long)(num2 * 1000);

}

}
