package rensyu06;

public class Rensyu06_03 {

	public static void main(String[] args) {
		int[] n1= {12,11,31,51,72};
		int[] n2= {26,14,12,22,12};
		
		
		for(int i=0;i<5;i++) {
			int kei=n1[i]+n2[i];
			System.out.println("n1["+i+"]+n2["+i+"]="+kei);
			//keiにn1[i]とn2[i]の足し算の結果を代入してあとは文を出力する。
		}

	}

}
