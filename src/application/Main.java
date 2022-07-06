package application;


import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.MethodsDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {

		
		MethodsDao<Seller> mSeller = DaoFactory.createSellerDao();
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
	}

}
