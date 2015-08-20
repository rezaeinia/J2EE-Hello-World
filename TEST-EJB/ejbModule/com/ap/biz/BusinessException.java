package com.ap.biz;

import java.io.PrintWriter;
import java.io.StringWriter;

public class BusinessException extends Exception {
	public enum Reason {
		ProductAccessDenied, SubmitIdNotExist, AlreadyProcessedSubmitID, InvalidParameters
				, AuthenticationFailed,IpAccessDenied ,ClientTimeOut , Unknown;

//		private int errorCode;

//		private Reason(in) {
//			this.errorCode = errorCode;
//		}
//
//		public int getErrorCode() {
//			return errorCode;
//		}

	}

	Reason reason;

	public BusinessException(Exception e) {
		super(e);
	}

	public BusinessException(Reason error) {
		this.reason = error;
	}

	public BusinessException(Reason error, Exception e) {
		super(e);
		this.reason = error;
	}

	@Override
	public String getMessage() {
		switch (this.reason) {
		case ProductAccessDenied:
			return "you have no access to this product";
		case SubmitIdNotExist:
			return "submitId does not  exist!!!";
		case AlreadyProcessedSubmitID:
			return "Request with given submitId was already processed";
		case InvalidParameters:
			return "Invalid Parameters please verify your parameters and try again";
		case AuthenticationFailed:
			return "Authentication Failed please verify user name, password ";
		case IpAccessDenied : 
			return "you have no access to this services with this ip address";
		case ClientTimeOut:
			return "client timeout exception";
		default: {
			printStackTrace();
			StringWriter errors = new StringWriter();
			printStackTrace(new PrintWriter(errors));
			return errors.toString();
		}

		}

	}
}
