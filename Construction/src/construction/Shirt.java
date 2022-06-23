package construction;

public class Shirt {
	
	public static String color;
	public  static char size;
	
	Shirt(){
		System.out.println("inside constructor");
	}
	
	public static void putOn() {
		System.out.println("Shirt is on!");
			
		}
		public void takeOff() {
			System.out.println("Shirt is off!");
		}
		
		public static void setColor(String newColor) {
			color = newColor;
		}
		
		public static void setSize(char c) {
			size =c;
		}
		
		
	}

	


