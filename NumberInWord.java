public class NumberInWord {
    
    /*

    Write a method called printNumberInWorld. The method has one parameter number 
    which is the whole number. The method needs to print "ZERO", "ONE", "TWO", ..."NINE", "OTHER"
    if the int parameter number is 0,1,2,3,...,9 or other number including negative numbers.
    You can use if-else statement or switch statement 

    Method printNumberInWord needs to be public static for now, we are only using static methods

    */

    public static void main(String[] args) {
        
        printNumberInWord(2);

    }

    public static void printNumberInWord(int number)
    {

        if(number == 1)
        {
            System.out.println("ONE");  
        }else if(number == 2)
        {
            System.out.println("TWO");
        }else if(number == 3)
        {
            System.out.println("THREE");
        }else if(number == 4)
        {
            System.out.println("FOUR");
        }else if(number == 5)
        {
            System.out.println("FIVE");   
        }else if(number == 6)
        {
            System.out.println("SIX");
        }else if(number == 7)
        {
            System.out.println("SEVEN");
        }else if(number == 8)
        {
            System.out.println("EIGHT");
        }else if(number == 9)
        {
            System.out.println("NINE");
        }else 

        System.out.println("Some other number");


        switch (number) {
            case 1:
                System.out.println("ONE");  
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;

            default:
                System.out.println("Some other number");
                break;
        }




    }







}
