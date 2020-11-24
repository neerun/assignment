package day22;

public class ConstructorDemo {
	
	private String username;
	private String password;
	
	public ConstructorDemo(String u, String p) {
	username = u;
	password = p;
		
	}
	public void  displayinfo() {
		System.out.println("username is:"+ username);
		System.out.println("password is:"+ password);
	}
	public static void main(String[] args) {
		ConstructorDemo obj = new ConstructorDemo("kiran", "$$$");
		obj.displayinfo();
	}
	}
	


