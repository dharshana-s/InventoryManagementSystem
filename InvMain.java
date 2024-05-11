import java.io.*;
import java.util.*;

public class InvMain 
{
    public static void main(String[] args) 
    {
    	
    	int iProductId=0;
    	String sProductName ="";
    	int iPrice=0;
    	
    	Scanner getValue = new Scanner(System.in);
        InventoryManagementSystem ims = new InventoryManagementSystem();

        //adding products details
   	  	ims.addProduct(new Product(1, "Panneer", 85));
   	  	ims.addProduct(new Product(2, "Soya chunks",50));
   	  	ims.addProduct(new Product(3, "Bread", 25));
   	  	ims.addProduct(new Product(4, "Masala", 20));
   	  	ims.addProduct(new Product(5, "Pringles", 100));
   	  	ims.addProduct(new Product(6, "Lays", 30));
   	  	ims.addProduct(new Product(7, "Milk", 35));
   	  	ims.addProduct(new Product(8, "Wheat", 65));
   	  	ims.addProduct(new Product(9, "Maida", 110));
   	  	ims.addProduct(new Product(10, "Pappads", 30));
    	
   	  	System.out.println("Products List:");
   	  	ims.viewProducts();
   	  	System.out.println("");
   	  	System.out.println("Enter number of products the customer bought:");
   	  	int nProducts = getValue.nextInt();
   		int totalamount=0;
   	  	for(int i=0;i<nProducts;i++) 
   	  	{
   	  		System.out.println("Product ID:");
   	  		int getPID = getValue.nextInt();
   	  	Product objProduct = ims.searchProuctById(getPID);
   	  	
        if(objProduct != null)
        {
        	String spname=objProduct.getpName();
        	int iPrice1 = objProduct.getPrice();
        	System.out.println(spname+"  "+(iPrice1));
        	System.out.println("Quantity:");
       	  	int quantity = getValue.nextInt();
       	 int qprice = (iPrice1*quantity);
        	totalamount += qprice;
           }
   	  	}
   	  	System.out.println("");
   	  	System.out.println("The total amount of the products:"
   	  			+ totalamount);
        
    }
}