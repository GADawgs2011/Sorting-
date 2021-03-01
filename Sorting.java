/*Using: Array
 -Selection
 -Insertion 
 - Bubble
*/
import java.util.*;
public class Sorting 
{
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		int [] array1 = {12,11,13,5,6};
		System.out.println("Array before bubble sort:" + Arrays.toString(array1));
		bubbleSort(array1);
		System.out.println("Array after bubble sort:" + Arrays.toString(array1));
		int [] array2 = {64,25,12,22,11};
		System.out.println("Array before selection sort:" + Arrays.toString(array2));
		selectionSort(array2);
		System.out.println("Array after selection sort:" + Arrays.toString(array2));
		int [] array3= {64,25,12,22,11};
		System.out.println("Array before insertion sort:" + Arrays.toString(array3));
		insertionSort(array3);
		System.out.println("Array after insertion sort:" + Arrays.toString(array3));
	}
	public static void bubbleSort(int [] array)
	{
		boolean isSorted = false;
		int lastUnsorted = array.length-1;
		while(!isSorted)
		{
			isSorted = true;
			for(int i = 0; i < lastUnsorted; i++)
			{
				if(array[i] > array[i+1])
				{
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1]= temp;
					isSorted = false;
				}
			}
			lastUnsorted--;
		}
	}
	public static void insertionSort(int [] array)
	{
		for(int i = 1; i < array.length; i++)
		{
			int temp = array[i];//current
			int j = i-1;//Previous
			while((j >= 0) && array[j] > temp)
			{
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = temp;
		}
	}
	public static void selectionSort(int [] array)
	{
		for(int i = 0; i < array.length -1;i++)
		{
			int min = i;
			for(int j = i+1; j < array.length; j++)
			{
				if(array[j] < array[min]) //Checking if array[i+1} < the minimum value
				{
					min = j;
				}
			}
			//Swapping formula:
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
	}
}
