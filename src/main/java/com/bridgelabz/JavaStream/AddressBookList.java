package com.bridgelabz.JavaStream;
import java.util.*;
public class AddressBookList {
	
	
	public static HashMap<String,AddressBookMain> addrbooklist;
	
	public AddressBookList()
	{
		addrbooklist= new HashMap<>();
	}
	public void addAddressbook(String name)
	{
		 AddressBookMain a= new AddressBookMain();
		 int f=1;;
   while(f==1)
    	  {
    		
    	    System.out.println("\n1.Add\n2.Edit\n3.Delete\n4.Exit\nEnter your choice : ");
    	    Scanner sc = new Scanner(System.in);
    	    int ch = sc.nextInt();
    	 
    	    switch(ch)
    	    {
    		  case 1:
    			  a.AddName();
    			  break;
    			  
    		  case 2:
    			  System.out.println("Enter name to edit");
    			  String a1= sc.nextLine();
    			  a.edit(a1);
    			  break;
    			  
    		  case 3:
    		  	  System.out.println("Enter name to delete");
    			  String a2=sc.nextLine();
    			  a.delete(a2);
    			  break;
    			  
    		  case 4:
    			  System.out.println("Work Done, Succesfully out");
    			  f=0;
    			  break;
    	  
    	    }
    	}  
		  
		  addrbooklist.put(name, a);
		  for (Map.Entry<String,AddressBookMain> entry : addrbooklist.entrySet())
		  	{
			  System.out.println("AddressBookName = " + entry.getKey() + ", Details = " + entry.getValue());
		  	}
	          
		  
		  System.out.println("Added successfully");
   	  
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome to AddressBookManagementSystem");
		AddressBookList adr= new AddressBookList();
		Scanner sc1= new Scanner(System.in);
		int j=1;
		while(j==1)
		{
			System.out.println("1.Enter new address book\n2.Exit");
			int choice=sc1.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter address book name: ");
				String addressbookname= sc1.nextLine();
				if(addrbooklist.containsKey(addressbookname))
				{
					System.out.println("AddressBookList have already this name");
					break;
				}
				adr.addAddressbook(addressbookname);
				break;
			case 2:
				System.out.println("Succesfilly Exit");
				j=0;
				break;
				
			}
		}
		
		
	}

}