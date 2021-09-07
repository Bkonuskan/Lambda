package day03_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda06 {

	public static void main(String[] args) {

		EncapsulationUni edebiyatBolum = new EncapsulationUni("Fen Edebiyat", "Edebiyat", 97, 123);
		EncapsulationUni iktisatBolum = new EncapsulationUni("IIBF", "İktisat", 98, 134);
		EncapsulationUni matematikBolum = new EncapsulationUni("FenEdebiyat", "Matematik", 95, 142);
		EncapsulationUni ingilizceBolum = new EncapsulationUni("IngilizDili", "İngilizce", 93, 154);

		List<EncapsulationUni> uniList = new ArrayList<>(
				Arrays.asList(edebiyatBolum, iktisatBolum, matematikBolum, ingilizceBolum));

		// 1)Tüm ortalama puanların (91)'den büyük olup olmadığını kontrol etmek için
		// bir yöntem oluşturun
		System.out.println(uniList.stream().allMatch(t -> t.getNotOrtalama() > 91));

		// 2)Bölüm adlarından en az birinin "Matematik" kelimesini içerip içermediğini
		// kontrol etmek için bir yöntem oluşturun
		System.out.println(uniList.stream().anyMatch(t -> t.getBolum().contains("Matematik")));

		// 3)Ortalama puanı en yüksek olan kursu yazdırmak için bir yöntem oluşturun
		System.out.println(
				uniList.stream().sorted(Comparator.comparing(EncapsulationUni::getNotOrtalama).reversed()).findFirst());

		// 4)Not ortalamasına göre artan sıralama yapıp ilk elemanı atla ve list olarak
		// yazdır
		System.out.println(uniList.stream().sorted(Comparator.comparing(EncapsulationUni::getNotOrtalama)).skip(1)
				.collect(Collectors.toList()));

	}

}
