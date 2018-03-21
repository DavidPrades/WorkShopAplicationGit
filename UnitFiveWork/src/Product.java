
public class Product {

	private int codProd;
	private String prodDescription;
	private double codPrice;
	private int prodStock;

	public Product() {
	}

	public int getCodProd() {
		return codProd;
	}

	public void setCodProd(int codProd) {
		this.codProd = codProd;
	}

	public String getProdDescription() {
		return prodDescription;
	}

	public void setProdDescription(String prodDescription) {
		this.prodDescription = prodDescription;
	}

	public double getCodPrice() {
		return codPrice;
	}

	public void setCodPrice(double codPrice) {
		this.codPrice = codPrice;
	}

	public int getProdStock() {
		return prodStock;
	}

	public void setProdStock(int prodStock) {
		this.prodStock = prodStock;
	}
}