package Exceptions;

public class BrowserNotRecognized extends Exception {
	public BrowserNotRecognized() {
		super();
	}
	
	public BrowserNotRecognized(String info) {
		super(info);
	}
}
