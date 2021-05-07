package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concrete.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;


public class Main {

	public static void main(String[] args) {
		ProductService productservice=new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
		
		Product product=new Product(2,2 ,"Elma",12,50);
		productservice.add(product);
	}

}
