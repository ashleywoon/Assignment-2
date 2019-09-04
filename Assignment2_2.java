import java.util.Scanner;

public class Assignment2_2
{
	static public void main(String [] args)
	{
	Scanner input=new Scanner(System.in);
	String name1, name2, name3;
	double amount1, amount2, amount3;
	double price1, price2, price3;
	double total1, total2, total3;
	double subTotal, salesTax, endTotal;

	System.out.println("Input name of item 1:");
	name1 = input.nextLine();
	System.out.println("");
	System.out.println("Input quantity of item 1:");
	amount1 = input.nextDouble();
	System.out.println("");
	System.out.println("Input price of item 1: ");
	price1 = input.nextDouble();
	input.nextLine();
	total1 = amount1*price1;

	System.out.println("");
	System.out.println("Input name of item 2:");
	name2 = input.nextLine();
	System.out.println("");
	System.out.println("Input quantity of item 2:");
	amount2 = input.nextDouble();
	System.out.println("");
	System.out.println("Input price of item 2: ");
	price2 = input.nextDouble();
	input.nextLine();
	total2 = amount2*price2;

	System.out.println("");
	System.out.println("Input name of item 3:");
	name3 = input.nextLine();
	System.out.println("");
	System.out.println("Input quantity of item 3:");
	amount3 = input.nextDouble();
	System.out.println("");
	System.out.println("Input price of item 3: ");
	price3 = input.nextDouble();
	total3 = amount3*price3;
	subTotal=total1 + total2 + total3;
	salesTax=subTotal*.0625;
	endTotal=subTotal+salesTax;
	System.out.println("");

	System.out.println("Your bill:");
	System.out.println("");
	System.out.printf("%-30s%-10s%-10s%-10s", "Item",  "Quantity", "Price", "Total");
	System.out.println("");
	System.out.printf("%-30s%-10s%-10.4s%-10.4s", name1, amount1, price1, total1);
	System.out.println("");
	System.out.printf("%-30s%-10s%-10.4s%-10.4s", name2, amount2, price2, total2);
	System.out.println("");
	System.out.printf("%-30s%-10s%-10.4s%-10.4s", name3, amount3, price3, total3);
	System.out.println("");
	System.out.printf("%-50s%-20.2f", "Subtotal", subTotal);
	System.out.println("");
	System.out.printf("%-50s%-20.2f","6.25% sales tax", salesTax);
	System.out.println("");
	System.out.printf("%-50s%-20.2f", "Total", endTotal);
	}
}