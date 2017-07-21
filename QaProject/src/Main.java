import Factorals.FactoralRunner;
import Intermediate.Garage;
import Intermediate.Inter;
import Intermediate.PersonRunner;
import beginner.Beginner;
import Intermediate.PaintCalculator;
import Intermediate.PeopleRunner;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Beginner b = new Beginner();
		b.run();
		
		System.out.println("");
		
		Inter I = new Inter();
		I.run();
		
		System.out.println("");

		PersonRunner OO = new PersonRunner();
		OO.run();
		
		System.out.println("");

		Garage g = new Garage();
		g.run();
		
		PaintCalculator p = new PaintCalculator();
		p.run();
		
		//FactoralRunner f = new FactoralRunner();
		
		PeopleRunner pr = new PeopleRunner();
		pr.run();
		

	}// end of main

}// end of Main
