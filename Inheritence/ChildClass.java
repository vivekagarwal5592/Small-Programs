package Inheritence;

public class ChildClass extends ParentClass {

	public void childmethod(){
		
		System.out.println("This is the child class");
	}
	
	public void ParentMethod(){
		
		System.out.println("This is over ridden method");
	}
	
	
	public static void main(String[] args){
		
		ParentClass pc = new ChildClass();
		//ChildClass cc1 = new ParentClass();
	//	ChildClass cs = new ChildClass();
		
		
		
		pc.ParentMethod();
//		cs.childmethod();
//		cs.ParentMethod();
		
	}
	
	
}
