package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {
		
		List<Dados> list = new ArrayList();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many employess will be registered?");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Employe #" + i + ":");
			System.out.println("ID: ");
			Integer id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Integer salary = sc.nextInt();
			Dados dados = new Dados(id, name, salary);
			
			list.add(dados);

		}
		
		System.out.println("Enter the employee id that will have salary increase : ");
		int idsalary = sc.nextInt();
		Integer pos = position(list, idsalary);
		if (pos == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.println("enter the percentage: ");
			double percent = sc.nextDouble();
			list.get(pos).increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Dados dados : list) {
			System.out.println(dados);
		}
		
		sc.close();
		
	}
	
	public static Integer position(List<Dados> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getID() == id) {
				return i;
			} 
		}
		return null;
	}

}
