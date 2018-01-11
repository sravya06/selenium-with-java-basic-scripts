package sravya1;

public class variables {
	static int a=100;// a variable is a static variable
	public int salary()
	{
		int mysalary=10000+700+800;//mysalary is a local variable
		mysalary=mysalary+a;
		return mysalary;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=300;//b is a instance variable
		System.out.println(a);
		System.out.println(b);
		
		variables obj = new variables();
		System.out.println(obj.salary());
		int i;//i is a local variable
		for(i=1;i<=5;i++)
		{
			System.out.println(i);
			System.out.println(a);
			System.out.println(b);
			
		}
	}

}
