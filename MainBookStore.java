/*A Bookstore wants a program to manage Book Billing.
The system should:

Store book details (title, author, price, quantity).

Calculate total cost = price × quantity.

If total cost > ₹1000 → apply 10% discount, otherwise 5% discount.

Calculate final amount = total cost − discount.

Display all details with final bill.*/

import java.util.*;

class BookStore {
    private String title;
    private String author;
    private double price;
    private int quantity;
    private double totalCost;
    private double discount;
    private double finalAmount;

    
    void getBookDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        title = sc.nextLine();
        System.out.print("Enter author name: ");
        author = sc.nextLine();
        System.out.print("Enter price of book: ");
        price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();
    }

    
    void calculateBill() {
        totalCost = price * quantity;
        if (totalCost > 1000) {
            discount = 0.10 * totalCost;
        } else {
            discount = 0.05 * totalCost;
        }
        finalAmount = totalCost - discount;
    }

   
    void display() {
        System.out.println("\n---- Book Bill ----");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price per Book: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
    }
}

public class MainBookStore {
    public static void main(String[] args) {
        BookStore b1 = new BookStore();
        b1.getBookDetails();
        b1.calculateBill();
        b1.display();
    }
}
