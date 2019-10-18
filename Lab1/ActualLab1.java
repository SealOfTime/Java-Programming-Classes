import java.util.Random;

public class ActualLab1{
		//public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
		public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
		public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
		public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
		public static final String ANSI_RESET = "\u001B[0m";
		public static void main(String[] args){
			//Заполняю массив a чётными числами от 2 до 16
			short[] a = new short[8];
			for(char k = 0; k <= 7; k++){
				a[k] = (short)(2*k + 2);
			}
			//Заполняю массив случайными числами с плавающей точкой от -13 до 11 включительно
			float[] x = new float[20];
			Random r = new Random();
			for(char i = 0; i < 20; i++){
				x[i] = r.nextFloat()*24 - 13;
			}
			
			//Заполняю двумерный массив argh согласно формуле, в то же время вывожу его элементы в форматированном виде
			double[][] argh = new double[8][20];
			for(int j = 0; j < 20; j++){
				for(int i = 0; i < 8; i++){
					switch(a[i]){
						case 2:
						case 8:
						case 10:
						case 14:{
							argh[i][j] = Math.pow(
								Math.PI/
								Math.sin(
									Math.pow(
										x[j]/2
									,2)
								)
							,
								Math.sin(
									Math.atan(
										(x[j]-1)/24
									)
								)
							);
							break;
						}
						case 16:{
							argh[i][j] = Math.cbrt(
								Math.pow(
									Math.sin(x[j])/3
								,2)
							);
							break;
						}
						default:{
							argh[i][j] = 4 * Math.pow(
								Math.tan(
									Math.log(
										Math.abs(x[j])
									)
								)/0.5
							,2);
						}
					}
					System.out.printf((j< 8 ? ANSI_WHITE_BACKGROUND : (j < 14 ? ANSI_BLUE_BACKGROUND : ANSI_RED_BACKGROUND)) + "%-15.5f ",argh[i][j]);
				}
				System.out.println();
			}
			System.out.print(ANSI_RESET);
		}
}