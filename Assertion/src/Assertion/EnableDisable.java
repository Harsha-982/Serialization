package Assertion;

public class EnableDisable {
	public static void main(String[] args) {
		int num=10;
		assert(num>10):"number should be"+num++;
		System.out.println(num);
	}
}
class Second{
	public static void main(String[] args) {
		String string="harsha";
		
		//prints AssertionError:togaru if assert comf=dition is false.. if not continues program as it is
		assert(string.equals("togaru")):string="togaru";
		System.out.println(string);
	}
}

class Third{
	public static void main(String[] args) {
	int month=13;
	switch(month) {
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
	case 12:
		System.out.println("valid number");
		break;
	default:
		assert(false):"invalid month number";
	}
		
	}
}