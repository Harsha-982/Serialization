package Phonebook;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;

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
			switch(command) {
			case("find"):
				System.out.println("Enter phonenumber or name");
				String nameornumber=sc.nextLine();
				phonebook.find(nameornumber);
				break;
			case("add"):
				System.out.println("Enter name");
				String name=sc.nextLine();
				System.out.println("Enter number");
				String string=sc.nextLine();
				String[] number=string.split(" ");
				System.out.println("Enter emailid");
				String emailid=sc.nextLine();
				
				if(name.length()>0 & number.toString().length()>0 & emailid.length()>0)
					phonebook.addContact(name, number, emailid);
				else {
					System.out.println("error occured");
				}
				break;
			case("download"):
				System.out.println("Enter name");
				String name1=sc.nextLine();
				phonebook.downloadFile(name1);
				break;
			}
	}
}
class Phonebook{
	static HashMap<String,CopyOnWriteArrayList<String>> details=new HashMap<String,CopyOnWriteArrayList<String>>();
	CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<String>();
	static CopyOnWriteArrayList<String> arrlist=new CopyOnWriteArrayList<String>();
	int count=0;
	public void addContact(String name,String[] number,String emailid) {
		Boolean num =false;
		for(int i=0;i<number.length;i++) {
			num=arrlist.addIfAbsent(number[i]);
			if(num==true) {
				list.add(number[i]);
				count=count+1;
			}
		}
		if(details.containsKey(name)) {
			System.out.println("Already contact exist");
		}
		else if(count>0) {
			list.add(name);
			list.add(emailid);
		}
		else if(count<0){
			System.out.println("Number already exists");
		}
		
		if(count>0 & details.containsKey(name)==false){
			details.put(name,list);
			System.out.println("details of "+name+" has been updated");
			System.out.println(details);
			
		}
	}
	public void downloadFile(String name) {
		try {
			ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("details"));
			oos.writeObject(details.get(name));
			ObjectInputStream ois =new ObjectInputStream(new FileInputStream("details"));
			CopyOnWriteArrayList d=(CopyOnWriteArrayList)ois.readObject();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void find(String nameornumber) {
		for (Entry<String, CopyOnWriteArrayList<String>> entry: details.entrySet())
		{
			for(String s:entry.getValue()) {
				if(nameornumber.equals(s)) {
					System.out.println(entry.getValue());
					}
				else {
					System.out.println("Contact details not found");
					}
				}
			}
		}
	}
class Main{
	public static void main(String[] args) {
		new Admin();
	}
}
