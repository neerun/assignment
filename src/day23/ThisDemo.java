package day23;

public class ThisDemo {
	// instance variable 
	String playername;
	int playerJersey;
	
	public ThisDemo(String playername, int playerjersey) {// local variable
		this.playername = playername;
		this.playerJersey = playerjersey;
		
}
  public void displayinfo() {
	  System.out.println("playername is;" + playername);
	  System.out.println("playerjersey is:" + playerJersey);
  }
  public static void main(String[] args) {
	ThisDemo obj = new ThisDemo("ronaldo", 7);
	obj.displayinfo();
  }
  }
