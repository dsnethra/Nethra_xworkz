class Money {
String country;
String currency;
String type;
String denomication;

Money()
{
System.out.println("no argument running");
}

Money(String country,String currency){
System.out.println("string string argument running");
this.country=country;
this.currency=currency;
}

Money(String country,String currency,String type){
this(country,currency);
System.out.println("string string string argument running");
this.type=type;
}

Money(String country,String currency,String type,String denomication){
this(country,currency,type);
System.out.println("string string string string argument running");
this.denomication=denomication;
}
}

class MoneyRun{
public static void main (String[] args){
		System.out.println("running MopneyRun");
		
		Money ref1=new Money();
		
		Money ref2=new Money("Indian","Rupaye");
		System.out.println(ref2.country);
		System.out.println(ref2.currency);
		
		Money ref3=new Money("Indian","Rupaye","Higlyvaluable");
		System.out.println(ref3.country);
		System.out.println(ref3.currency);
		System.out.println(ref3.type);
		
		
		Money ref4=new Money("Indian","Rupaye","Higlyvaluable","coin");
		System.out.println(ref4.country);
		System.out.println(ref4.currency);
		System.out.println(ref4.type);
		System.out.println(ref4.denomication);
		
		}
		}
		
		
		
		


