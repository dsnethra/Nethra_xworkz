class Oil {

String name;
int price;
boolean quality;
String shop;
String location;

Oil() 
{
	System.out.println("running no argument oil");
	
}

Oil(String name,int price,boolean quality,String shop,String location)
{
	this.name=name;
	this.price=price;
	this.quality=quality;
	this.shop=shop;
	this.location=location;
	
}

void display()         //display can any name       this method is non static method (instance method) implicitly this can access 
{
	System.out.println(this.name);                       //construcor
	System.out.println(this.price);
	System.out.println(this.quality);
	System.out.println(this.shop);
	System.out.println(this.location);
	
}

}

class OilRun {
	public static void main(String[] args){
		
		Oil oil= new Oil();
		oil.display();
		
		Oil oil1=new Oil("nayana",200,true,"oilshop","bng");
		oil1.display();
		
		System.out.println("updating data");
		 oil1.name="nethra";
		  oil1.price=100;
		 oil1.quality=false;
		 oil1.shop="shop";
		  oil1.location="mysore";
		
		 oil1.display();
		
	}
}
		
		
		
	


