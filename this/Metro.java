class Metro {
String line;
int distance;
String start;
String destination;
int capacity;

Metro(){
System.out.println("running no argument");
}

Metro(String line,int distance){
System.out.println("running string int argument");
this.line=line;
this.distance=distance;
}

Metro(String line,int distance,String start){
this(line,distance);
System.out.println("running string int string argument");
this.start=start;
}

Metro(String line,int distance,String start,String destination){
this(line,distance,start);
System.out.println("running string int string argument");
this.destination=destination;
}

Metro(String line,int distance,String start,String destination,int capacity){
this(line,distance,start,destination);
System.out.println("running string int string int argument");
this.capacity=capacity;
}
}


class MetroRun {
	public static void main(String[] args){
		System.out.println("running main metrorun");
		
		Metro ref1=new Metro();
		
		Metro ref2=new Metro("blue",20);
		System.out.println(ref2.line);
		System.out.println(ref2.distance);
		
		Metro ref3=new Metro("blue",20,"rajajinagar");
		System.out.println(ref3.line);
		System.out.println(ref3.distance);
		System.out.println(ref3.start);
		
		Metro ref4=new Metro("blue",20,"rajajinagar","chickpete");
		System.out.println(ref4.line);
		System.out.println(ref4.distance);
		System.out.println(ref4.start);
		System.out.println(ref4.destination);

        Metro ref5=new Metro("blue",20,"rajajinagar","chickpete",1000);
		System.out.println(ref5.line);
		System.out.println(ref5.distance);
		System.out.println(ref5.start);
		System.out.println(ref5.destination);
        System.out.println(ref5.capacity);
		
	}
}



