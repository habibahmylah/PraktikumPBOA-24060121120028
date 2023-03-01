/**
* Nama File : Titik.java  01/03/2023
* Nama Penulis : Habibah Mylah Dalilah
* NIM : 24060121120028
* Deskripsi : Kelas yang berisi berbagai operasi
*
*/

class Titik{
	
	private double absis;
	private double ordinat;
	private static int counterTitik;
	
	public Titik(){
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	public Titik(double a, double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	
	public void setAbsis(double a){
		absis = a;
	}
	public void setOrdinat(double o){
		ordinat = o;
	}
	
	public double getAbsis(){
		return absis;
	}
	public double getOrdinat(){
		return ordinat;
	}
	public int getCounterTitik(){
		return counterTitik;
	}
}