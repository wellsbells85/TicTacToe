package com.techelevator.vendingmachine.exception;

@SuppressWarnings("serial")
public class InsufficientFundsException extends RuntimeException {
	public InsufficientFundsException() {
		super();
	}

	public InsufficientFundsException(String message) {
		super(message);
	}

	public InsufficientFundsException(String message, Throwable cause) {
		super(message, cause);
	}

	public InsufficientFundsException(Throwable cause) {
		super(cause);
	}
}
