class  Sample
	{
public Sample()
{
System.out.println("\n\n From Constructor : Sample Object is Created...");
}

public void finalize()
{
System.out.println("\n\n From finalize: Sample Object is Removed by JVM...");
}
	}

public class SampleApp
	{
public static void main(String args[])
{
Sample obj=new Sample();
obj=null;// If we keep thist stmt in comment JVM won't
	 // remove the Sample object
System.gc();
}
	}





















