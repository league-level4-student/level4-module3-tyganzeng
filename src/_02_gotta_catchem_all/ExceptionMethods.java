package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	public double divide(double x, double y) throws IllegalArgumentException {
		if(y == 0.0) {
			throw new IllegalArgumentException();
		} else {
			return x/y;
		}
		
	}
	
	public String reverse(String str) throws IllegalStateException{
		if(str.length() == 0) {
			throw new IllegalStateException();
		} else {
			String rev = "";
			for(int i = str.length() - 1; i >= 0; i--) {
				rev += str.substring(i, i+1);
			}
			return rev;
			
		}
		
	}
	
}
