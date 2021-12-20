package tr.com.avkaryazilim.factorymethod.exception;

public class LicenceTypeIsNotSupportedException extends RuntimeException {

	private static final long serialVersionUID = 1689632810570948485L;

	public LicenceTypeIsNotSupportedException() {
		super();
	}

	public LicenceTypeIsNotSupportedException(String message) {
		super(message);
	}

	public LicenceTypeIsNotSupportedException(String message, Throwable throwable) {
		super(message, throwable);
	}

	public LicenceTypeIsNotSupportedException(Throwable throwable) {
		super(throwable);
	}
}
