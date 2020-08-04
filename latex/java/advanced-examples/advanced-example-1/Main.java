package eat;
public class Main {
public static void main (String[]args) {
	FrozenProduct nuggets = new FrozenProduct ("18-12-2020", "L10004");
	FreshProduct lettuce = new FreshProduct ("14-10-2020", "L10005");
	RefrigeratedProduct juice = new RefrigeratedProduct ("20-12-2020", "L10006");
	nuggets.setFreezingTemp(-18);
	lettuce.setPackingDate("15-08-2020");
	lettuce.setNativeCountry("Peru");
	juice.setFoodControlCode("B#2040");
	System.out.println("Frozen Product: ");
	nuggets.printInfo();
	System.out.println("Fresh Product: ");
	lettuce.printInfo();
	System.out.println("Refrigerated Product: ");
	juice.printInfo();
}
}

