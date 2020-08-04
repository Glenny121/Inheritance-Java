package eat;
public class Product {
	String expirationDate, batchCode;

	public Product(String expirationDate, String batchCode) {
		this.expirationDate = expirationDate;
		this.batchCode = batchCode;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getBatchCode() {
		return batchCode;
	}
	public void setBatchCode(String batchCode) {
		this.batchCode = batchCode;
	}
	public void printData() {
		System.out.println("Expiration Date: " + getExpirationDate()+ "\nBatch Code: " + getBatchCode());
	}
}
