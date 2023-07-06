class ToothPaste {

String name;
String colour;
int price;
String brandAmbassidor;
int freshness;
int mdate;
int edate;
int quantity;

ToothPaste(String name,String colour,int price,String brandAmbassidor,int freshness,int mdate,int edate,int quantity)
{
this.name=name;
this.colour=colour;
this.price=price;
this.brandAmbassidor=brandAmbassidor;
this.freshness=freshness;
this.mdate=mdate;
this.edate=edate;
this.quantity=quantity;
}

}

class ToothPasteRun {
	public static void main(String[] args){
		System.out.println("running main toothpasterun");
		ToothPaste ref1=new ToothPaste("name1","colour1",40,"brandAmbassidor1",24,2020,2022,100);
		ToothPaste ref2=new ToothPaste("name2","colour2",10,"brandAmbassidor2",12,2022,2024,50);
		ToothPaste ref3=new ToothPaste("name3","colour3",100,"brandAmbassidor3",24,2022,2025,750);
		ToothPaste ref4=new ToothPaste("name4","colour4",200,"brandAmbassidor4",24,2020,2022,1);
		ToothPaste ref5=new ToothPaste("name5","colour5",300,"brandAmbassidor5",24,2020,2022,2);
		ToothPaste ref6=new ToothPaste("name6","colour6",400,"brandAmbassidor6",24,2020,2022,3);
		ToothPaste ref7=new ToothPaste("name7","colour7",500,"brandAmbassidor7",24,2020,2022,4);
		ToothPaste ref8=new ToothPaste("name8","colour8",600,"brandAmbassidor8",24,2024,2028,5);


System.out.println(ref1.name);
System.out.println(ref1.colour);
System.out.println(ref1.price);
System.out.println(ref1.brandAmbassidor);
System.out.println(ref1.freshness);
System.out.println(ref1.mdate);
System.out.println(ref1.edate);
System.out.println(ref1.quantity);

System.out.println(ref2.name);
System.out.println(ref2.colour);
System.out.println(ref2.price);
System.out.println(ref2.brandAmbassidor);
System.out.println(ref2.freshness);
System.out.println(ref2.mdate);
System.out.println(ref2.edate);
System.out.println(ref2.quantity);

System.out.println(ref3.name);
System.out.println(ref3.colour);
System.out.println(ref3.price);
System.out.println(ref3.brandAmbassidor);
System.out.println(ref3.freshness);
System.out.println(ref3.mdate);
System.out.println(ref3.edate);
System.out.println(ref3.quantity);

System.out.println(ref4.name);
System.out.println(ref4.colour);
System.out.println(ref4.price);
System.out.println(ref4.brandAmbassidor);
System.out.println(ref4.freshness);
System.out.println(ref4.mdate);
System.out.println(ref4.edate);
System.out.println(ref4.quantity);

System.out.println(ref5.name);
System.out.println(ref5.colour);
System.out.println(ref5.price);
System.out.println(ref5.brandAmbassidor);
System.out.println(ref5.freshness);
System.out.println(ref5.mdate);
System.out.println(ref5.edate);
System.out.println(ref5.quantity);

System.out.println(ref6.name);
System.out.println(ref6.colour);
System.out.println(ref6.price);
System.out.println(ref6.brandAmbassidor);
System.out.println(ref6.freshness);
System.out.println(ref6.mdate);
System.out.println(ref6.edate);
System.out.println(ref6.quantity);

System.out.println(ref7.name);
System.out.println(ref7.colour);
System.out.println(ref7.price);
System.out.println(ref7.brandAmbassidor);
System.out.println(ref7.freshness);
System.out.println(ref7.mdate);
System.out.println(ref7.edate);
System.out.println(ref7.quantity);

System.out.println(ref8.name);
System.out.println(ref8.colour);
System.out.println(ref8.price);
System.out.println(ref8.brandAmbassidor);
System.out.println(ref8.freshness);
System.out.println(ref8.mdate);
System.out.println(ref8.edate);
System.out.println(ref8.quantity);
	}
}

