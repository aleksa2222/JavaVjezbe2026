
public class TelevizorNovi {
	
	private int brojKanala;
	private String nazivKanala;
	private int jacinaZvuka;
	
	public TelevizorNovi(int brojKanala, String nazivKanala, int jacinaZvuka) {
		this.brojKanala = brojKanala;
		this.nazivKanala = nazivKanala;
		this.jacinaZvuka = jacinaZvuka;
	}
	
	public int getBrojKanala() {
		return brojKanala;
	}
	
	public String getNazivKanala() {
		return nazivKanala;
	}
	
	public int getJacinaZvuka() {
		return jacinaZvuka;
	}
	
	public void setBrojKanala(int brojKanala) {
		if( brojKanala >= 1 ) {
			this.brojKanala = brojKanala;
		}else {
			System.out.println("Greska, broj kanala mora biti veci od 0");
		}
		
	}
	
	public void setNazivKanala(String nazivKanala) {
		this.nazivKanala = nazivKanala;
	}
	
	public void setJacinaZvuka( int jacinaZvuka) {
		if( jacinaZvuka >= 0 && jacinaZvuka <= 10) {
			this.jacinaZvuka = jacinaZvuka;
		}else {
			System.out.println("Greska, jacina zvuka mora biti izmedju 0 i 10");
		}
		
	}
	
	public  void pojacajTon(){
		if(this.jacinaZvuka < 10){
			this.jacinaZvuka++;
		}else {
			System.out.println("Greska, jacina zvuka je vec maksimalna");
		}
		
	}
	
	public void stampa() {
		System.out.println("Broj kanala: " + this.brojKanala);
		System.out.println("Naziv kanala: " + this.nazivKanala);
		System.out.println("Jacina zvuka: " + this.jacinaZvuka);
	}
	
	

	public static void main(String[] args) {
		
		TelevizorNovi Televizor1 = new TelevizorNovi(5, "HBO", 10);
		
		//System.out.println(Televizor1.getBrojKanala());
		//Televizor1.setBrojKanala(0);
		//System.out.println(Televizor1.getBrojKanala());
		//Televizor1.pojacajTon();
		//System.out.println(Televizor1.getJacinaZvuka());
		
		Televizor1.stampa();
		
		}

}
