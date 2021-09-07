package day02_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import day01_Lambda.MethodLambda;

public class Lambda04 {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>(Arrays.asList("Ali", "Ali", "Aysima", "Abdurrahman", "Mehmet", "Mustafa",
				"Bedirhan", "Yüksel", "Süleyman"));
		yazdirBuyuk1(l);
		System.out.println();
		uzunlukSirala(l);
		farkliSonHarfSirala(l);
		uznlukSiralaILkeleman(l);
		AileBaslayan(l);
		AbaslaVeyaIbit(l);
		siralaBuyut(l);
		isimSiraVeNo(l);
		System.out.println();
		karesiniAlSirala(l);
		System.out.println();
		ucluSoru(l);
		SondanIkinciSiralaIlk(l);
		terstenSiralaIlkYazdir(l);

	}
  



	




	









	// List in eleamnlarini büyük harfle yazdir

	private static void yazdirBuyuk1(List<String> l) {
		l.stream().map(t -> t.toUpperCase()).forEach(MethodLambda::bosluklaYazdir);
		System.out.println();
		l.stream().map(String::toUpperCase).forEach(MethodLambda::bosluklaYazdir);
	}

	// 2-Elemanlari uznluklarina göre sirala
	private static void uzunlukSirala(List<String> l) {
		l.stream().sorted(Comparator.comparing(String::length)).forEach(MethodLambda::bosluklaYazdir);
		// Ali Ali Aysima Mehmet Yüksel Mustafa Bedirhan Süleyman Abdurrahman
		System.out.println();
		l.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(MethodLambda::bosluklaYazdir);
		// Abdurrahman Bedirhan Süleyman Mustafa Aysima Mehmet Yüksel Ali Ali
		System.out.println();

	}

	// 3-Farkli elemanlari son harflerine göre siralayip yazdirin
	private static void farkliSonHarfSirala(List<String> l) {
		l.stream().distinct().sorted(Comparator.comparing(t -> t.substring(t.length() - 1)))
				.forEach(MethodLambda::bosluklaYazdir);
	}
	//4) Elemanları uzunluklarına ve ardından (aynı uzunlukta olanları) ilk karakterlerine göre sıralamak için bir yöntem oluşturun
	private static void uznlukSiralaILkeleman(List<String> l) {
		System.out.println();
		 l.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.substring(0,1))).forEach(MethodLambda::bosluklaYazdir);
		 System.out.println();
		 l.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.substring(0,1)).thenComparing(t->t.substring(1,2))).forEach(MethodLambda::bosluklaYazdir);	
		 
	}
	//5-Büyük harflerle, "A" ile başlayan liste öğelerini yazdırmak için bir yöntem oluşturun 
	private static void AileBaslayan(List<String> l) {
		System.out.println();
		 l.stream().filter(t->t.startsWith("A")).map(String::toUpperCase).forEach(MethodLambda::bosluklaYazdir);
		
	}
	//6)  Küçük harflerle, "A" ile başlayan veya "i" ile biten liste öğelerini yazdırmak için bir yöntem oluşturun
	private static void AbaslaVeyaIbit(List<String> l) {
		System.out.println();
		l.stream().filter(t->t.startsWith("A") || t.endsWith("i")).map(String::toLowerCase) .forEach(MethodLambda::bosluklaYazdir);
		
	}
	//7) Öğeleri uzunluklarına göre sıraladıktan sonra büyük harflerle yazdırmak için bir yöntem oluşturun
	private static void siralaBuyut(List<String> l) {
		System.out.println();
		 l.stream().map(String::toUpperCase).sorted(Comparator.comparing(String::length)).forEach(MethodLambda::bosluklaYazdir);		
	}
	//8) Elemanları uzunluklarına göre sıralayın önce elemanı sonra uzunluğunu yazdırın
	private static void isimSiraVeNo(List<String> l) {
		System.out.println();
		l.stream().sorted(Comparator.comparing(String::length)).map(t->t+":"+t.length()).forEach(MethodLambda::bosluklaYazdir);		 
		
	}
	//9) Her elemanın uzunluğunun karesini alıp tekrarlıları sil, bunların 20'den büyük olanlarını ters sırada  yazdırın
	private static void karesiniAlSirala(List<String> l) {
		l.stream().distinct().map(t->t.length()*t.length()).filter(t-> t>20).sorted(Comparator.reverseOrder()).forEach(MethodLambda::bosluklaYazdir);
		l.stream().map(t->t.length()*t.length()).distinct().filter(t-> t>20).sorted(Comparator.reverseOrder()).forEach(MethodLambda::bosluklaYazdir);
		l.stream().map(t-> t.length()*t.length()).distinct().filter(t-> t>20).sorted(Comparator.reverseOrder()).forEach(MethodLambda::bosluklaYazdir);
				
	}
	//10) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol etmek için bir metod oluşturun
	//bütün elemanların "x" ile başlamadığını kontrol etmek için bir yöntem oluşturun
	//en az 1 tane "R" ile biten eleman olup olmadığını kontrol etmek için bir metod oluşturun.
	private static void ucluSoru(List<String> l) {
		boolean result= l.stream().allMatch(t->t.length()<12);
	    System.out.println("Elemanlarin uzunliklari 12 den kücük mü? "+result);
		System.out.println();
		
		boolean result1= l.stream().noneMatch(t->t.startsWith("X"));
		System.out.println("X ile baslayan öge yok? "+result1);
		System.out.println();
		
		boolean result2= l.stream().anyMatch(t->t.endsWith("R"));
		System.out.println("Elemanlardan herhangi biri R ile bitiyor mu? "+result2);
		System.out.println();
		
	}
	//11-elemanları sondan 2. elemanlarına göre sıralayıp ilk elemanı yazdır
	private static void SondanIkinciSiralaIlk(List<String> l) {
		System.out.println(l.stream().sorted(Comparator.comparing(t -> t.charAt(t.length()-2))).findFirst());		 
		
	}
	//12)elemanlari uzunluklarina gore tersten siralayip ilk elemani yazdir
	private static void terstenSiralaIlkYazdir(List<String> l) {
			
		System.out.println(l.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst());
		System.out.println();
        
	//13- Eleman 'A', 'a' ile başlıyor veya 'N', 'n' ile bitiyorsa o elemanı silin
        l.removeIf(t->t.toUpperCase().startsWith("A")||t.toUpperCase().endsWith("N"));
        System.out.println(l);
	
	}
	
}
