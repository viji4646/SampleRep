package accessmodifiers;

public class AccessModifiersEg1 {
	public void display()
	{
		System.out.println("This is my public method");
	}
    private void display1()
    {
    	System.out.println("This is my private method");
    }
    protected void display2()
    {
    	System.out.println("This is my protected method");
    }
    void display3()
    {
    	System.out.println("This is my default method");
    }
	public static void main(String[] args) {
		AccessModifiersEg1 a=new AccessModifiersEg1();
		a.display();
		a.display1();
		a.display2();
		a.display3();
		

	}

}
