package com.kodewala.pratice;

public class TestReport {
 public static void main(String[] args) {
	ReportExporter reportExporter1 = new PDFExporter();
	reportExporter1.exportReport();
	
	System.out.println("--------------------------------");
	ReportExporter  reportExporter2 = new ExcelExporter();
	reportExporter2.exportReport();
}
}
