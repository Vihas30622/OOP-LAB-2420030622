package OOP_LAB_04;
import java.util.*;
class Student {
	 
	private int rollnumber;
	protected int grade;
	public String name;
	


public void SetDetails(int ROLL, int GRADE , String NAME) {
	
	rollnumber = ROLL;
	grade = GRADE;
	name = NAME;
}


public void showDetails(){
	
	System.out.println("Rollnumber is "+ rollnumber);
	System.out.println("Grade is "+ grade);
	System.out.println("Name is "+ name);
	
}
}
