package ru.com.klinika;

import java.util.ArrayList;
import java.util.List;



public class Klient  {
	
	private String imya;
	private String pasport;
	private  List<Jivotnie>pitomez= new ArrayList<Jivotnie>();

	public Klient() {
		super();
		this.imya = "";
		this.pasport ="";
		this.pitomez = null;
	}

	public Klient(String imya, String pasport, List<Jivotnie> kolich) {
		super();
		this.imya = imya;
		this.pasport = pasport;
		this.pitomez = kolich;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((imya == null) ? 0 : imya.hashCode());
		result = prime * result + ((pasport == null) ? 0 : pasport.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Klient other = (Klient) obj;
		if (imya == null) {
			if (other.imya != null)
				return false;
		} else if (!imya.equals(other.imya))
			return false;
		if (pasport == null) {
			if (other.pasport != null)
				return false;
		} else if (!pasport.equals(other.pasport))
			return false;
		return true;
	}

	

	public String getKlacc() {
				
		return "Klient";
	}

	public String getImya() {
		return imya;
	}

	public void setImya(String imya) {
		this.imya = imya;
	}

	public String getPasport() {
		return pasport;
	}

	public void setPasport(String pasport) {
		this.pasport = pasport;
	}

	public List<Jivotnie> getPitomez() {
		return pitomez;
	}

	public void setPitomez(List<Jivotnie> pitomez) {
		this.pitomez = pitomez;
	}
	

	@Override
	public String toString() {
		return "Imya=" + imya + ", pasport=" + pasport + ", pitomez(i)-" + pitomez +"\n";
	}
	
	

}
