package pacakge1;

import java.util.Arrays;
import java.util.OptionalInt;

public class Test3 {

	
	public static void main(String[] args) {
		
		
		int[] arr = { 2,7,1,9,4,2,2,6,5,6,1};
		
		OptionalInt op = Arrays.stream(arr).reduce(Integer::sum);
	if(op.isPresent())
	{ 
	System.out.println(op.getAsInt());
	}
	}
}
