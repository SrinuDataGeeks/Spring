class   Branch implements java.lang.Cloneable
	{
private String cmpName;
private String  cmpCeo;
private String  branchLocation;


public void setCmpName(String cmpName)
{
this.cmpName=cmpName;
}

public void  setCmpCeo(String cmpCeo)
	{
this.cmpCeo=cmpCeo;
	}

public void setBranchLocation(String location)
{
branchLocation=location;
}

public String toString()
{
return cmpName+" : "+cmpCeo+" : "+branchLocation;
}

public Branch getBranchObject() throws Exception
{
Branch obj=(Branch)super.clone();
return obj;
}

	}

public  class  CloneableApp
	{
public static void main(String args[]) throws Exception
{
Branch obj1=new Branch();
obj1.setCmpName("Microsoft");
obj1.setCmpCeo("Satyam-");
obj1.setBranchLocation("Banglore");
System.out.println("Object1 :"+obj1);//obj1.toString()

Branch obj2=obj1.getBranchObject();
obj2.setBranchLocation("Hyd");

System.out.println("Object2 :"+obj2);
}
	}






















