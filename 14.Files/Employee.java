import java.io.Serializable;

class Employee implements Serializable 
{
	private int eid;
	private String name;
	private String desg;
	private double sal;

	Employee()
	{
	}

	Employee(int eid, String name, String desg, double sal)
	{
		this.eid  = eid;
		this.name = name;
		this.desg = desg;
		this.sal  = sal;
	}

	public void SetEid(int eid)
	{
		this.eid = eid;
	}
	public int GetEid()
	{
		return eid;
	}

	public void SetEname(String name)
	{
		this.name = name;
	}
	public String GetEname()
	{
		return name;
	}

	public void SetDesg(String desg)
	{
		this.desg = desg;
	}
	public String GetDesg()
	{
		return desg;
	}

	public void SetSal(double sal)
	{
		this.sal = sal;
	}
	public double GetSal()
	{
		return sal;
	}

	public String EmployeeDetails()
	{
		return "EmpID : " + eid  + "\n" + 
				   "Ename : " + name + "\n" + 
				   "Desg  : " + desg + "\n" + 
				   "Sal   : " + sal  + "\n";
	}
}
