class Rectangle
{
	double length;
	double width;
	
	Rectangle (double length , double width)
	{
		this.length=length;
		this.width=width;
	}
	
	double area()
	{
		return length*width;
	}
	
	double perimeter()
	{
		return 2*(length+width);
	}
	
	void displayRectangle()
	{
		System.out.println("length - " + length + " width - " + width);
		System.out.println("area - " + area() + " perimeter - "+ perimeter());
	}
	
}

public class MainRectangle
{
	public static void main(String [] args)
	{
		Rectangle r=new Rectangle(5,2);
		r.displayRectangle();
		
	}
}