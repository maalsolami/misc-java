package misc;

public class TestFraction {

	public static void main(String[] args) {
		TestAddFraction(new Fraction(3, 7),
						new Fraction(2, 3),
						new Fraction(23, 21));
	}
	public static void TestAddFraction(Fraction p, Fraction q, Fraction expected){
		System.out.println("Testing " + p + " + " + q);
		System.out.println("expected = " + expected);
		
		Fraction actual = p.add(q);
		
		if (actual.equals(expected)){
			System.out.println( p  + " + " + q + " = " + actual + " -------- Pass"); 
		} else {
			System.err.println(p  + " + " + q + " = " + actual + " -------- Fail"); 
		}
		System.out.println("--------");
	}
}