package javalab;
import java.util.Scanner;
class MultiplicationTable{
	public synchronized void print(int num) {
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+ "x" +i+ "=" +num*i);
		}
	}
}
class Thread1 extends Thread{
	MultiplicationTable mult;
	int num1;
	public Thread1(MultiplicationTable mult,int num1) 
	 {
		this.mult=mult;
		this.num1=num1;
	}
	public void run() {
		mult.print(num1);
	}
}
class Thread2 extends Thread{
	MultiplicationTable mult;
	int num2;
	public Thread2(MultiplicationTable mult,int num2) 
	 {
		this.mult=mult;
		this.num2=num2;
	}
	public void run() {
		mult.print(num2);
	}
}
class Thread3 extends Thread{
	MultiplicationTable mult;
	int num3;
	public Thread3(MultiplicationTable mult,int num3) 
	 {
		this.mult=mult;
		this.num3=num3;
	}
	public void run() {
		mult.print(num3);
	}
}


public class MultiThreadDemo {
    public static void main(String[]args) {
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter the table you want to run by thread1");
    		int numb1=sc.nextInt();
    		System.out.println("Enter the table you want to run by thread2");
    		int numb2=sc.nextInt();
    		System.out.println("Enter the table you want to run by thread3");
    		int numb3=sc.nextInt();
    		MultiplicationTable m=new MultiplicationTable();
    		Thread1 t1=new Thread1(m, numb1);
    		Thread2 t2=new Thread2(m,numb2);
    		Thread3 t3=new Thread3(m,numb3);
    		t1.start();
    		t2.start();
    		t3.start();
    }
}
