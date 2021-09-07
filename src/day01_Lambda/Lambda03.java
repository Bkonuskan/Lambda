package day01_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {

	public static void main(String[] args) {
				
		List<Integer>l=new ArrayList<>(Arrays.asList(7,12,14,4,9,2,4,12,16));	
		ilkDortEleman(l);
		ilkDortElemanGec(l);
		

	}
	//1)K�c�kten b�y�ge sirala sonra ilk 4 elemani yazdir

	private static void ilkDortEleman(List<Integer> l) {
		l.stream().sorted().limit(4).forEach(MethodLambda::bosluklaYazdir);
		
	}
	//K�c�kten b�y�ge sirala ilk d�rt elemani atli
	private static void ilkDortElemanGec(List<Integer> l) {
	l.stream().sorted().skip(4).forEach(MethodLambda::bosluklaYazdir);
	}
	//K�c�kten b�y�ge sirala ilk d�rt elemani atli
		private static void ucElemanYazdir(List<Integer> l) {
		l.stream().sorted().skip(3).limit(3).forEach(MethodLambda::bosluklaYazdir);
		System.out.println();
		l.stream().sorted().limit(6).skip(3).forEach(MethodLambda::bosluklaYazdir);
		}
	
}
