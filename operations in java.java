// https://www.w3schools.com/java/tryjava.asp?filename=demo_interface_multi
class arith
{
	int x,y;
	void getdata(int a, int b)
	{
		x=a;
		y=b;
	}
	void calc()
	{
		System.out.println("Arithmetic Operation");
		System.out.println("a+b ="+(x+y));
		System.out.println("a-b ="+(x-y));
		System.out.println("a*b ="+(x*y));
		System.out.println("a/b ="+(x/y));
		System.out.println("a%b ="+(x%y));
	}
}
class rel
{
		int x,y;
		void getdata(int a, int b)
		{
			x=a;
			y=b;
		}
		void calc()
		{
			System.out.println("Relational Operation");
			System.out.println("a>b ="+(x>y));
			System.out.println("a<b ="+(x<y));
			System.out.println("a>=b ="+(x>=y));
			System.out.println("a<=b ="+(x<=y));
			System.out.println("a==b ="+(x==y));
			System.out.println("a!=b ="+(x!=y));
		}
}
class log
	{
		boolean x,y;
		void getdata(boolean a, boolean b)
		{	
			x=a;
			y=b;
		}
		void calc()
		{
			System.out.println("Logical Operation");
			System.out.println("a&&b ="+(x&&y));
			System.out.println("a||b ="+(x||y));
			System.out.println("!(a&&b) ="+!(x&&y));
		}
	}
class oper
	{
		public static void main(String args[])
		{
			arith ar=new arith();
			ar.getdata(10,5);
			ar.calc();
			rel r=new rel();
			r.getdata(10,15);
			r.calc();
			log l=new log();
			l.getdata(true,true);
			l.calc();
		}
	}