public class SharedDigit1 {


/**
 * 
 * Write a method named hasSharedDigit with two parameters of type int
 * 
 * Each number should be within the range of 10(inclusive) - 99(inclusive).
 * It one of the numbers is not within the range, the method should return false.
 * 
 * The method should return true if there is a digit thatappears in both numbers, such as
 * 2 in 12 and 23, otherwise, the method should return false.
 * 
 * hasSharedDigit(12, 23);     return true
 * hasSharedDigit(9, 99);      return false 
 * hasSharedDigit(15, 55);     return true;
 * 
 */
    public static void main(String[] args) {
        
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));

    }

    public static boolean hasSharedDigit(int num1, int num2){
   
           if((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)){
   
               return false;
   
           }
   
           int firstdigitnum1 = num1 / 10;
   
           int seconddigitnum1 = num1 % 10;
   
           int firstdigitnum2 = num2 / 10;
   
           int seconddigitnum2 = num2 % 10;
   
           if ((firstdigitnum1 == firstdigitnum2) || (firstdigitnum1 == seconddigitnum2)
   
                   || (seconddigitnum1 == firstdigitnum2) || (seconddigitnum1 == seconddigitnum2)){
   
               return true;
   
           }
   
           return false;
   
       }
   

    
}


