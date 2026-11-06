package com.kodewala.pratice;

public class MySQLDatabase extends Database {
 void connect() {
	 System.out.println("Connect to MySQL Database");
 } 
 @Override 
 void insert() {
	 System.out.println("Data insert into MySQL");
 } 
 void disconnect() {
	 System.out.println("MySQL Database disconected");
 }
}
