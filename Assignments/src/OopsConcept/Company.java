package OopsConcept;
class Company 
{
	static void display(Coder x, Ate z  )
	{
		System.out.println("eID:" +x.getEID()) ; 
		System.out.println("name:" +x.name) ; 
		System.out.println("salary:" +x.getSalary()) ; 
		System.out.println("language :" +x.getLanguage()) ; 
		x.work() ; 
		System.out.println ("---------------------------------") ; 
		System.out.println("eID:" +z.getEID()) ; 
		System.out.println("name:" +z.name) ; 
		System.out.println("salary:" +z.getSalary()) ; 
		System.out.println("Tool:" +z.getTool()) ; 
		z.work() ; 
	}
	public static void main(String[] args) 
	{
		// constructor Coder( String name , double salary ,String language ) 
	 Coder c = new Coder("tanu",2000,"java") ;
	 Ate a = new Ate("manu",5000,"Selenium") ; 
	 display(c,a) ; 
	}
}
