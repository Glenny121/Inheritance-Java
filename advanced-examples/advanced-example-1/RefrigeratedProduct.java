package eat;
public class RefrigeratedProduct extends Product{
	private String foodControlCode;
	public RefrigeratedProduct(String expirationDate, String batchCode){
        super(expirationDate, batchCode);
        foodControlCode = "Desconocido";    }
	public String getFoodControlCode() {
		return foodControlCode;             }
	public void setFoodControlCode(String Code) {
		foodControlCode = Code;             }
	public void printInfo(){
        printData();
        System.out.println("food Control Code: " + getFoodControlCode() + "\n" );
    }
}
