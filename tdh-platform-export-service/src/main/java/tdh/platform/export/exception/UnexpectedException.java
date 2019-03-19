package tdh.platform.export.exception;


import tdh.platform.export.utils.ExportErrorCode;

public class UnexpectedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private int errorCode = ExportErrorCode.UNKNOWN;

	public UnexpectedException(int errorCode) {
		super();

		setErrorCode(errorCode);
	}

	public UnexpectedException(String message) {
		super(message);
	}

	public UnexpectedException(int errorCode, String message) {
		super(message);

		setErrorCode(errorCode);
	}

	public UnexpectedException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnexpectedException(int errorCode, String message, Throwable cause) {
		super(message, cause);

		setErrorCode(errorCode);
	}

	public UnexpectedException(Throwable cause) {
		super(cause);
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

}
