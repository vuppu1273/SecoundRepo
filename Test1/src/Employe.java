
public class Employe {
	
	
	private int id;
	
	public void getSalary(int id) {
		System.out.println("Salary is 20k");
	}
	
	public  static String name;
	
	public static void getGad(String name) {
		System.out.println("Sai");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Employe.getSalary(1);
		 * you cannot call non static methods or variables from the static Block
		 * 
		 * 
*/
		
		Employe.name="cher";
		Employe.getGad("churbe");
		
		// You can always call the static variables and methods from the static block 
		
		
		Employe E = new Employe();//You can access the non static vaiables and methods in the static block by creating object 
		E.getSalary(10);
		
		
		
		
		
	}
	public void getName() {
		getGad("chel");
		
		//You can access the static variables and methods from non static block
	}

}
