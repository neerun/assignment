package day32;

public class Question40 {
	public static void main(String[] args) {
		//Write a program to reverse the string.
      String name = "Neeran";
      int leng = name.length();
       String rev = " ";

     for (int i =leng-1;i>=0;i--) {
     
     rev = rev+name.charAt(i);
     }
     System.out.println("Reverse of "+name+" is" + rev);
       }  
     }

