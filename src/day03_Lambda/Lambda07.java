package day03_Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Lambda07 {

	public static void main(String[] args) {
		//functional programming kullanarak bir dosya nasıl okunur
		
		try {
			Files.lines(Paths.get("C:\\Users\\Bsr\\eclipse-workspace\\Lambda\\src\\day03_Lambda\\LambdaFile")).forEach(t->System.out.println(t));
		} catch (IOException e) {			 
			 
		}
		System.out.println();
		//Tüm karakterleri büyük harfe dönüstürüp yazdiriniz
		
		try {
			Files.lines(Paths.get("C:\\Users\\Bsr\\eclipse-workspace\\Lambda\\src\\day03_Lambda\\LambdaFile")).
			map(String::toUpperCase).forEach(System.out::print);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		//Metindeki farkli kelimeleri yazdiriniz
		try {
			Files.lines(Paths.get("C:\\Users\\Bsr\\eclipse-workspace\\Lambda\\src\\day03_Lambda\\LambdaFile")).map(t->t.split(" ")).
			flatMap(Arrays::stream).map(t->t.replaceAll ("\\W","")).distinct().forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// metinde "e" içeren tüm kelimeleri yazdırın. (sayısınıda yazdırabilirsin)
		try {
			Files.lines(Paths.get("C:\\Users\\Bsr\\eclipse-workspace\\Lambda\\src\\day03_Lambda\\LambdaFile")).
			map(t->t.split(" ")).flatMap(Arrays::stream).filter(t -> t.contains("e")).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

