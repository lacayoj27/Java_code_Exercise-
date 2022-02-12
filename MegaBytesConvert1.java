public class MegaBytesConvert1 {

/**
 * 
 * Write a Method called printMegaBytesAndKiloBytes with 1 parameter
 * of type int with the name KiloBytes
 * 
 * The Method should not return anything: void and it needs to calculate
 * the megabytes and remaining kilobytes from the kiloBytes parameter
 * 
 * Needs to print XXKB = YYMB and ZZKB
 * if parameter kiloBytes is less than 0 print out invalid value
 * 
 * 2500KB = 2MB and 452KB
 * -1024KB = Invalid value
 * 5000KB = 4MB and 904KB 
 * 1024KB = 1MB and 0 KB 
 *  
 */



 public static void main(String[] args) {
     

    printMegaBytesAndKiloBytes(2500);
    printMegaBytesAndKiloBytes(-1024);
    printMegaBytesAndKiloBytes(5000);
    printMegaBytesAndKiloBytes(1024);


 }

 public static void printMegaBytesAndKiloBytes(int kiloBytes)
 {

    if(kiloBytes > 0)
    {

        System.out.println(kiloBytes + "KB = " + (kiloBytes/1024) + "MB and " + (kiloBytes%1024) + "KB");


    }else

    System.out.println("Invalid value");

 }


}
