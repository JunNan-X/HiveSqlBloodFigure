package com.diven.common.hive.blood.exception;
/**
 * @author divenwu
 */
public class SQLExtractException extends RuntimeException {

	private static final long serialVersionUID = -5588025121452725145L;

	public SQLExtractException(String message, Throwable cause) {
		super(message, cause);
	}

	public SQLExtractException(String message) {
		super(message);
	}

	public SQLExtractException(Throwable cause) {
		super(cause);
	}
}
