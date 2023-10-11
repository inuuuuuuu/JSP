package dao;
import java.util.ArrayList;
import dto.Product;

public class ProductRepository {
private ArrayList<Product> listOfProducts = new ArrayList<Product>(); // ArrayList를 Product로 캐스팅
private static ProductRepository instance = new ProductRepository();

	public ProductRepository() {
		Product phone = new Product("P1234", " 동아오츠카 T 나랑드사이다 제로 500ml 20개 x 2BOX 총 40개 리뷰 초특가 기간 한정", 8000);
		phone.setDescription("세일상품/무료배송");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("New");
        phone.setFilename("P1234.jpg");

        
        Product notebook = new Product("P1235", "[쎈딜][S-Point더블적립] 팔도 왕뚜껑 18개 / 도시락 24개 컵라면 5종 택1", 16920);
		notebook.setDescription("세일상품/무료배송");
		notebook.setCategory("Notebook");
		notebook.setManufacturer("LG");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("Refurbished");
        notebook.setFilename("P1235.jpg");


		Product tablet = new Product("P1236", "7장세트 특가 남자팬티 모달 메쉬드로즈 남자속옷", 9000);
		tablet.setDescription("세일상품/무료배송");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("Old");
		tablet.setFilename("P1236.jpg");

       
		// 위와 같이 상품 초기화 하고 아래에 상품을 추가

		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
    
		// listOfProducts.add(상품명);
	}
        public static ProductRepository getInstance(){
	                return instance;
   }

	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
    
    public Product getProductById(String productId) {
		Product productById = null;

		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
    
    public void addProduct(Product product) {
	listOfProducts.add(product);
   }


}