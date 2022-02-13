public class SumOdd1 {

/**
 * 
 * Write a method called isOdd with an int parameter and call it number. The method needs to
 * return a boolean 
 * 
 * check that number is > 0, if it is not return false.
 * 
 * If number is odd return true, otherwise return false.
 * 
 * Write a second method called sumOdd that has 2 int parameters start and end,
 * which represent a range of numbers. 
 * 
 * The method should use a for loop to sum all odd numbers in the range including the end
 * and return the sum 
 * 
 * It should call the method isOdd to check if each number is odd
 * 
 * The parameter end needs to be greater than or equal to start and both start and end
 * parameter have to be greater than 0
 * 
 * If those conditions ar enot satisfied return -1 from the method to indicate invalid input
 * 
 * sumOdd(1, 100);  should return 2500
 * sumOdd(-1, 100); should return -1
 * sumOdd(100, 100); should return 0
 * sumOdd(13, 13);  should return 13 (This set contains one number, 13, and it is odd)
 * sumOdd(100, -100); should return -1
 * sumOdd(100, 1000); should return 247500
 * 
 * 
 * use the remainder operator to check if the number is odd
 * 
 * 
 */
public static void main(String[] args) {
    
    System.out.println(isOdd(2));
    System.out.println(isOdd(3));
    System.out.println(isOdd(4));

    System.out.println(sumOdd(1, 100));
    System.out.println(sumOdd(-1, 100));
    System.out.println(sumOdd(100, 100));
    System.out.println(sumOdd(13, 13));
    System.out.println(sumOdd(100, -100));
    System.out.println(sumOdd(100, 1000));
 
 
 
}

public static int sumOdd(int start, int end)
{

    int sum = 0;

    if((end < start) || (end < 0) || (start < 0))
    {
        return -1;
    }else {


//using<= was causing a problem in the program, fix it by <
    for(int i = start; i < end; i++)
    {

        if(isOdd(i))
        {
            sum += i;

        }

        
    }

}

return sum;

}


 public static boolean isOdd(int number)
 {

    if(number > 0)
    {


        if(number % 2 == 0)
        {
            return false;
        }else

        return true;

    }else

    return false;

 }

}
