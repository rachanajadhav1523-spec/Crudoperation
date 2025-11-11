package CrudOperation;
import java.util.Scanner;


public class Crudopn {
	
	
	public static void main(String args[]) throws Exception {
		Scanner bb = new Scanner(System.in);
		int ch=0;
		while(ch!=5)
		{
		
		System.out.println("\n\nMain Menu for Student Data Entry..");
		System.out.println("1.Add student Details..");
		System.out.println("2.Update Student Details..");
		System.out.println("3.Delete Student Details..");
		System.out.println("4.Display Student Details..");
		
		
		System.out.println("5.Exits");
		
		
		System.out.println("\nenter the  number above menu : ");
		ch=bb.nextInt();
		
		switch(ch){
		   case 1:
			   System.out.println("enter the id : ");
			   int a=bb.nextInt();
			   
			   System.out.println("enter the name : ");
			   String b=bb.next();
			   
			   System.out.println("enter the per : ");
			   float c=bb.nextFloat();
			   
			   System.out.println("\nAdding data.....");
			   AddDAta.addingStudent(a,b,c);//-------------------------------------------call the method for adding rows.
			   System.out.println("inserting completed----------------");
			   break;
			   
		   case 2:
			   System.out.println("\nupdated......");
			   System.out.println("enter the which name will be :-");
			   String name=bb.next();
			   
			   System.out.println("enter the id no for updating :- ");
			   int id=bb.nextInt();
			   
			   AddDAta.updatedataStudent(name,id);//---------------------------------call the method for updating data from table.
			   System.out.println("updated completed----------------");
			   break;
			  
		   case 3:
			   System.out.println("\ndelete data.....");
			   System.out.println("enter the id no :- ");
			   int ids=bb.nextInt();
			   AddDAta.deletedatastudent(ids);//---------------------------------------call the method for deleting data from table
			   System.out.println("deleting  completed----------------");
			   break;
			   
		   case 4:
			   System.out.println("Display data....");
			   AddDAta.Displayingdata();//-----------------------------------------------call the method for Displaying all row.
			   System.out.println("showing completed----------------");
			   break;
			   
		   case 5:
			   System.out.println("crud operation exits.............");
			   System.exit(ch);
			   break;
			
		}
	
		
		

	}
}
}