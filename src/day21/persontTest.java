package day21;

public class persontTest {
	
public static void main(String[] args) {
 person obj = new person();
 obj.setName ("neeran");
 obj.setNationality("Nepali");
 obj.setAddress("pokhara Nepal");
 obj.setAge(35);

 System.out.println(obj.getName());
 System.out.println(obj.getNationality());
 System.out.println(obj.getAddress());
 System.out.println(obj.getAge());
 
 System.out.println("===========");
}
}