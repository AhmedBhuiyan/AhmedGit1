package ifIF;

import java.util.Scanner;

public class IfCon {

	public static void main(String[] args) {
		
    	Scanner scan = new Scanner(System.in);
		System.out.println("What is your body temperature?");
			double bodyTemperature=scan.nextDouble();
	


    if (bodyTemperature>56.7 && bodyTemperature<97) {
    	System.out.println("your body temperature is "+bodyTemperature+".  This is an unhealthy body tempurature" );
    }else if (bodyTemperature>98 && bodyTemperature<100) {
    	System.out.println("your body temperature is "+bodyTemperature+". This is a healthy body tempurature" );
    }else if (bodyTemperature>=100 && bodyTemperature<115) {
    	System.out.println("Your body temperature is "+bodyTemperature+". You have a fever");
    }else   {
    	System.out.println("Your body tempuerature can't be "+bodyTemperature+ "    This isn't a possible body temperature.");
    
}
	}	
    
}	
    
   

