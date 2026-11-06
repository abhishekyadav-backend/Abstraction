package com.kodewala.pratice;

public class TestDatabase {
   public static void main(String[] args) {
	
	   Database database1  = new MySQLDatabase();
	   
	   database1.connect();
	   database1.insert();
	   database1.disconnect();
	   
	   System.out.println("---------------------------------"); 
	   Database database2 = new PosterSQLDatabase();
	   database2.connect();
	   database2.insert();
	   database2.disconnect();
}
}
