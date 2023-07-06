class Plate {
String name;
String colour;
int price;
int width;
String type;
int capacity;
int thickness;
String shape;


Plate(String name,String colour,int price,int width,String type,int capacity,int thickness,String shape)
{
System.out.println("running plate");
this.name=name;
this.colour=colour;
this.price=price;
this.width=width;
this.type=type;
this.capacity=capacity;
this.thickness=thickness;
this.shape=shape;

}
}

class PlateRun {
public static void main(String[] args)
{
Plate ref1= new Plate("name1","colour1",10,5,"plastic",20,2,"shape1");
Plate ref2= new Plate("name2","colour2",10,15,"plastic",40,2,"shape2");
Plate ref3= new Plate("name3","colour3",20,25,"plastic",60,2,"shape3");
Plate ref4= new Plate("name4","colour4",30,35,"plastic",80,1,"shape4");
Plate ref5= new Plate("name5","colour5",40,45,"plastic",110,2,"shape5");
Plate ref6= new Plate("name6","colour6",50,55,"plastic",120,1,"shape6");
Plate ref7= new Plate("name7","colour7",60,65,"plastic",220,3,"shape7");
Plate ref8= new Plate("name8","colour8",70,75,"plastic",420,4,"shape8");

System.out.println(ref1.name);
System.out.println(ref1.colour);
System.out.println(ref1.price);
System.out.println(ref1.width);
System.out.println(ref1.type);
System.out.println(ref1.capacity);
System.out.println(ref1.thickness);
System.out.println(ref1.shape);

System.out.println(ref2.name);
System.out.println(ref2.colour);
System.out.println(ref2.price);
System.out.println(ref2.width);
System.out.println(ref2.type);
System.out.println(ref2.capacity);
System.out.println(ref2.thickness);
System.out.println(ref2.shape);

System.out.println(ref3.name);
System.out.println(ref3.colour);
System.out.println(ref3.price);
System.out.println(ref3.width);
System.out.println(ref3.type);
System.out.println(ref3.capacity);
System.out.println(ref3.thickness);
System.out.println(ref3.shape);

System.out.println(ref4.name);
System.out.println(ref4.colour);
System.out.println(ref4.price);
System.out.println(ref4.width);
System.out.println(ref4.type);
System.out.println(ref4.capacity);
System.out.println(ref4.thickness);
System.out.println(ref4.shape);

System.out.println(ref5.name);
System.out.println(ref5.colour);
System.out.println(ref5.price);
System.out.println(ref5.width);
System.out.println(ref5.type);
System.out.println(ref5.capacity);
System.out.println(ref5.thickness);
System.out.println(ref5.shape);

System.out.println(ref6.name);
System.out.println(ref6.colour);
System.out.println(ref6.price);
System.out.println(ref6.width);
System.out.println(ref6.type);
System.out.println(ref6.capacity);
System.out.println(ref6.thickness);
System.out.println(ref6.shape);

System.out.println(ref7.name);
System.out.println(ref7.colour);
System.out.println(ref7.price);
System.out.println(ref7.width);
System.out.println(ref7.type);
System.out.println(ref7.capacity);
System.out.println(ref7.thickness);
System.out.println(ref7.shape);

System.out.println(ref8.name);
System.out.println(ref8.colour);
System.out.println(ref8.price);
System.out.println(ref8.width);
System.out.println(ref8.type);
System.out.println(ref8.capacity);
System.out.println(ref8.thickness);
System.out.println(ref8.shape);

}
}