class Sweet {

String sweetName;
double sweetPrice;
String sweetColour="red";
int manufacutureDate=2023;

Sweet()
{
System.out.println("Sweet running");
}
}


class SweetRun{
public static void main(String[] args){
System.out.println("main running");

Sweet sweet=new Sweet();

System.out.println("sweet name:"+sweet.sweetName);
System.out.println("sweet.sweetPrice:"+sweet.sweetPrice);
System.out.println("sweet.sweetColour:"+sweet.sweetColour);
System.out.println("sweet.manufacutureDate:"+sweet.manufacutureDate);
}
} 