package Phonebook;

import java.io.*;
import java.util.*;


class Admin{
	Admin(){
		Scanner sc=new Scanner(System.in);
		String username;
		String password;
		System.out.println("Enter Username");
		username=sc.nextLine();
		System.out.println("Enter password");
		password=sc.nextLine();
		String command;
		if(username.equals("harsha") && password.equals("ht")) {
			do {
				System.out.println("add");
				System.out.println("find");
				System.out.println("save");
				System.out.println("download");
				System.out.println("exit");
				command=sc.nextLine();
				accessToAdmin(command);
			}while(command.equals("exit")==false);
		}
		else {
			System.out.println("invalid login creditials");
		}
	}
	public static void accessToAdmin(String command) {
		Scanner sc=new Scanner(System.in);
		Phonebook phonebook=new Phonebook();
			if(command.equals("find")){
				System.out.println("Enter phonenumber or name");
				String nameornumber=sc.nextLine();
				phonebook.find(nameornumber);
			}
			else if(command.equals("add")) {
				System.out.println("Enter name");
				String name=sc.nextLine();
				System.out.println("Enter number");
				String number=sc.nextLine();
				System.out.println("Enter emailid");
				String emailid=sc.nextLine();
				phonebook.addContact(name, number, emailid);
			}
			else if(command.equals("save")) {
				System.out.println("Enter filename");
				String filename =sc.nextLine();
				System.out.println("Enter name");
				String name=sc.nextLine();
				System.out.println("Enter number");
				String number =sc.nextLine();
				phonebook.saveFile(filename,name,number);
			}
			else if(command.equals("download")) {
				String filename=sc.nextLine();
				phonebook.downloadFile(filename);
			}
	}
}
class Phonebook{
	HashMap details=new HashMap();
	Properties saving=new Properties();
	ArrayList list=new ArrayList();
	Phonebook(){
		this.details=details;
		this.list=list;
		this.saving=saving;
		ArrayList h=new ArrayList();
		Collections.addAll(h,"harsha","701377389","harsha@gmail.com");
		ArrayList c=new ArrayList();
		Collections.addAll(c,"chandu","9849865767","chandu@gmail.com");
		ArrayList l=new ArrayList();
		Collections.addAll(l,"lalitha","9848816812","lalitha@gmail.com");
		ArrayList a=new ArrayList();
		details.put("harsha",h);
		details.put("7013773839",h);
		details.put("chandu",c);
		details.put("9849865767",c);
		details.put("lalitha",l);
		details.put("9848816812",l);
	
	}
	public void addContact(String name,String number,String emailid) {
		Scanner sc=new Scanner(System.in);
		list.add(emailid);
		list.add(number);
		list.add(name);
		if(details.containsKey(name)) {
			System.out.println("contact already exists");
			System.out.println("want to replace yes :no");
			String choice =sc.nextLine();
			if(choice.equals("yes")){
				details.put(name,list);
				System.out.println(name+" details are updated to "+details.get(name));
			}
			else {
				System.out.println("Okay");
			}
		}
		else {
			try {
				details.put(name,list);
				FileOutputStream fos=new FileOutputStream("details");
				saving.setProperty(name,name+" "+number+" "+emailid);
				saving.store(fos,"updated");
				System.out.println(details.get(name));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void downloadFile(String filename) {
		try {
			FileInputStream fis =new FileInputStream(filename);
			saving.load(fis);
			System.out.println(saving);
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	public void saveFile(String filename,String name,String number) {
		try {
			FileOutputStream fos=new FileOutputStream(filename);
			saving.setProperty("name",name);
			saving.setProperty("number",number);
			saving.store(fos,"successfully stored");
			System.out.println(saving);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void find(String nameornumber) {
		if(this.details.containsKey(nameornumber)) {
			System.out.println(details.get(nameornumber));
		}
		else {
			System.out.println("Not found");
		}
		
	}
}
class Main{
	public static void main(String[] args) {
		Admin a=new Admin();
	}
}
