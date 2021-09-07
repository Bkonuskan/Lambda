package day03_Lambda;

import java.util.stream.IntStream;

import day01_Lambda.MethodLambda;

public class Lambda05 {

	public static void main(String[] args) {
		// 1 den 20 ye kadar olan sayilari yazdiriiniz
		IntStream.range(1, 20).forEach(MethodLambda::bosluklaYazdir);
		System.out.println();

		// functional programming kullanarak 3 ile 98 e kadar olan cift sayilarin
		// toplamini bulunuz
		System.out.println(IntStream.rangeClosed(3, 98).filter(t -> t % 2 == 0).sum());

		// 3) functional programming kullanarak 9! i bul (9!=1*2*3...*9)
		System.out.println(IntStream.rangeClosed(1, 9).reduce(1, Math::multiplyExact));

		// 4-ilk 7 cift sayma sayisinin carpimini bulun
		System.out.println(IntStream.rangeClosed(2, 14).filter(t -> t % 2 == 0).reduce(1, Math::multiplyExact));

		// 5 6'dan büyük ilk 150 tek sayma sayısının toplamını bulun ==> 7, 9, 11, 13, 15, 17, 19.....
		System.out.println(IntStream.iterate(7,t->t+2).limit(150).sum());
		//7) İlk 23 tek sayma sayısının toplamını bulun
		System.out.println(IntStream.iterate(1,t->t+2).limit(23).sum());
		//8)  11 den 33 e kadar  her tam sayının rakamlarının toplamını hesaplamak için bir metod oluşturun
        IntStream.rangeClosed(11,33).map(MethodLambda::rakamlarToplami).forEach(MethodLambda::bosluklaYazdir);

	}

}
