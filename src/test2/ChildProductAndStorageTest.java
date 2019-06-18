package test2;

public class ChildProductAndStorageTest {
	
	public static void main(String[] args) {
		ChildProduct<Tv, String, String > product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("QTV");
		product.setCompany("cha");
		
		Storage<Tv> storage = new StorageImple<>(100);
		storage.add(new Tv(), 0);
		Tv tv  = storage.get(0);
	}
	
}
