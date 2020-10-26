package misc;

class Coin {
	private double value;
	
	public Coin(double value) 
		{setValue(value);}
	public void setValue(double value) 
		{this.value = value;}
	
	public double getValue() 
		{return value;}
	
	//TODO Implement 
	public boolean equals(Object that) {
		return false;
	}
	
	public static void main( String args[]){
		Coin halfRiyal = new Coin(0.50);
		Coin anotherHalfRiyal = new Coin(0.50);
		Coin quarterRiyal = new Coin(0.25);
		
		System.out.println(halfRiyal.equals(anotherHalfRiyal)); //true
		System.out.println(halfRiyal.equals(quarterRiyal)); //false
	}
}
