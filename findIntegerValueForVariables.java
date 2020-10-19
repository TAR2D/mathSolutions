public class findIntegerValueForVariables {
	//Only valid when looking for 3 missing variables
	public static void main(String[] args){
		int divisor = 31; //change according to your divisor
		int[] values = {5,7,11}; //You can change these value but cant change size of array.
		int maxSol = 5;
		System.out.println("All possible values of a,b,c when " + divisor 
+ "|" + values[0]+"a + " + values[1]+"b +" + values[2]+"c");
		findValues(divisor,values,maxSol);
	}

	public static void findValues(int divisor, int[] values, int maxSolution){
		int maxSolutions = maxSolution;
		int[] result = new int[3];
		int maximumMultiple = 10;
		for(int i =0; i< maximumMultiple; i++)
			for(int j =0; j< maximumMultiple; j++)
				for(int k=0; k< maximumMultiple; k++){
					if((values[0]*i + values[1]*j + values[2]*k) % divisor == 0){
						result[0] = i;
						result[1] = j;
						result[2] = k; 
						if(maxSolutions < 0)
							break;
						maxSolutions--;
                          		 System.out.println("a ="+ i + " b = " + j + " c = "+ k );
  		                 	}	
				}
	
		}
}
