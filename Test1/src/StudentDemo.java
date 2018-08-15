
public class StudentDemo {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		Student std = new Student();
		std.setId(1);
		std.setName("Sai");
		
		/*std.setSchool("Indo"); 
		 * 
		 * This is not a prefered way of setting
		the static variables because when create an object
		we cannot access the other values using current instance variable.
		Here in this context if we call the current instance variable in the 50 th line it 
		uses the the value which has set above to it.
		 Use always class name to set and get the values for static variables
		*/
		
		Student.setSchool("DPS");
		
		System.out.println(std.getId());
		System.out.println(std.getName());
		//System.out.println(std.getSchool());
		
		System.out.println(Student.getSchool());
		
		Student Std1 = new Student();
		Std1.setId(2);
		Std1.setName("Hello");
		std.setSchool("BPS");
		
		System.out.println(Std1.getId());
		System.out.println(Std1.getName());
		System.out.println(Std1.getSchool());
		
		Student Std2 = new Student();
		Std2.setId(2);
		Std2.setName("Chello");
		std.setSchool("DPS");
		
		System.out.println(Std2.getId());
		System.out.println(Std2.getName());
		System.out.println(Std2.getSchool());
		System.out.println(std.getSchool());
		
		

	}

}
