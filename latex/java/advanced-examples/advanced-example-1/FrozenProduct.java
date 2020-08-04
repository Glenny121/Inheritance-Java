package eat;
public class FrozenProduct extends Product{
	private double freezingTemp;
	public FrozenProduct(String expirationDate, String batchCode){
        super(expirationDate, batchCode);
        freezingTemp = 0;              }
	public double getFreezingTemp() {
		return freezingTemp;           }
	public void setFreezingTemp(double Temp) {
		freezingTemp = Temp;           }
	public void printInfo(){
        printData();
        System.out.println("Freezing temperature: " + getFreezingTemp() + "\n");
    }
}
