package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer number;
	private Date date;
	private Double totalValue;

	List<Installment> installments = new ArrayList<>();

	public Contract(int contractNumber, Date date, double totalValue) {
		this.number = contractNumber;
		this.date = date;
		this.totalValue = totalValue;
	}

	public int getContractNumber() {
		return number;
	}

	public void setContractNumber(int contractNumber) {
		this.number = contractNumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

}
