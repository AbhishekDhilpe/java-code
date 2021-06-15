import java.lang.Math;
public class TwoD{
    public static void main(String []args) {
	double[][] items = new double[3][3];
	for(int i=0; i<3;i++){ 	
		for(int j=0;j<3;j++){
			items[i][j]=Math.floor(Math.random()*100);
		}
	}
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
			System.out.println(items[i][j]);
		}
	}
    }
}