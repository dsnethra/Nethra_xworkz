class Bun{
	
	String bunName="cream bun";
	String bunMadeFrom;
	double bunPrise=45.59;
	String bunMainIngrediants;
	
	
	Bun(){
	System.out.println("running Bread");
}
}


class BunRun {
	public static void main (String[] args){
		System.out.println("runnning bunRun");
		Bun ref= new Bun();
		System.out.println(ref.bunName);
		System.out.println(ref.bunMadeFrom);
		System.out.println(ref.bunPrise);
		System.out.println(ref.bunMainIngrediants);
	}
	
	}