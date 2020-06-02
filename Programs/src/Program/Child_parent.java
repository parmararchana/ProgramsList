package Program;


class parent
{
	public static void foo() {
		System.out.println("Foo in parent class");  
	}
	public void bar(){
		System.out.println("Parent bar");
	}
	private void hi()
	{
		
	}
	
}

public class Child_parent extends parent
{

	
	public static void foo(){
		System.out.println("Foo in Child class");
	}
	
	@Override
	public void bar(){
		System.out.println("Child bar");
	}
	
	public static void main(String[] args) {
		parent p=new Child_parent();
		Child_parent c=new Child_parent();
		
		p.foo();
		c.foo();
		
		p.bar();
		c.bar();

	}

}
