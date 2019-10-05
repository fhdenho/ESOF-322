//HW2 - ESOF 322 Khbindar - Fahad
package HW2;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		

			DBStratergy client = new DBStratergy();
			
			System.out.println("Please choose one of the following methods to store your data\n ");
			System.out.println("1.Relational ");
			System.out.println("2.NoSql ");
			System.out.println("3.Graph\n ");
			

			
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the respective number of the data base that you want to use:");
			int user_input = input.nextInt();
			
			client.setStoreStratergy(user_input);
			
			if (user_input == 1) {
				System.out.println("Realtional Database storing was successful");
			}
			else if(user_input == 2) {
				System.out.println("NoSQL Database storing was successful");
			}
			else if (user_input == 3)
			{
				System.out.println("Graph Database storing was successful");
			}
			
			
			input.close();
		
	}

}
//HW2 - ESOF 322 Khbindar - Fahad
package HW2;

public abstract class DataBase extends DBStratergy {


	public abstract void store();
	
}

//HW2 - ESOF 322 Khbindar - Fahad
package HW2;


public class DBStratergy {

	public DataBase db;
	
	

	public void setStoreStratergy(int user_input) {
			if (user_input == 1) {
				db = new Relational();
				this.db.store();
			}
			if (user_input == 2) {
				db = new NoSql();
				this.db.store();
			}
			if (user_input == 3) {
				db = new Graph();
				this.db.store();
			}
		}
			
}

//HW2 - ESOF 322 Khbindar - Fahad
package HW2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Graph extends DataBase{
	
	public void store() {
		try {
			File file = new File("Graph-DB.txt");
			FileWriter filewriter;
			filewriter = new FileWriter(file);
			filewriter.write("Node Store");
		    filewriter.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}



//HW2 - ESOF 322 Khbindar - Fahad
package HW2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class NoSql extends DataBase {
	
	public void store() {
		try {
			File file = new File("NoSql-DB.txt");
			FileWriter filewriter;
			filewriter = new FileWriter(file);
			filewriter.write("Document Store");
		    filewriter.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
//HW2 - ESOF 322 Khbindar - Fahad
package HW2;

import java.io.*;

public class Relational extends DataBase {

	public void store() {
		try {
			File file = new File("Relational-DB.txt");
			FileWriter filewriter;
			filewriter = new FileWriter(file);
			filewriter.write("Table Store");
		    filewriter.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}

//----------- output ---------
//Node Store
//----------- output ---------
//Document Store 
//----------- output ---------
//Table Store 
