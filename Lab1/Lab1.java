import java.util.Random;

public class Lab1{
	public static void main(String[] args){
		long[] b = new long[11];
		for(int k = 10; k >= 0; k--){
			b[10-k] = 2*k + 3;
		}
		float[] x = new float[13];
		Random r = new Random();
		for(int l = 0; l < 13; l++){
			x[l] = r.nextFloat()*20-9; 
		}
		double[][] a = new double[11][13];
		for(int j = 0; j < 13; j++){
			for(int i = 0; i < 11; i++){
				switch((int)b[i]){
					case 5:{
						a[i][j] = Math.atan(
									Math.exp(
										Math.cbrt(
											-1*Math.sqrt(
												Math.abs(x[j])
											)
										)
									)
						);
						break;
					}
					case 3:
					case 7:
					case 13:
					case 15:
					case 23:{
						a[i][j] = Math.log(
							Math.acos(
								(x[j]+1)/2*Math.E + 1
							)
						)/2;
						break;
					}
					default:{
						a[i][j] = Math.pow(
							Math.tan(
								Math.pow(Math.tan(x[j]/2),3)
							)/
							(0.25 + Math.pow(
									0.5 * (Math.pow(
										Math.sin(x[j])
									, Math.pow(x[j]*(0.5 - x[j]), x[j])
									)-1)
									, Math.sin(Math.pow(2*x[j], 3))
								)
							)
						,2);
					}
				};
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}