package com.bridgelabz.JavaStream;
import java.util.*;
import java.util.stream.*;

public class AddressBookMain {
	
	public static ArrayList<Address> persons;
	public HashMap<String,ArrayList<Address>> persons_a;
    public HashMap<String,ArrayList<Address>> persons_b;
	
	
	 Scanner sc= new Scanner(System.in);
	
	      public AddressBookMain() 
	      {
	            persons = new ArrayList<Address>();   
	            persons_a=new HashMap<>();
	            persons_b=new HashMap<>();
	      }
	      
	      
	      public static Address Findname(String name)
	      {
	    	  Address findname=new Address();
	    	  
	    	  for(int i=0;i<persons.size();i++)
	    	  {
	    		  Address c= (Address)persons.get(i);
	    		  
	    		  if(name.equals(c.firstname))
	    		  {
	    			   findname=c;
	    		  }
	    		  
	    	  }
	    	  System.out.println("\n"+findname.firstname+" "+findname.lastname+" "+findname.address+" "+findname.city+" "+findname.email+" "+findname.zip+"\n");
	    	  
			return findname;
	    	  
	      }
	      public void FinddetailsByCity(String city)
	      {

        	  List<Address> list= persons.stream().filter(p->p.getCity().equals(city)).collect(Collectors.toList());
	          for(Address ad: list) {
	              System.out.println(ad.firstname);
	          }
	       
	      }
	      public void FinddetailsByState(String state)
	      {

        	  List<Address> list= persons.stream().filter(p->p.getState().equals(state)).collect(Collectors.toList());
	          for(Address ad: list) {
	              System.out.println(ad.firstname);
	          }
	       
	      }
	      public void FindDetailsbyCarbyMap(String city)
	      {
	    	  ArrayList<Address> person1 = new ArrayList<Address>();
	    	  person1=persons_a.get(city);
	    	  List<Address> list= person1.stream().filter(p->p.getCity().equals(city)).collect(Collectors.toList());
	          //Address details= persons_a.get(city);
	         // System.out.println("\n"+details.firstname+" "+details.lastname+" "+details.address+" "+details.city+" "+details.state+" "+details.email+" "+details.zip+"\n");
	      for(Address ad:list)
	      {
	    	  System.out.println(ad.firstname);
	      }
	      }
	      public void FindDetailsbyStatebyMap(String state)
	      {

	    	  ArrayList<Address> person2 = new ArrayList<Address>();
	    	  person2=persons_b.get(state);
	    	  List<Address> list= person2.stream().filter(p->p.getState().equals(state)).collect(Collectors.toList());
	          //Address details= persons_a.get(city);
	         // System.out.println("\n"+details.firstname+" "+details.lastname+" "+details.address+" "+details.city+" "+details.state+" "+details.email+" "+details.zip+"\n");
	      for(Address ad:list)
	      {
	    	  System.out.println(ad.firstname);
	      }
	      }
	      public void CountTotalByState(String state)
	      {

	          int list= Math.toIntExact(persons.stream().filter(p -> p.getState().equals(state)).count());
	          System.out.println("Total persons living in this state in this address book is: "+list);
	      }
	      public void CountTotalByCity(String city)
	      {

	          int list= Math.toIntExact(persons.stream().filter(p -> p.getCity().equals(city)).count());
	          System.out.println("Total persons living in this city in this address book is: "+list);
	      }
	      public void AddName()
	      {
	    	  String a,b,z,d,e,f,g,h;
	    	  System.out.println("Enter your details\n");
	    	  System.out.println("First name\n");
	    	  a=sc.nextLine();
	    	  List resultFirstName=persons.stream().map(x->x.getFirstName()).collect(Collectors.toList());
	    	  for(int i=0;i<resultFirstName.size();i++)
	    	  {
	    		  if(a.equals(resultFirstName.get(i)))
	    		  {
	    			  System.out.println("ohhhhh! Name Already Taken");
	    			  return;
	    		  }
	    	  }
	    	  System.out.println("Last name\n");
	    	  b=sc.nextLine();
		//  for(int i=0;i<persons.size();i++)
		//   {
		//   Address name=(Address)persons.get(i);
		//     if(a.equals(name.firstname) && b.equals(name.lastname))
		//       {
		//	System.out.println("ohhhhh! Name Already Taken");
		//	return;
		//	}
		//  }
	    	  //if(a.equals(persons.stream().filter(x->x.firstname)))
	    	 
	    	  
	    	  System.out.println("Address\n");
	    	  z=sc.nextLine();
	    	  System.out.println("City\n");
	    	  d=sc.nextLine();
	    	  System.out.println("State\n");
	    	  e=sc.nextLine();
	    	  System.out.println("Zip\n");
	    	  f=sc.nextLine();
	    	  System.out.println("Phone No.\n");
	    	  g=sc.nextLine();
	    	  System.out.println("Email\n");
	    	  h=sc.nextLine();
	    	  Address c= new Address(a,b,z,d,e,f,g,h);
	    	  System.out.println("First name "+c.firstname+"\n");
	    	  persons.add(c);
	    	  System.out.println("Added succesfully, the Contacts are\n");
	    	  for (int i = 0; i < persons.size(); i++)
	    	  { 
	    		  persons.get(i).Display();
	          } 
	    	 
	      }
	      public void edit(String name)
	      { 
	    	  System.out.println("\nIn the Edit Method \n");
	    	  Address c=Findname(name);
	    	  System.out.println("Enter Choice to edit\n1.First Name\n2.Second name\n3.Address\n4.City\n5.State\n6.Zip\n7.Phone\n8.Email\n");
	    	  int choice=sc.nextInt();
	    	  switch(choice)
	    	  {
	    	  case 1:
	    		  System.out.println("Enter new name:");
	    		  c.firstname=sc.nextLine();
	    		  for (int i = 0; i < persons.size(); i++)
	    		  { 
	    		  persons.get(i).Display(); 
	    		  } 
	    		  break;
	    	  case 2:
	    		  System.out.println("Enter last name:");
	    		  c.lastname=sc.nextLine();
	    		  for (int i = 0; i < persons.size(); i++)
	    		  { 
	    			  persons.get(i).Display();
	    		  } 
	    		  break;
	    	  case 3:
	    		  System.out.println("Enter new address:");
	    		  c.address=sc.nextLine();
	    		  for (int i = 0; i < persons.size(); i++)
	    		  { 
	    			  persons.get(i).Display();
	    		  } 
	    		  break;
	    	  case 4:
	    		  System.out.println("Enter new city:");
	    		  c.city=sc.nextLine();
	    		  for (int i = 0; i < persons.size(); i++)
	    		  { 
	    			  persons.get(i).Display();
	    		  } 
	    		  break;
	    	  case 5:
	    		  System.out.println("Enter new state:");
	    		  c.state=sc.nextLine();
	    		  for (int i = 0; i < persons.size(); i++)
	    		  { 
	    			  persons.get(i).Display(); 
	    		  } 
	    		  break;
	    	  case 6:
	    		  System.out.println("Enter new zip:");
	    		  c.zip=sc.nextLine();
	    		  for (int i = 0; i < persons.size(); i++)
	    		  { 
	    			  persons.get(i).Display();
	    		  } 
	    		  break;
	    	  case 7:
	    		  System.out.println("Enter new number:");
	    		  c.number=sc.nextLine();
	    		  for (int i = 0; i < persons.size(); i++)
	    		  { 
	    			  persons.get(i).Display();
	    		  } 
	    		  break;
	    	  case 8:
	    		  System.out.println("Enter new email:");
	    		  c.email=sc.nextLine();
	    		  for (int i = 0; i < persons.size(); i++)
	    		  { 
	    			  persons.get(i).Display();
	    		  } 
	    		  break;
	    	  default:
	    		  break;
	    			  
	    	  
	    	  }
	    	  
	    	  
	      }
	      
	      public void delete(String name)
	      {
	    	  for(int i=0;i<persons.size();i++)
	    	  {
	    	  
    		  Address c= (Address)persons.get(i);
    		  if(name.equals(c.firstname))
    		  {
    			  persons.remove(i);
    		  }
	    	  }
	    	  for (int i = 0; i < persons.size(); i++) { 
	    		  System.out.println("After Deletion");
	    		  persons.get(i).Display(); 
	          } 
    		  
	    	  
	      }
	      
	     
}