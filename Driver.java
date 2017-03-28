/**
* Simple Benchmark that creates 500 random integers 
* and sorts them using a bubble sort and is being timed
* @author (ImaginatixnLXIV)
* @version (1.0.0)
**/
import java.util.*;
public class Driver 
{
	/**
	* Main method
	* @param args default main parameter
	* @return none
	**/
	public static void main(String [] args)
	{
		Benchmark myBench = new Benchmark();
		myBench.createRandom();
		myBench.Sort();
		myBench.writeTime();
	}//End of Main method
}//End of Benchmark class
