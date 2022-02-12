public class demo
{
    
    public static void main(String[] args) {

        int counter= 0;
        int number = 12121;

        int num = number;
        int reverse = 0;
        while(number != 0){
            int lastDigit = number % 10;
            number /= 10;
            reverse = (reverse * 10) + lastDigit;
            counter++;
    


        }if(num == reverse){
            System.out.println("Positive" + counter);
        } else System.out.println("Negative" + counter);
    }

}
