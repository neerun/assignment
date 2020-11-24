package day13;

public class MethodDemo1 {
	
	public void sayHello( ) {
     System.out.println("hello from kathmandu");
     
	}
   public void printInfo(String name, int age , String address) {
	   System.out.println("Name is :" + name);
	   System.out.println("Age is :"+ age);
	   System.out.println("Address is" + address);
	   
   }
    public static void main(String[] args) {
	MethodDemo1 ob = new MethodDemo1 ();
	ob.sayHello();
	
	
    String name = "neeran gurung";
     int age =65;
    String address = "pokhara";
     
	}
	}    

