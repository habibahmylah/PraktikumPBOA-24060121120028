/**
* Nama File	: AngkaSialException.java 
* Tanggal	: 01 April 2023
* Penulis	: Habibah Mylah Dalilah
* NIM		: 24060121120028
* Deskripsi	: Eksepsi buatan sendiri, menolak angka 13!

**/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan masukkan angka 13 karena angka sial !!!");
	}
}