package OopsConcept;
class Ate extends Tester
{
	private String tool ; 

	String getTool()
	{
		return tool ; 
	}
	void setTool( String tool )
	{
		this.tool = tool ; 
		
	}

	Ate()
	{
	}

	Ate ( String name , double salary ,String tool  )
	{
		super(name,salary); 
		this.tool = tool ; 
	}
	void work()
		{
		System.out.println(name +" is working as  " + Designation) ; 
		System.out.println("working on selenium with java");

		}
	}

