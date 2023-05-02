package rensyu06;

import lib.Input;

public class Rensyu06_01 {

	public static void main(String[] args) {
		System.out.println("start");
		int m,n;
		
		for(int i=0;i<3;i++) {		//for文で3回繰り返す　初期数0,終了条件3がiより大きくなくなったら,繰り返し処理i++
			m=Input.getInt();
			n=Input.getInt();
			int l=n%m;		
			System.out.println(l);
		}
		System.out.println("end");

	}

}
