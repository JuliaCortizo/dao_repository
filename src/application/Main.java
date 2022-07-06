package application;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.MethodsDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {

		//Seller teste
		Scanner sc = new Scanner(System.in);
		/*MethodsDao<Seller> mSeller = DaoFactory.createSellerDao();
		System.out.println("===TESTE 1 - seller findById ===");
		Seller seller = mSeller.findById(3);
		System.out.println(seller);
		
		System.out.println("\n===TESTE 2 - seller findByDepartment ===");
		SellerDaoJDBC sellerBase = DaoFactory.createSeller();
		Department depart = new Department(2, null);
		List<Seller> list = sellerBase.findByDepartment(depart);
		for (Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n===TESTE 3 - seller findAll ===");
		list = mSeller.findAll();
		for (Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n===TESTE 4 - seller insert ===");
		Seller newSeller = new Seller(null, "Greg", "teste", new Date(), 345.9, depart);
		mSeller.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n===TESTE 5 - seller update ===");
		seller = mSeller.findById(1);
		seller.setName("Ju");
		mSeller.update(seller);
		System.out.println("Updated!");
		
		System.out.println("\n===TESTE 6 - seller delete ===");
		System.out.println("Insira o id que deseja excluir: ");
		int id = sc.nextInt();
		mSeller.deleteById(id);
		*/
		
		//Department teste

		MethodsDao<Department> mDepart = DaoFactory.createDepartmentDao();
		
		/*System.out.println("\n===TESTE 1 - seller delete ===");
		System.out.println("Insira o id que deseja excluir: ");
		int id = sc.nextInt();
		mDepart.deleteById(id);*/
		
		System.out.println("\n===TESTE 2 - department insert ===");
		Department dep = new Department(null, "Notebooks");
		mDepart.insert(dep);
		System.out.println("Inserted! New id = " + dep.getId());
		sc.close();
		
		System.out.println("===TESTE 3 - department findById ===");
		Department depart = mDepart.findById(1);
		System.out.println(depart);
		
		System.out.println("\n===TESTE 4 - department findAll ===");
		List<Department> list = mDepart.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		
	}

}
