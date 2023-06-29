class Candy{
	
	String candyName="Candy";
	String candyMadeFrom;
	double candyPrise=45.59;
	String candyMainIngrediants;
	
	
	Candy(){
	System.out.println("running Candy");
}
}


class CandyRun {
	public static void main (String[] args){
		System.out.println("runnning CandyRun");
		Candy ref= new Candy();
		System.out.println(ref.candyName);
		System.out.println(ref.candyMadeFrom);
		System.out.println(ref.candyPrise);
		System.out.println(ref.candyMainIngrediants);
	}
	
	}