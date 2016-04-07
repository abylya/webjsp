package ru.com.klinika;

public  class Jivotnie implements Priroga {
	
	private String klichka;
	private String vid;
	private boolean zdorovie;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((klichka == null) ? 0 : klichka.hashCode());
		result = prime * result + ((vid == null) ? 0 : vid.hashCode());
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
		Jivotnie other = (Jivotnie) obj;
		if (klichka == null) {
			if (other.klichka != null)
				return false;
		} else if (!klichka.equals(other.klichka))
			return false;
		if (vid == null) {
			if (other.vid != null)
				return false;
		} else if (!vid.equals(other.vid))
			return false;
		return true;
	}


	public Jivotnie(String vid,String klichka, boolean zdorovie) {
		
		this.klichka = klichka;
		this.vid = vid;
		this.zdorovie = zdorovie;
	}


	public Jivotnie() {
		this.klichka = "";
		this.vid = "";
		this.zdorovie =false;
	}


	@Override
	public String toString() {
		return '|'+"Vid=" + vid + ",klichka=" + klichka + ", zdorovie=" + zdorovie+'|';
	}


	public String getKlacc() {
		return "Pitomez "+getVid();
	}


	public String getKlichka() {
		return klichka;
	}


	public void setKlichka(String klichka) {
		this.klichka = klichka;
	}


	public String getVid() {
		return vid;
	}


	public void setVid(String vid) {
		this.vid = vid;
	}


	public boolean isZdorovie() {
		return zdorovie;
	}


	public void setZdorovie(boolean zdorovie) {
		this.zdorovie = zdorovie;
	}
	
	

}
