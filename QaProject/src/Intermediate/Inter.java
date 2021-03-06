package Intermediate;
import java.util.*;

public class Inter {

	public void run () {
		
		System.out.println(uniqueSum(6,3,2));
	}//end of run
	
	public int uniqueSum (int a, int b, int c) {
		
		ArrayList<Integer> sumArray = new ArrayList<Integer>();
		
		sumArray.add(a);
		sumArray.add(b);
		sumArray.add(c);
		
		int checkDupA = Collections.frequency(sumArray, a);
		int checkDupB = Collections.frequency(sumArray, b);
		int checkDupC = Collections.frequency(sumArray, c);
		
		if (checkDupA > 1) {
			sumArray.remove(a);
		}
		if (checkDupB > 1) {
			sumArray.remove(b);
		}
		if (checkDupC > 1) {
			sumArray.remove(c);
		}
		
		int sum = 0;
		for (int i = 0; i < sumArray.size(); i++) {
			sum += sumArray.get(i);
		}return sum;
	}//end of uniqueSum
}//end of Inter
