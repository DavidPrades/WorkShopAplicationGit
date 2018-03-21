import java.util.Date;

public class Invoice {
	private int codInvoice;
	private Date date;
	private double sum;
	private int discount;

	public Invoice() {
	}

	public int getCodInvoice() {
		return codInvoice;
	}

	public void setCodInvoice(int codInvoice) {
		this.codInvoice = codInvoice;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}
}