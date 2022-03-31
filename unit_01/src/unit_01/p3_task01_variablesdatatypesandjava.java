package unit_01;
/*. local variables : declared inside the body of the method
 * 
 *. instance variables : instance variables are defined without static keyboard
 * ->they are defined outside the method declaration
 * 
 * . static variables : it is defined with the static keyword
 * ->static variables are initilized only once,at the start
 * 
 * */
 
public class p3_task01_variablesdatatypesandjava {
int a = 14;//instance
static int  b = 12; //static variables

	public static void main(String[] args) {
		
		int c = 22;// local variables
		p3_task01_variablesdatatypesandjava s = new p3_task01_variablesdatatypesandjava();    // creating object//
		System.out.println(s.a);
	
		System.out.println(b);
		System.out.println(c);

	}

}
