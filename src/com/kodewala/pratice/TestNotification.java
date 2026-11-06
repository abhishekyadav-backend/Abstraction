package com.kodewala.pratice;

public class TestNotification {
	public static void main(String[] args) {

		Notification[] notifications = { new EmailNotification(), new SMSNotification() };

		for (Notification notification : notifications) {
			notification.send();
		}
	}
}
