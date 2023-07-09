class Worker {
 
 String name;
 int age;
 int height;
 String company;
 
 Worker(String name1,int age1,int height1,String company1)
 {
	 name=name1;
	 age=age1;
	 height=height1;
	 company=company1;
	 
 }
 
 void work()
 {
	 System.out.println(name);
	 System.out.println(age);
	 System.out.println(height);
	 System.out.println(company);
	 
 }
}
 class WorkerRun
 {
	 public static void main(String[] args){
	 Worker ref=new Worker("deepa",22,6,"google");
	 ref.work();
	 
	 ref.name="nethra";
	 ref.age=22;
	 ref.height=5;
	 ref.company="twitter";
	 ref.work();
	 
 }
 }
	 
	 