/**
	* Lingkaran.java 25/3/2023
	* Penulis : Habibah Mylah Dalilah
	* Deskripsi : kelas implementasi IArea berupa cara untuk menghitung luas lingkaran					
*
*
*/

//mengambil konstanta yang ada di kelas java.lang.Math
import static java.lang.Math.PI;

class Lingkaran implements IArea{
	private double jejari;
	
	public Lingkaran(double r){
		jejari = r;
	}
	
	public double hitungLuas(){
		return PI*jejari*jejari;
	}
}