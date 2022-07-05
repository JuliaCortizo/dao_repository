package application;


import model.dao.DaoFactory;
import model.dao.MethodsDao;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {

		
		MethodsDao<Seller> mSeller = DaoFactory.createSellerDao();
		
		Seller seller = mSeller.findById(3);
		System.out.println(seller);

	}

}
