package com.bridgelabz.JavaStream;
import java.util.*;
import java.util.stream.Collectors;
public class AddressBookList {
	
	
	public static HashMap<String,AddressBookMain> addressbooklist;
	
	public AddressBookList()
	{
		addressbooklist= new HashMap<>();
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
    		  default:
	    		  break;
    	  
    	    }
    	}  
		  
		  addressbooklist.put(name, a);
		  for (Map.Entry<String,AddressBookMain> entry : addressbooklist.entrySet())
		  	{
			  System.out.println("AddressBookName = " + entry.getKey() + ", Details = " + entry.getValue());
		  	}
	          
		  
		  System.out.println("Added successfully");
   	  
		
	}
	 public void SearchDetailsbycityname(String city)
	    {
		
	        for(Map.Entry<String, AddressBookMain> entry: addressbooklist.entrySet())
	        {
	            
	            System.out.println(entry.getKey());
	        	 AddressBookMain adr= entry.getValue();
	        	 adr.Finddetails(city);
		 
	         }
	    }
	    public void SearchDetailsbystatename(String state)
	    {
	    	int flag=0;
	        for(Map.Entry<String, AddressBookMain> entry: addressbooklist.entrySet())
	        {
	           for(int i=0;i<(entry.getValue()).persons.size();i++)
	            {
	                Address details= (Address)entry.getValue().persons.get(i);

	                if(state.equals(details.state))
	                {
	                    System.out.println("Address Book : "+entry.getKey());
	                    System.out.println(details.firstname+" "+details.lastname+" "+details.address+" "+details.city+" "+details.email+" "+details.state+" "+details.zip+"\n");
	                }

	            }

	        }
	        if(flag==0)
            {
            	System.out.println("No body is here registered in this address book from " +state+" state name\n");
            }
	    }
	public static void main(String[] args) 
	{
		System.out.println("Welcome to AddressBookManagementSystem");
		AddressBookList contactdetails= new AddressBookList();
		Scanner sc1= new Scanner(System.in);
		int j=1;
		while(j==1)
		{
			System.out.println("1.Enter new address book\n2.Search Contact Details By City Name\n3.Search contact Details by State Name2\n4.Exit");
			Scanner sc2= new Scanner(System.in);
			int choice=sc2.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter address book name: ");
				String addressbookname= sc1.nextLine();
				if(addressbooklist.containsKey(addressbookname))
				{
					System.out.println("AddressBookList have already this name");
					break;
				}
				contactdetails.addAddressbook(addressbookname);
				break;
			 case 2:
                 System.out.println("Please Enter city name: ");
                 String city= sc1.nextLine();
                 contactdetails.SearchDetailsbycityname(city);
                 break;
             case 3:
                 System.out.println("Please Enter state name: ");
                 String state= sc1.nextLine();
                 contactdetails.SearchDetailsbystatename(state);
                 break;
             case 4:
				System.out.println("Succesfilly Exit");
				j=0;
				break;
             default:
	    		  break;
			}
		}
		
		
	}

}