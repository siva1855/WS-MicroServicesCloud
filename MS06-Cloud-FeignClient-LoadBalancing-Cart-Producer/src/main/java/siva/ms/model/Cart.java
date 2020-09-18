package siva.ms.model;

public class Cart {

	private int cartId;
	private String ProductName;
	private String cartCode;
	private double productCost;

	public Cart() {
		super();
	}

	public Cart(int cartId, String productName, String cartCode, double productCost) {
		super();
		this.cartId = cartId;
		ProductName = productName;
		this.cartCode = cartCode;
		this.productCost = productCost;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getCartCode() {
		return cartCode;
	}

	public void setCartCode(String cartCode) {
		this.cartCode = cartCode;
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", ProductName=" + ProductName + ", cartCode=" + cartCode + ", productCost="
				+ productCost + "]";
	}

}
