
public class Machine {
	
	int x =10;
	Employe.name="chelo";
	
	static {
		System.out.println("In a static Bloc");
	}
	{
		System.out.println("In Annonymous Block");
	}
	
	public  Machine() {
		System.out.println("In a Constructor");
	}
	
	public static void main(String[] args) {
		
		Machine M1 = new Machine();
		
		Machine M2 = new Machine();
	}
	
	

}
