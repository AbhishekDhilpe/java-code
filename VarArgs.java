public class VarArgs{
	public static int sum(int... args) {  
  		int sum = 0;  
  		for (int i : args)  
    			sum += i;  
  		return sum;  
	}		
    public static void main(String []args) {

	System.out.println(sum(1,2,3));
	
    }
}