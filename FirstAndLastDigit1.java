public class FirstAndLastDigit1 {

   
/**
 * Write a method named sumFirstAndLastDigit with one parameter of type int called number
 * 
 * The method needs to find the first and last digit of the parameter number passed to the 
 * method, using a loop and return the sum of the first and last digit of that number 
 * 
 * If the number is negative then the method needs to return -1 to indicate an invalid value 
 * 
 * sumFirstAndLastDigit(252);  Return 4, the first digit is 2 and the last digit is 2, 2 + 2 = 4
 * sumFirstAndLastDigit(257);  return 9, the first digit is 2 and the last digit is 7, 2 + 7 = 9
 * sumFirstAndLastDigit(0);    return 0, 0 + 0 = 0
 * sumFirstAndLastDigit(5);    return 10, the first and last digit is 5
 * sumFirstAndLastDigit(-10);  return -10, return -1 is parameter is negative number and needs to be positive 
 * 
 */
    

    public static int sumFirstAndLastDigit(int number){
         if(number < 0){
             return -1;
         }
         int lastdigit = number % 10;
         int firstdigit = 0;
         int num = number;
         while(num >= 10){
            num = num / 10;
         }
         firstdigit = num;
         int sum = lastdigit + firstdigit;
         return sum;
     }
 

}
