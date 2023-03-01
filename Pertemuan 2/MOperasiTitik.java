/**
* Nama File : Titik.java  01/03/2023
* Nama Penulis : Habibah Mylah Dalilah
* NIM : 24060121120028
* Deskripsi : Kelas yang berisi berbagai operasi
*
*/

public class MOperasiTitik{
	public static void main(String[] args){
		Titik t = new Titik(4,4);
		OperasiTitik o = new OperasiTitik();
		//System.out.println("Titik :("+t.getAbsis()+", "+t.getOrdinat()+")");
		//o.refleksiSumbuX(t); // hasil?
		//System.out.println("Titik :("+t.getAbsis()+", "+t.getOrdinat()+")");
		//o.refleksiSumbuY(t); // hasil?
		//System.out.println("Titik :("+t.getAbsis()+", "+t.getOrdinat()+")");
		
		System.out.println("Titik :("+t.getAbsis()+", "+t.getOrdinat()+")");
		o.refleksiX(t); // hasil?
		System.out.println("Titik :("+t.getAbsis()+", "+t.getOrdinat()+")");
		o.refleksiY(t); // hasil?
		System.out.println("Titik :("+t.getAbsis()+", "+t.getOrdinat()+")");
	}
}