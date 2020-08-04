public abstract class Polygon {
	protected int numSides;

	public Polygon(int numsides) {
		this.numSides = numsides;
	}
	public int getNumsides() {
		return numSides;
	}

	public void setNumsides(int numsides) {
		this.numSides = numsides;
	}

	public String toString() {
		return "Number Of sides: " + numSides ;
	}
	//declaramos el metodo area como abstracto
	public abstract double area();
}
