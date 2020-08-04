package eat;
public class FreshProduct extends Product {
	private String packingDate, nativeCountry;
	public FreshProduct (String expirationDate, String batchCode){
        super(expirationDate, batchCode);
        packingDate = "Desconocido";
        nativeCountry = "Desconocido";
    }
	public String getPackingDate() {
		return packingDate;
	}
	public void setPackingDate(String Date) {
		packingDate = Date;
	}
	public String getNativeCountry() {
		return nativeCountry;
	}
	public void setNativeCountry(String Country) {
		nativeCountry = Country;
	}
	public void printInfo(){
        printData();
        System.out.println("packing Date: " + getPackingDate() + "\nNative Country" + getNativeCountry()+"\n");
    }
}
