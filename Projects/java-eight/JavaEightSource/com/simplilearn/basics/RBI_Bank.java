package com.simplilearn.basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface Bank {

	int checkBalance(User user);
	int withDraw();
	void deposit(int amount);

}

class HDFC implements Bank {

	static Map<String, String> userMap = new HashMap<>();
	List<Integer> accounts = Arrays.asList(123, 124, 125, 136);

	static {
		userMap.put("john", "john@190");
		userMap.put("adam", "adam@124");
		userMap.put("ricky", "ricky@125");
	}

	public int checkBalance(User user) {
		if (userMap.containsKey(user.username)) {
			String password = userMap.get(user.username);
			if (password.equals(user.password) && accounts.contains(user.accountNo)) {
				return user.balance;
			}
			return -1;
		} else {
			System.out.println("Invalid Account Number");
			return -1;
		}
	}

	public int withDraw() {
		return 0;
	}

	public void deposit(int amount) {
	}

}

class ICICI implements Bank {

	List<Integer> accounts = Arrays.asList(123, 124, 125, 136);
	int balance = 0;
	User user;

	public int checkBalance(User user) {
		if (accounts.contains(user.accountNo)) {
			return balance;
		} else {
			System.out.println("Invalid Account Number");
			return -1;
		}
	}

	public int withDraw() {
		return 0;
	}

	public void deposit(int amount) {
		// TODO Auto-generated method stub

	}
}

class User {
	int accountNo;
	String username;
	String password;
	int balance;
}
