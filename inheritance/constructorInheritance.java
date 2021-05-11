// Constructor in java 

class Base1{
    Base1(){
        System.out.println("I am Base class constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class Derived1 extends Base1 {
	Derived1(){
		System.out.println("Derived Class Constructor");
	}
	Derived1(int x, int y){
		super(x);
		System.out.println("I am an overoaded constructor with value of y as: " + y);
	}
}

class ChildDerived extends Derived1{
	ChildDerived(){
		System.out.println("Child Derived Class Constructor");
	}
	
	ChildDerived(int x, int y, int z){
		   super(x, y);
        	   System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
	}
}

public class constructorInheritance {
	public static void main(String []args){
		
		Base1 b = new Base1();
		Derived1 d = new Derived1();
		ChildDerived cd =new ChildDerived();
		
		ChildDerived cd1 =new ChildDerived(1,2,3);
		
	}
}
