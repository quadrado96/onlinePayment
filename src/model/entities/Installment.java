package model.entities;

import java.time.LocalDate;
import java.util.Date;

public class Installment {
	
	private LocalDate dueDate;
	private Double amount;
	
	public Installment(LocalDate dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}
	
	public String toString() {
		return dueDate + " -  $" + String.format("%.2f", amount); 
	}

	
	
}
