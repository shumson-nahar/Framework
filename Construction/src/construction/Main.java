package construction;

public class Main {
	public static void main(String[] args) {
		
	Shirt s = new Shirt();
	s.setColor("White");
	s.setSize('M');
	s.putOn();
	
	System.out.println(s.color);
	System.out.println(s.size);
}
}