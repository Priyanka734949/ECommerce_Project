package com.product;
import com.user.User;


import com.user.ProductInfo;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class ProductCatalog {
	Scanner s = new Scanner(System.in);

    ProductInfo p1 = new ProductInfo(101, " Mobile Phone ", 40000.89f, 5, 4);
    ProductInfo p2 = new ProductInfo(102, " Laptop", 80000.89f, 4, 4);
    ProductInfo p3 = new ProductInfo(103, " Tablet ", 30000.89f, 3, 4);
    ProductInfo p4 = new ProductInfo(104, "Smartwatch", 20000.89f, 2, 4);
    ProductInfo p5 = new ProductInfo(105, "Headphones", 10000.89f, 1, 4);

    Comparator<ProductInfo> is = (o1, o2) -> {
        return Integer.compare(o1.getId(), o2.getId());
    };

    TreeSet<ProductInfo> productSet = new TreeSet<>(is);
    TreeSet<ProductInfo> cart = new TreeSet<>(is);
    float totalPrice = 0;
    
    public void userregister() {
        System.out.println("Enter name: ");
        String name = s.nextLine();
        System.out.println("Enter your mobile number:");
        long mobno = s.nextLong();
        s.nextLine();
        System.out.println("Enter Username: ");
        String username = s.nextLine();
        System.out.println("Enter Password:");
        String password = s.nextLine();
        System.out.println("Confirm your password:");
        String Cpassword = s.nextLine();
        if (password.equals(Cpassword)) {
            System.out.println("Registration successful...!!!");
    	    System.out.println("                                     ");

        } else {
            System.out.println("Passwords do not match");
        }
    }

    public void loginUser() {
        System.out.print("Enter username: ");
        String username = s.nextLine();
        System.out.print("Enter password: ");
        String password = s.nextLine();
        System.out.print("Confirm password: ");
        String Cpassword = s.nextLine();
        if (password.equals(Cpassword)) {
            System.out.println("Login successful...!!!");
    	    System.out.println("                                     ");

        } else {
            System.out.println("Passwords do not match");
        }
    }

     public ProductCatalog() {
    	 productSet.add(p1);
    	 productSet.add(p2);
    	 productSet.add(p3);
    	 productSet.add(p4);
    	 productSet.add(p5);
}

     public void start() {
    	    System.out.println(".........Welcome to Javacart.......");
    	    System.out.println("                                     ");

    	    System.out.println("Register yourself first:");
    	    System.out.println("                                     ");

    	    userregister();
    	    System.out.println("Enter your choice code from below:");
    	    System.out.println("1.Login");
    	    System.out.println("2.Exit");
    	    int choice = s.nextInt();
    	    s.nextLine();
    	    if (choice == 1) {
    	        loginUser();
    	        boolean running = true;
    	        while (running) {
    	            System.out.println("1. Shop");
    	            System.out.println("2. Exit");
    	            int option = s.nextInt();
    	            s.nextLine();
    	            switch (option) {
    	                case 1:
    	                    addProduct();
    	                    break;
    	                case 2:
    	                    running = false;
    	                    System.out.println("Exiting...");
    	                    System.out.println("Thank you for shopping...");
    	                    //break;
    	                    System.exit(0);
    	                default:
    	                    System.out.println("Invalid option");
    	            }
    	        }
    	    }
    	}
     


     public void addProduct() {
    	 boolean shopping=true;
    	 while (shopping) {
     	    System.out.println("-------------Available Products-------------");
    		for (ProductInfo pp : productSet) {
            System.out.println(pp);
        }
    		
    	System.out.println("                                     ");
        System.out.println("Choose product from above list by ID:");
        int id = s.nextInt();
        
        for (ProductInfo pp : productSet) {
            if (pp.getId() == id) {
                totalPrice += pp.getPrice();
                cart.add(pp);
        	    System.out.println("-----------------------------------------");
        	    System.out.println("You have chosen: Product ID :" + pp.getId() + pp.getProduct_name() + pp.getPrice());
                System.out.println("Total Price:" + totalPrice);
        	    System.out.println("-----------------------------------------");

                break;
            }
        }
	
        System.out.println("You want to:");
        System.out.println("1. Add more product");
        System.out.println("2. Remove product");
        System.out.println("3. Exit");
        int i = s.nextInt();
        s.nextLine();
     
        switch (i) {
            case 1:
                break;
            case 2:
                removeProduct();
                break;
            case 3:
                System.out.println("Exiting...");
                System.out.println("Thank you for shopping...");
                shopping = false;
               // break;
                System.exit(0);
                
            default:
                System.out.println("Invalid option");
        }
    }
}


public void removeProduct() {
	 if (cart.isEmpty()) {
	        System.out.println("Your cart is empty.");
	        return;
	    }
	 
    System.out.println("Your cart:");
    for (ProductInfo pp : cart) {
        System.out.println(pp);
    }
    
    
    System.out.println("Enter product ID to remove:");
    int id = s.nextInt();
    s.nextLine();
    ProductInfo productToRemove = null;
    for (ProductInfo pp : cart) {
        if (pp.getId() == id) {
            totalPrice -= pp.getPrice();
            productToRemove = pp;
            System.out.println("Product removed successfully.");
            break;
        }
    }
    if (productToRemove != null) {
        cart.remove(productToRemove);
    } else {
        System.out.println("Product not found in cart.");
    }
    System.out.println("Updated cart:");
    for (ProductInfo pp : cart) {
        System.out.println(pp);
    }
    System.out.println("Total Price:" + totalPrice);
    System.out.println("You want to:");
    System.out.println("1. Add more product");
    System.out.println("2. Remove product");
    System.out.println("3. Exit");
    int i = s.nextInt();
    s.nextLine(); 
    
    if (i == 1) {
        addProduct();
        return;
    } else if (i == 2) {
        removeProduct();
        return;
    } else if (i == 3) {
        System.out.println("Exiting...");
        System.out.println("Thank you for shopping...");
        //return;
        System.exit(0);
    }
}
}

