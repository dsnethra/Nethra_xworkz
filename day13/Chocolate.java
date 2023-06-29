class Chocolate{
	
	String chocolateName="dairymilk";
	String chocolateMadeFrom;
	double chocolatePrise=45.59;
	String chocolateMainIngrediants;
	
	
	Chocolate(){
	System.out.println("running Chocolate");
}
}


class ChocolateRun {
	public static void main (String[] args){
		System.out.println("runnning chocolateRun");
		Chocolate ref= new Chocolate();
		System.out.println(ref.chocolateName);
		System.out.println(ref.chocolateMadeFrom);
		System.out.println(ref.chocolatePrise);
		System.out.println(ref.chocolateMainIngrediants);
	}
	
	}