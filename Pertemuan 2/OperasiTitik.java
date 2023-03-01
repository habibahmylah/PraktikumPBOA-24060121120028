/**
* Nama File : Titik.java  01/03/2023
* Nama Penulis : Habibah Mylah Dalilah
* NIM : 24060121120028
* Deskripsi : Kelas yang berisi berbagai operasi
*
*/

public class OperasiTitik{
	private void refleksiSumbuX(Titik titik){
		double y;
		y = titik.getOrdinat();
		y *= -1;
		titik.setOrdinat(y);
	}
	
	private void refleksiSumbuY(Titik titik){
		double x;
		x = titik.getAbsis();
		x *= -1;
		titik.setAbsis(x);
	}
	
	public Titik refleksiX(Titik t){
		refleksiSumbuX(t);
		return t;
	}
	
	public Titik refleksiY(Titik t){
		refleksiSumbuY(t);
		return t;
	}
}