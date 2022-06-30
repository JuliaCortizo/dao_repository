package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		Department depart = new Department(1, "Books");
		Seller seller = new Seller(1, "João Marcelo", "joao@gmail.com", new Date(), 2.400, depart);
		System.out.println(depart);
		System.out.println(seller);

	}

}
