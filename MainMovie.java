class Movie
{
	String name;
	double rating;
	
	Movie(String name, double rating)
	{
		this.name=name;
		this.rating=rating;
	}
	
	void display() {
        System.out.println("Movie:- " + name + ", Rating:- " + rating);
    }
}

public class MainMovie
{
	public static void main(String [] args)
	{
		Movie m=new Movie("Demon Slayer: Kimetsu no Yaiba", 9.3);
		m.display();
	}
}
