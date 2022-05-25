package unit_03;

import java.util.Scanner;

//
//class c1
//{
//	public void show1() {
//	Scanner sc = new Scanner(System.in); 
// normal class wait the input by the user and cannot reach or call the method show2 
//	int s = sc.nextInt();
//	System.out.println(s);
//	}
//}
//
//class c2 
//{
//	public void show2() 
//	{
//		
//	for(int i=0;i<10;i++)
//	{
//	System.out.println("hyy! shivali");
//	}
//	
//	}
//}


class T1 extends Thread
{
	public void run() {
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
	System.out.println(s);
	}
}

class T2 extends Thread
{
	public void run() 
	{
		
	for(int i=0;i<10;i++)
	{
	System.out.println("hyy! shivali");
	}
	
	}
}
class T3 extends Thread
{
	public void run() 
	{
		
	for(int i=0;i<7;i++)
	{
	System.out.println("Hyy!");
	}
	
	}
}

public class P16_Task01_Multithreading {

	public static void main(String[] args) {
		
//		c1 c = new c1();
//		c2 d = new c2();
//		c.show1();
//		d.show2();
		
		
		
		Thread v = new Thread(new T1());
		Thread s = new Thread (new T2());
		Thread v1= new Thread (new T3());
		v.start();
		s.start();
		v1.start();
		
		

	}

}
