class Circle
{
	double radius;
	
	Circle(double radius)
	{
		this.radius=radius;
	}
	
	double area()
	{
		return 3.14 * radius * radius;
	}
	
	void displayArea()
	{
		System.out.println("Area is : " + area());
	}
}

public class MainCircle
{
	public static void main(String [] args)
	{
		Circle c=new Circle(10);
		c.area();
		c.displayArea();
	}
}