class Cake{
	
	String cakeName="hani cake";
	String cakeMadeFrom;
	double cakePrise=45.59;
	String cakeMainIngrediants;
	
	
	Cake(){
	System.out.println("running cake");
}
}


class CakeRun {
	public static void main (String[] args){
		System.out.println("runnning cakeryn");
		Cake ref= new Cake();
		System.out.println(ref.cakeName);
		System.out.println(ref.cakeMadeFrom);
		System.out.println(ref.cakePrise);
		System.out.println(ref.cakeMainIngrediants);
	}
}