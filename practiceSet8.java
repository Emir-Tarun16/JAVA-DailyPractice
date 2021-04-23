// Practice Set 8 in java ...

import java.lang.*;

class Employee {
	int salary;
	String name;
	
	public int getSalary(){
		return salary;	
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
}

class CellPhone{
	public void ringing(){
		System.out.println("Ringing..");
	}
	
	public void vibrating(){
		System.out.println("Vibrating...");
	}
}

class Square {

		int side;
	
	
	public void areaOfSquare(){
		
		int area = side * side;
		System.out.println("Area of Sqaure : "+area);
	}
	
	public void perimeterOfSquare(){
		int perimeter = 4*side;
		System.out.println("Perimeter is : "+perimeter);		
}
}

class TommyVecetti {
	public void hit(){
		System.out.println("hitting ...");
	}
	
	
	public void run(){
		System.out.println("running ...");
	}
	
	
	public void fire(){
		System.out.println("firing ...");
	}
}
 
public class practiceSet8 {
	
	public static void main(String []args){
		
		Employee em = new Employee();
		em.salary = 50000;
		em.setName("Emir tahrun");
		System.out.println(em.getName());
		System.out.println(em.getSalary());
		
		CellPhone cp = new CellPhone();
		cp.ringing();
		cp.vibrating();
		
		Square sq = new Square();
		sq.side = 8;
		sq.areaOfSquare();
		sq.perimeterOfSquare();
		
		TommyVecetti tom = new TommyVecetti();
		tom.hit();
		tom.run();
		tom.fire();
	}
}	
