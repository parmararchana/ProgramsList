package Program;

public class Constructordemo {
	
	
	Constructordemo()
	{
		this(0);
		System.out.println("Print in constructor with NO arguments");
	}
	Constructordemo(int x)
	{
		this(0,0);
		System.out.println("Print in constructor with ONE arguments");
	}
	Constructordemo(int x, int y)
	{
		
		System.out.println("Print in constructor with TWO arguments");
	}

	public static void main(String[] args) {
		
		Constructordemo obj=new Constructordemo();
	}

}

