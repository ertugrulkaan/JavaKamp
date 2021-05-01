package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setName("Lenovo V15");
		product.setDetail("asdasd");
		product.setDiscount(10);
		product.setUnitPrice(1000);
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo V16");
		product2.setDetail("asdasd");
		product2.setDiscount(10);
		product2.setUnitPrice(2000);
		Product product3 = new Product();
		product3.setId(3);
		product3.setName("Lenovo V17");
		product3.setDetail("asdasd");
		product3.setDiscount(10);
		product3.setUnitPrice(3000);

		Product product5 = new Product(4, "LEnovo V18", 4000, "asdasdas",10);
		Product[] products = { product, product2, product3, product5 };
		for (Product product4 : products) {
			System.out.println("-----------------");
			System.out.println("id: " + product4.getId());
			System.out.println("name: " + product4.getName());
			System.out.println("unitPrice: " + product4.getUnitPrice());
			System.out.println("detail: " + product4.getUnitPriceAfterDiscount());
		}
		Category cat1 = new Category();
		cat1.setId(1);
		cat1.setName("PC");

		ProductMAnager productMAnager = new ProductMAnager();
		productMAnager.addToCart(product5);

	}

}
