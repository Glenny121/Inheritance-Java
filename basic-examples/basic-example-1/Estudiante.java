public class Estudiante extends Persona{
	private int studentCode;
	private double finalNote;
	public Estudiante (String name, String lastName, int age, int studentCode, double finalNote) {
		super(name,lastName,age);
		this.studentCode=studentCode;
		this.finalNote=finalNote;
	}
	public void showData() {
		System.out.println("Name: " + getName() + "\nLastname: " + getLastName() + 
		"\nAge: " + getAge() + "\nStudent Code: " + studentCode + "\nFinal Note: " + finalNote);
	}
}
