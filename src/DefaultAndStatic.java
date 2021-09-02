interface Nothing
{
	default void say()
	{
		System.out.println("This is say");
	}
	static void speak()
	{
		System.out.println("This is speak");
	}
	void display();
}
class DefaultMethod implements Nothing{
	public void display()
	{
		System.out.println("This is display");
	}
}
public class DefaultAndStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethod dm=new DefaultMethod();
		dm.display();
		dm.say();
		Nothing.speak();

	}

}
