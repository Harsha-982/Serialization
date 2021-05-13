package Collection;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Hashtable;
import java.util.Properties;

public class Properties1 {

	public static void main(String[] args) throws IOException {
		Properties prop=new Properties();// properties object
		FileInputStream file=new FileInputStream("abc.txt"); // to read data from file
		prop.load(file);		// loading all properties from properties file into java program
		System.out.println(prop);//{pwd=9999, user=harsha}
		String str=prop.getProperty("pwd");
		System.out.println(str);
		prop.setProperty("pwd","1234");
		System.out.println(prop);
		FileOutputStream fos=new FileOutputStream("abc.txt");
		prop.store(fos,"updating the file");
	}

}

class Hashtable1{
	public static void main(String[] args) {
		Hashtable hash=new Hashtable();
		//default capacity is 11
		hash.put(new Test(2),"usha");
		hash.put(new Test(15),"Baby");
		System.out.println(hash);
	}
}
class Test{
	int i;
	Test(int i){
		this.i=i;
	}
	public int hashcode() {
		return i;
	}
	public String toString() {
		return i+"";
	}
	
}
