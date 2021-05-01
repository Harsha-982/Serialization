package Exception;

public class CustomizedException extends RuntimeException{
	CustomizedException(String s){
		super(s); //  to make description available to the Default Exception handler (i.e,printStackTrace)
	}

}

class call{
	public static void main(String[] args) {
		int age=15;
		if(age<21) {
			throw new CustomizedException("You are not eligible for applying");// creat an object and then throw
		}
	}
}