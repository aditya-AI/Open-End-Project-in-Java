import java.io.*;
import java.util.*;
import static java.lang.System.*;
 
class customer
{
    
	int Cid;
	String Cname;	
	int Age;
	String Cpolicy;
	int Cpremium;

	  public void getcustomerDetails()
	  {
	
		System.out.println("enter the details of customer cid,name,age,policy and premium");
		DataInputStream ds=new DataInputStream(System.in);
		try
			{
				System.out.println("enter id");
				Cid = Integer.parseInt(ds.readLine());
				System.out.println("enter cname");
				Cname = ds.readLine();
				System.out.println("enter age");
				Age = Integer.parseInt(ds.readLine());
				System.out.println("enter cpolicy ");
				Cpolicy = ds.readLine();
				System.out.println("enter cpremium");
				Cpremium = Integer.parseInt(ds.readLine());

		
		        }
		catch(Exception e)
			{
				  System.out.println("exception"+e);
			}



	 

                        


 try
{ 
  FileOutputStream out=new FileOutputStream("cust.txt");

out.write(Cid);
out.write(Cname.getBytes());

out.write(Age);
out.write(Cpremium);

out.close();

}
catch(IOException ioe)
{
System.out.println("error");
} 
}	


        
    public void display()
    {
        System.out.println(Cid+"         "+Cname+"         "+Age+"        "+Cpolicy+"       "+Cpremium);                           
			       
			


  try {
    BufferedReader in = new BufferedReader(new FileReader("cust.txt"));
    String str;
    while ((str = in.readLine()) != null)
      
    in.close();
} catch (IOException e) {
}


   }
} 
 				


class policy 
{
	int Pid;
	String Pname;	
	int Premium;
	

	public void getpolicyDetails()
	{
		System.out.println("enter the details of policy pid,pname,agegroup,premium");
		DataInputStream ds=new DataInputStream(System.in);
		try
			{
				System.out.println("enter pid");
				Pid = Integer.parseInt(ds.readLine());
				System.out.println("enter pname");
				Pname = ds.readLine();
				System.out.println("enter premium");
				Premium = Integer.parseInt(ds.readLine());
			}
		catch(Exception e)
			{
				  System.out.println("exception"+e);
	

			}
	
                       
try
{ 
  FileOutputStream out=new FileOutputStream("policy.txt");

out.write(Pid);
out.write(Pname.getBytes());
out.write(Premium);

out.close();

}
catch(IOException ioe)
{
System.out.println("error");
} 
	





	}



	 

   public void display()
    {
	     System.out.println(+Pid+"       "+Pname+"       "+Premium);
    
try {
    BufferedReader in = new BufferedReader(new FileReader("cust.txt"));
    String str;
    while ((str = in.readLine()) != null)
      
    in.close();
 catch (IOException e) {
}
}

                  

   }
   		  
     
}

 
class in1
{
	static int f;
	static int g;	
    public static void main(String args[]) 
    {   
        int a,b,d,h,i;
			customer c[] = new customer[200];
			policy p[]=new policy[200]; 
			for(i=0;i<199;i++)
			{
			c[i] = new customer();
			}
			for(i=0;i<199;i++)
			{
			p[i] = new policy();
			}


	do
	{  
			System.out.println("enter 1 for adding customer ");
			System.out.println("enter 2 for adding policy");
			System.out.println("enter 3 for seeing customer details" );
			System.out.println("enter 4 for seeing policy details");
			System.out.println("enter 5 for exit");
			Scanner s=new Scanner(System.in);
			a=s.nextInt();
			d=0;
			h=0;
			


			
		switch(a)
		{ 
			case 1:
			do
        	  	   {  
			
				System.out.println("enter the customer" +(f+1)+" details");
                	        c[f].getcustomerDetails();
				System.out.println("press 1 for more input or 0 for exit");
                    		d=s.nextInt();
				f++;
                  	  }
			while(d>0);
	                break;
		 	
			case 2:
			do
               		{
				System.out.println("enter the policy" +(g+1)+" details");
                		p[g].getpolicyDetails();
				System.out.println("press 1 for more input or 0 for exit");
				d=s.nextInt();
				g++;
		   
                  
                	}
			while(d>0);
                        break;
     
			case 3:
			
				System.out.println("Customer Details");
        			System.out.println("Cid"+"         "+"Cname"+"           "+"Age"+"              "+"Cpolicy"+"          "+"Cpremium");
				for(i=0;i<f;i++)
				{

				c[i].display();
				}
				
				
			break;
			
			case 4: 
				System.out.println("Policy Details");
        			System.out.println("Pid"+"          "+"Pname"+"              "+"Premium");
   	            
				for(i=0;i<g;i++)
				{
				p[i].display();
				}
				
			break;
		    
		 
		

			case 5: System.exit(0);
			break;
			
			default: System.out.println("wrong option");
                 }



			System.out.println("press 1 for more or 0 for exit");
	                h=s.nextInt();
          }			
			while(h>0);
    }  
}


	

