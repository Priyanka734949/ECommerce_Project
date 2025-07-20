package com.user;

public class User {
	
		String username;
		String password;
		String name;
		long mobno;
		
		public User(String username, String password,String name,long mobno) {
			super();
			this.username = username;
			this.password = password;
			this.name=name;
			
			this.mobno=mobno;
			
			
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public long getMobno() {
			return mobno;
		}

		public void setMobno(long mobno) {
			this.mobno = mobno;
		}

		
	}


