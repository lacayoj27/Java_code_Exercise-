public class BarkingDog1{

/*
We have a dog that likes to bark. We need to wake up if 
the dog is barking at night.

Write a method with 2 parameters 
boolean bark, int hourOfDay with range 0 to 23

Wake up if dogis barking before 8 or after 22 hours; return true
return false if otherwise.

If hourOfDay < 0 or hourOfDay > 23 return false

shouldWakeup(true, 1);     true
shouldWakeup(false, 2);    false
shouldWakeup(true, 3);     false
shoudlWakeup(true,-1);     false

*/

public static void main(String[] args) {
    
System.out.println(shouldWakeUp(true, 1));
System.out.println(shouldWakeUp(false, 2));
System.out.println(shouldWakeUp(true,8));
System.out.println(shouldWakeUp(true, -1));

}


public static boolean shouldWakeUp(boolean bark, int timeOfDay)
{


if(bark == false)
{

    return false;

}


if (bark){


    if(timeOfDay >= 0 && timeOfDay<=23)
    {


        if(timeOfDay >= 8 && timeOfDay<=22){

            return false;

        }else

        return true;

    }else

    return false;

}else 

return false;


}


    
}

