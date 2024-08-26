package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = fmt.parse(sc.nextLine());
		System.out.print("Contract value: ");
		double amount = sc.nextDouble();
		
		Contract contract = new Contract(number, date, amount);
		
		System.out.print("Enter the number of installments: ");
		int quota = sc.nextInt();
		
		
		
	}

}
