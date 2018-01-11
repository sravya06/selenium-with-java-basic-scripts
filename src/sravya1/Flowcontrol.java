package sravya1;

public class Flowcontrol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100000;
		if ((a>=1)&& (a<=100))
		{
			System.out.println("A is a small number");
			
		}
		else if ((a>=100)&&(a<=1000))
		{
			System.out.println("A is a medium number");
		}
		else if ((a>=1000)&&(a<=10000))
		{
			System.out.println("A is a Big number");
		}
		else if ((a>=10000)&&(a<=100000))
		{
			System.out.println("A is a long number");
		}
		

	}

}
