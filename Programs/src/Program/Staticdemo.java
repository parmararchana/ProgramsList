package Program;

class Abc {

	static int i = 100;
	static {
		i = i-- - --i;
		System.out.println("First " + i);

	}

	{
		i = i++ + ++i;
		System.out.println("Second " + i);

	}

}

class B extends Abc {

	static {
		i = --i - i--;
		System.out.println("Third " + i);

	}

	{
		i = ++i + i++;
		System.out.println("Fourth " + i);

	}

}

public class Staticdemo {

	public static void main(String[] args) {

		B b = new B();
		System.out.println(b.i);

	}

}
