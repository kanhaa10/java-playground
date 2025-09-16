class Car
{
	String model;
	int speed;
	
	Car(String model, int speed)
	{
		this.model=model;
		this.speed=speed;
	}
	
	void updateSpeed(int s)
	{
		speed=s;
	}
	
	void display() {
        System.out.println("Model: " + model + ", Speed: " + speed);
    }
}

public class MainCar {
    public static void main(String[] args) {
        Car c = new Car("BMW", 280);
        c.updateSpeed(350);
        c.display();
		
	}
}