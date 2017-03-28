/**
* Benchmark
* @author (ImaginatixnLXIV)
* @version (1.0.0)
**/
import java.util.*;
import java.io.*;
public class Benchmark
{
	//Creating gen which is used to generate random numbers
	Random gen; 
	//Creating arraylist to store random numbers to be sorted
	private ArrayList <Integer> numbers;
	//Variables that will contain time
	private long sTime;//Start time
	private long eTime;//End time
	private long totTime;//Final time 
	/**
	* Constructor
	**/
	public Benchmark()
	{
		//Filling gen
		gen = new Random();
		//Filling numbers
		numbers = new ArrayList <Integer> ();
	}//End of constructor

	/**
	* Method in which random numbers will be generated
	* @param none
	* @return none
	**/
	public void createRandom()
	{
		for(int i = 0; i < 1000; i++)
		{
			numbers.add(i, new Integer(gen.nextInt()));
		}//End of for loop
	}//End of method createRandom

	/**
	* Method in which bubble sort will be conducted and timed
	* @param none
	* @return none
	**/
	public void Sort()
	{
		Integer temp;
		//Starting timer
		sTime = System.currentTimeMillis();
		for(int i = 0; i < numbers.size() - 1; i++)
		{
			for(int j = 0; j < numbers.size() - i - 1; j++)
			{
				//Bubble Sort
				if(numbers.get(j).compareTo(numbers.get(j+1)) > 0)
				{
					temp = numbers.get(j);
					numbers.set(j, numbers.get(j+1));
					numbers.set(j+1, temp);
				}
			}//End of inner for loop
		}//End of outer for loop
		eTime = System.currentTimeMillis();
		totTime = eTime - sTime;
	}//End of sort method

	/**
	* Method which will output time to file Benchmark.txt
	* @param none
	* @return none
	**/
	public void writeTime()
	{
		//Stores time to String
		String time = String.valueOf(totTime);
		try
		{
			//Outputting time to file Benchmark.txt
			FileWriter file = new FileWriter("Benchmark.txt");
			file.write(time,0, time.length());
			file.close();
		}catch(IOException i)
		{
			System.out.println("ERROR: " + i.getMessage());
		}//End of catch
	}//End of method writeTime
}//End of class Benchmark
