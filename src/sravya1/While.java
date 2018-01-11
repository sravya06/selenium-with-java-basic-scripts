package sravya1;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;// print 1 to 10
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		int j=10;// print 10 to 1
		while(j>=1)
		{
			System.out.println(j);
			j--;
		}
		int k=1;// print 1 to 10 except 4
		while(k<=12)
		{
			if(k!=7)
			{
			System.out.println(k);
			}
			k++;
		}
		}
	}
