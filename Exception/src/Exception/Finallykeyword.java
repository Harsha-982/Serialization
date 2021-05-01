package Exception;

public class Finallykeyword {
	public static int returncontrol(){
		int integer1=25;
		int integer2=0;
		try {
			int result=20/10;
			return result;	
		}
		finally {
			/*even though you use any kind of jump statements even then finally gets executed first.
			*/
			System.out.println("you can't ran out from the finally method until to excecutr it");
		}
	}
	public static void main(String[] args) {
		System.out.println(Finallykeyword.returncontrol());
		
	}
}
