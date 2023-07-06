class Infosys {

String founderName;
String founderWifeName;
int founded;
int totalEmployes;

Infosys()
{
System.out.println("running no argument");
}

Infosys(String founderName,String founderWifeName){
	System.out.println("running string string argument");
	
this.founderName= founderName;
this. founderWifeName= founderWifeName;
}

Infosys(String founderName,String founderWifeName,int founded){
	this(founderName,founderWifeName);
	System.out.println("running string string int argument");
	this.founded=founded;
}

Infosys(String founderName,String founderWifeName,int founded,int totalEmployes){
	this(founderName,founderWifeName,founded);
	System.out.println("running string string int int argument");
	this.totalEmployes=totalEmployes;
}
}

class InfosysRun {
	public static void main (String[] args){
		System.out.println("running infosysRun");
		
		Infosys ref1=new Infosys();
		
		Infosys ref2=new Infosys("Narayana_murthy","Sudha_murthy");
		System.out.println(ref2.founderName);
		System.out.println(ref2.founderWifeName);

        Infosys ref3=new Infosys("Narayana_murthy","Sudha_murthy",1990);
		System.out.println(ref3.founderName);
		System.out.println(ref3.founderWifeName);
		System.out.println(ref3.founded);
		
		Infosys ref4=new Infosys("Narayana_murthy","Sudha_murthy",1990,20000);
		System.out.println(ref4.founderName);
		System.out.println(ref4.founderWifeName);
		System.out.println(ref4.founded);
		System.out.println(ref4.totalEmployes);
	}
}
	



