package day13;
  public class MethodDemo2  {
	// < <access modifier > <return type > <method name> () {
  
	  public static int  findSum () {
	  int a = 5;
	  int b = 6;
	  int sum = a+b;
	  return sum;
	  }
	  public static void main(String[] args) {
		//MethodDemo2 obj = new MethodDemo2();
		  int s =  MethodDemo2.findSum();
		  System.out.println("Sum is : " + s);
	  }
  }
  