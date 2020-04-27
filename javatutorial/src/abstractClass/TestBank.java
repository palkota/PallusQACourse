package abstractClass;

abstract class Bank
{    
	abstract int getRateOfInterest();    //abstract method
}    

class SBI extends Bank
{    
	int getRateOfInterest()
	{
		return 7;
	}    
}

class PNB extends Bank
{    
	int getRateOfInterest()
	{
		return 8;
	}    
}    
    
class TestBank
{    
	public static void main(String args[])
	{    
		Bank b;  
		b=new SBI();  
		System.out.println("Rate of Interest of SBI is: "+b.getRateOfInterest()+" %");    
		b=new PNB();  
		System.out.println("Rate of Interest of PNB is: "+b.getRateOfInterest()+" %");    
	}
	
}    


