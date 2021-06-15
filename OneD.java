public class OneD{
    public static void main(String []args) {
	int[] items= new int[10];
	for(int i=1; i<11;i++){
		items[i-1]=5*i;
	}
	for(int a : items){
		System.out.println(a);
	}
    }
}