
public class Zaposleni {
	
	private String ime;
	private String prezime;
	private int godine_staza;
	private double plata;
	
	public Zaposleni(String ime, String prezime, int godine_staza, double plata) {
		this.ime = ime;
		this.prezime = prezime;
		this.godine_staza = godine_staza;
		this.plata = plata;
	}
	
	public String getIme() {
		return ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public int getGodine_staza() {
		return godine_staza;
	}
	
	public double getPlata() {
		return plata;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public void setGodine_staza(int godine_staza) {
		if(godine_staza >= 0) {
			this.godine_staza = godine_staza;
		}else {
			System.out.println("Greska, godine staza ne mogu biti negativne");
		}
	}
	
	public void setPlata(double plata) {
		if(plata >= 0) {
			this.plata = plata;
		}else {
			System.out.println("Greska, plata ne moze biti negativna");
		}
	}
	
	public void stampa() {
		System.out.println("Ime: " + this.ime);
		System.out.println("Prezime: " + this.prezime);
		System.out.println("Godine staza: " + this.godine_staza);
		System.out.println("Plata: " + this.plata);
	}
	
	public void povecjaPlatu() {
		if(this.plata < 800 && this.godine_staza > 10) {
			this.plata =this.plata + (this.plata * 0.06);
		}else {
			System.out.println("Nema uslova za povecanje plate");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zaposleni zaposleni1 = new Zaposleni("Pera", "Peric", 12, 700);
		Zaposleni zaposleni2 =  new Zaposleni("Mitar", "Miric",8, 900);
		Zaposleni zaposleni3 = new Zaposleni("Mika", "Mikic", 15, 600);
		
		//zaposleni1.stampa();
		
		zaposleni1.povecjaPlatu();
		zaposleni1.stampa();
		zaposleni2.povecjaPlatu();
		zaposleni2.stampa();
		zaposleni3.povecjaPlatu();
		zaposleni3.stampa();
	}

}
