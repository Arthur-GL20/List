package entities;

public class Dados {
	private Integer ID;
	private String name;
	private double salary;

	public Dados(int ID,String name, int salary) {
		this.ID = ID;
		this.name = name;
		this.salary =  salary;
		
	}
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void increaseSalary(double percentage) {
		this.salary = salary * (1 + percentage/100);
	}
	
	public String toString() {
		return ID + ", " + name + ", " + String.format("%.2f", salary);
	}

}
