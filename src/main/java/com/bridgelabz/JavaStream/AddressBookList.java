package com.bridgelabz.JavaStream;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;
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
	        	 adr.FinddetailsByCity(city);
		 
	         }
	    }
	    public void SearchDetailsbystatename(String state)
	    {
	    	
	        for(Map.Entry<String, AddressBookMain> entry: addressbooklist.entrySet())
	        {
	        	System.out.println(entry.getKey());
	        	 AddressBookMain adr= entry.getValue();
	        	 adr.FinddetailsByState(state);

	        }
	       
	    }
	    public void FetchDeatilsbyCarbyHashmap(String city)
	    {
	    	 for(Map.Entry<String, AddressBookMain> entry: addressbooklist.entrySet())
	         {
	             AddressBookMain book=entry.getValue();
	             System.out.println("Address Book: "+ entry.getKey());

	            
	              book.FindDetailsbyCarbyMap(city);
	         }
	    	
	    }
	    public void FetchDetailsbyStatebyHashmap(String state)
	    {
	    	 for(Map.Entry<String, AddressBookMain> entry: addressbooklist.entrySet())
	         {
	             AddressBookMain book=entry.getValue();
	             System.out.println("Address Book: "+ entry.getKey());

	            
	              book.FindDetailsbyStatebyMap(state);;
	         }
	    	
	    }
	    public void TotalcontactByCity(String city)
	    {
	    
	        for(Map.Entry<String, AddressBookMain> entry: addressbooklist.entrySet())
	        {
	            AddressBookMain ad= entry.getValue();
	            ad.CountTotalByCity(city);

	        }
	    }
	    public void TotalcontactByState(String state)
	    {
	    	
	         for(Map.Entry<String, AddressBookMain> entry: addressbooklist.entrySet())
	         {

	             AddressBookMain ad= entry.getValue();
	             ad.CountTotalByState(state);
	         }
	    }
	    public void SortByName()
	    {
	        for(Map.Entry<String, AddressBookMain> entry: addressbooklist.entrySet())
	        {
	            AddressBookMain addressBook=entry.getValue();
	            System.out.println("Address Book : "+entry.getKey());
	            addressBook.SortDetailsByName();
	        }

	    }
	    public void SortByCity()
	    {
	        for(Map.Entry<String, AddressBookMain> entry: addressbooklist.entrySet())
	        {
	            AddressBookMain addressBook=entry.getValue();
	            System.out.println("Address Book : "+entry.getKey());
	            addressBook.SortDetailsByCity();
	        }

	    }
	    public void SortByState()
	    {
	        for(Map.Entry<String, AddressBookMain> entry: addressbooklist.entrySet())
	        {
	            AddressBookMain addressBook=entry.getValue();
	            System.out.println("Address Book : "+entry.getKey());
	            addressBook.SortDetailsByState();
	        }

	    }
	    public void SortByZip()
	    {
	        for(Map.Entry<String, AddressBookMain> entry: addressbooklist.entrySet())
	        {
	            AddressBookMain addressBook=entry.getValue();
	            System.out.println("Address Book : "+entry.getKey());
	            addressBook.SortDetailsbByZip();
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
				System.out.println("1.Enter new address book\n2.Search Contact Details By City Name\n3.Search contact Details by State Name\n4.Search Details By Car By HashMap\n5.Search Details By State By HashMap\n6.Total contact count details by City\n7.Total contact count details by State\n8.Sort By Name\n9.Sort by City names\n10.Sort by State Name\n11.Sort by zip\n12.Exit");
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
	            	 System.out.println("Please Enter city name: ");
	            	 String city_a= sc1.nextLine();
	            	 contactdetails.FetchDeatilsbyCarbyHashmap(city_a);
	                 break;
	            case 5:
	            	System.out.println("Please Enter state name: ");
	            	 String state_a= sc1.nextLine();
	            	 contactdetails.FetchDetailsbyStatebyHashmap(state_a);
	                 break;
	            case 6:
		           	 System.out.println("Enter city name: ");
		           	 String city_b= sc1.nextLine();
		           	 contactdetails.TotalcontactByCity(city_b);
	                break;
	            case 7:
	           	 	System.out.println("Enter state name: ");
	           	 	String state_b =sc1.nextLine();
	           	    contactdetails.TotalcontactByState(state_b);
	                break;
	            case 8:
	            	contactdetails.SortByName();
	                break;
	            case 9:
	            	contactdetails.SortByCity();
	                break;
	            case 10:
	            	contactdetails.SortByState();
	                break;
	            case 11:
	            	contactdetails.SortByZip();
	                break;
	             case 12:
					System.out.println("Succesfilly Exit");
					j=0;
					//sc.close();
					sc1.close();
					sc2.close();
					break;
	             default:
		    		  break;
				}
			}
			
			
		}
}