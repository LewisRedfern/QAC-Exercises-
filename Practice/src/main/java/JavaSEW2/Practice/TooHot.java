package JavaSEW2.Practice;

public class TooHot {

	public void run () {
		
		season (90);
	}
	
	public boolean season (int temp) {
		
		int temperature = temp;
		boolean isSummer = false;
		
		if (temperature <= 100 || temperature >= 60) {
			
			isSummer = true;
		}
		
		else if (temperature <=90 || temperature >=60) {
			
			isSummer = true;
		}
		
		else {
			
			isSummer = false;
		}
		
		System.out.println("is it summer?: " + isSummer);
		return isSummer;
	}
}
