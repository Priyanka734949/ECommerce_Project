package com.user;

public class ProductInfo implements Comparable<ProductInfo>{

			int id;
			String product_name;
			float price;
			int quantity;
			float rating;
			
			@Override
			public String toString() {
				return "Product [id=" + id + ", product_name=" + product_name + ", price=" + price + ", quantity=" + quantity
						+ ", rating=" + rating + "]";
			}
			
			public ProductInfo(int id, String product_name, float price, int quantity, float rating) {
				super();
				this.id = id;
				this.product_name = product_name;
				this.price = price;
				this.quantity = quantity;
				this.rating = rating;
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getProduct_name() {
				return product_name;
			}
			public void setProduct_name(String product_name) {
				this.product_name = product_name;
			}
			public float getPrice() {
				return price;
			}
			public void setPrice(float price) {
				this.price = price;
			}
			public int getQuantity() {
				return quantity;
			}
			public void setQuantity(int quantity) {
				this.quantity = quantity;
			}
			public float getRating() {
				return rating;
			}
			public void setRating(float rating) {
				this.rating = rating;
			}

			@Override
			public int compareTo(ProductInfo o) {
				
		        return Integer.compare(this.id, o.id);

			}
			
			
		}



