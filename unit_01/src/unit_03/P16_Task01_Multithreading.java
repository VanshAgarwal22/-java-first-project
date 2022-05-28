package unit_03;

import java.util.Scanner;

//
//jab dependent hh tab result accha nhi  dega in case of seqential  case of area calculate // dependent k lia shi  rahega
	// 
//class c1
//{
//	public void show1() {
//	Scanner sc = new Scanner(System.in); 
// //normal class wait the input by the user and cannot reach or call the method show2 
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
//	System.out.println("hyy! shivali   "+i);
//	}
//	
//	}
//}


class T1 extends Thread
{
	public void run() {
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
	//System.out.println(s);
	System.out.println(Thread.currentThread().getName());
	sc.close();
	}
}

class T2 extends Thread
{
	public void run() 
	{
		
	for(int i=0;i<10;i++)
	{
	//System.out.println("hyy! dude");
		System.out.println(Thread.currentThread().getName());
	}
	
	}
}
class T3 extends Thread
{
	public void run() 
	{
		
	for(int i=0;i<7;i++)
	{
	//System.out.println("Hyy!");
	System.out.println(Thread.currentThread().getName());
	
	}
	
	}
}

public class P16_Task01_Multithreading {   
	

	public static void main(String[] args) {
		
//		c1 c = new c1();
//		c2 d = new c2();
//		c.show1();
//		d.show2();
		
		
//		
		//Thread v = new Thread(new T1( ),"t1");
		Thread s = new Thread (new T1());
		Thread s1 = new Thread (new T2());
		Thread v1= new Thread (new T3());
		s.start();
		s1.start();
		v1.start();
		
		
//user  k hand m kya h?? start   hh processor ko  chote m divide m  divide kro //task usthake thread m rak doo//
		// task in user hand 
		/*1.identify dependent and non dependent task in respective process
		2.insert selective task into threads
		3.start those threads*/
	}

}
