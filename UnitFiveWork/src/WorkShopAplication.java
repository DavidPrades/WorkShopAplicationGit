import java.util.Date;

public class WorkShopAplication {

	// Product information

	private Product product1 = new Product();
	

	// Client information

	private int codCli;
	private String cliDni;
	private String cliName;
	private String cliFirstName;

	// Invoice Information
	private int codInvoice;
	private Date date;
	private double sum;
	private int discount;

	// invoice line information
	private int numInvoiceLine;
	private int numArticles;
	private int codArt;
	private int quantity;

}
