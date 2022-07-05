package application;


import model.dao.DaoFactory;
import model.dao.MethodsDao;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {

		
		MethodsDao<Seller> mSeller = DaoFactory.createSellerDao();
		System.out.println("===TESTE 1 - seller findById");
		Seller seller = mSeller.findById(3);
		System.out.println(seller);

	}

}
