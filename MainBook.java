class Book
{
	String title;
	String author;
	double price;
	
	Book(String title, String author, double price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	void applyDiscount(double discount)
	{
		price = price - (discount * price / 100);
	}
	
	void displayDetails()
	{
		System.out.format("Discounted price is : " + price);
	}
}


public class MainBook 
{
	public static void main(String [] args)
	{
		Book b=new Book("JAVA","harsh",500); 
		b.applyDiscount(20);
		b.displayDetails();
	}
}