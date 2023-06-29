class Biscuit{
	
	String biscuitName="HAPPY HAPPY";
	String biscuitMadeFrom;
	double biscuitPrise=45.59;
	String biscuitMainIngrediants;
	
	
	Biscuit(){
	System.out.println("running Biscuit");
}
}


class BiscuitRun {
	public static void main (String[] args){
		System.out.println("runnning Biscuitrun");
		Biscuit ref= new Biscuit();
		System.out.println(ref.biscuitName);
		System.out.println(ref.biscuitMadeFrom);
		System.out.println(ref.biscuitPrise);
		System.out.println(ref.biscuitMainIngrediants);
	}
	
	}
	