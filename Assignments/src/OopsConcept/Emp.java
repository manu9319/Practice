package OopsConcept;
abstract class Emp 
{
	static int counter = 0 ;
	private int eID ; 
	private double salary ; 
	String name ; 

	{
		eID = ++counter ; 
	}

	int getEID ()
	{
		return eID ;
	}

	double getSalary()
	{
		return salary ; 
	}

	void setSalary( double salary)
	{
		this.salary = salary ; 
	
	}

	

	Emp()
	{
	}

	Emp( String name , double salary)
	{
		this.name = name ; 
		this.salary = salary ; 
	}
	abstract void work();
	
}

