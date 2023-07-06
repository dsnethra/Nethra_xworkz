class Stove {
String name;
String flame;
int price;
String capacity;
int weight;
int width;
int height;
String type;

Stove(String name,String flame,int price,String capacity,int weight,int width,int height,String type)
{
this.name=name;
this.flame=flame;
this.price=price;
this.capacity=capacity;
this.weight=weight;
this.width=width;
this.height=height;
this.type=type;

}
}

class StoveRun {
public static void main(String[] args){
System.out.println("running main ");

Stove ref1=new Stove("name1","flame1",1000,"capacity1",2,1,1,"type1");
Stove ref2=new Stove("name2","flame2",2000,"capacity2",2,1,1,"type2");
Stove ref3=new Stove("name3","flame3",4000,"capacity3",2,1,1,"type3");
Stove ref4=new Stove("name4","flame4",5000,"capacity4",2,1,1,"type4");
Stove ref5=new Stove("name5","flame5",6000,"capacity5",2,1,1,"type5");
Stove ref6=new Stove("name6","flame6",7000,"capacity6",2,1,1,"type6");
Stove ref7=new Stove("name7","flame7",8000,"capacity7",2,1,1,"type7");
Stove ref8=new Stove("name8","flame8",9000,"capacity8",2,1,1,"type8");


System.out.println(ref1.name);
System.out.println(ref1.flame);
System.out.println(ref1.price);
System.out.println(ref1.capacity);
System.out.println(ref1.weight);
System.out.println(ref1.width);
System.out.println(ref1.height);
System.out.println(ref1.type);

System.out.println(ref2.name);
System.out.println(ref2.flame);
System.out.println(ref2.price);
System.out.println(ref2.capacity);
System.out.println(ref2.weight);
System.out.println(ref2.width);
System.out.println(ref2.height);
System.out.println(ref2.type);

System.out.println(ref3.name);
System.out.println(ref3.flame);
System.out.println(ref3.price);
System.out.println(ref3.capacity);
System.out.println(ref3.weight);
System.out.println(ref3.width);
System.out.println(ref3.height);
System.out.println(ref3.type);

System.out.println(ref4.name);
System.out.println(ref4.flame);
System.out.println(ref4.price);
System.out.println(ref4.capacity);
System.out.println(ref4.weight);
System.out.println(ref4.width);
System.out.println(ref4.height);
System.out.println(ref4.type);

System.out.println(ref5.name);
System.out.println(ref5.flame);
System.out.println(ref5.price);
System.out.println(ref5.capacity);
System.out.println(ref5.weight);
System.out.println(ref5.width);
System.out.println(ref5.height);
System.out.println(ref5.type);

System.out.println(ref6.name);
System.out.println(ref6.flame);
System.out.println(ref6.price);
System.out.println(ref6.capacity);
System.out.println(ref6.weight);
System.out.println(ref6.width);
System.out.println(ref6.height);
System.out.println(ref6.type);

System.out.println(ref7.name);
System.out.println(ref7.flame);
System.out.println(ref7.price);
System.out.println(ref7.capacity);
System.out.println(ref7.weight);
System.out.println(ref7.width);
System.out.println(ref7.height);
System.out.println(ref7.type);

System.out.println(ref8.name);
System.out.println(ref8.flame);
System.out.println(ref8.price);
System.out.println(ref8.capacity);
System.out.println(ref8.weight);
System.out.println(ref8.width);
System.out.println(ref8.height);
System.out.println(ref8.type);

}
}