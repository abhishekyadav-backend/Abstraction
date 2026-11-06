package com.kodewala.pratice;

public class PosterSQLDatabase extends Database {

	@Override
	void connect() {
		System.out.println("Connected to postgreSQL Database");
	} 
	@Override
	void insert() {
		System.out.println("Data inserted into postgerSQl");
	} 
	@Override 
	void disconnect() {
		System.out.println("PosterSQL Database disconnected");
	}
}
