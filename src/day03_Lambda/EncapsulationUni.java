package day03_Lambda;

public class EncapsulationUni {
	
	private String fakulte;
	private String bolum;
	private int notOrtalama;
	private int ogrenciNo;
	
	
	public EncapsulationUni(String fakulte, String bolum, int notOrtalama, int ogrenciNo) {
		 
		this.fakulte = fakulte;
		this.bolum = bolum;
		this.notOrtalama = notOrtalama;
		this.ogrenciNo = ogrenciNo;
		
		
	}


	public String getFakulte() {
		return fakulte;
	}
	 
	public String getBolum() {
		return bolum;
	}

	

	public int getNotOrtalama() {
		return notOrtalama;
	}


	 
	public int getOgrenciNo() {
		return ogrenciNo;
	}


	 
	@Override
	public String toString() {
		return "Encapsulation [fakulte=" + fakulte + ", bolum=" + bolum + ", notOrtalama=" + notOrtalama
				+ ", ogrenciNo=" + ogrenciNo + "]";
	}
	
	

}
