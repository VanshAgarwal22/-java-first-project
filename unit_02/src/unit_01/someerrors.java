package unit_01;

public class someerrors {

	  static final int a  =10;
	  public static final float pi = 3.14f;
	
	public static void main(String[] args) {
		
		//Illegal modifier for parameter pi; only final is permitted

		//public static final float pi = 3.14f;
		
		
		//Cannot make a static reference to the non-static field
		
		
		System.out.println(a);
		
		System.out.println(pi);
		
		
		//The final field someerrors.a cannot be assigned
		
		//a  =11;
		
		//Syntax error on token "float", invalid VariableDeclaratorId
		//int float = 34;
		
		System.out.println(a);


	}

}
