/**
* Nama File	: AngkaSial.java 
* Tanggal	: 01 April 2023
* Penulis	: Habibah Mylah Dalilah
* NIM		: 24060121120028
* Deskripsi	: Program menggunakan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'

**/

public class AngkaSial{
	
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka==13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(12);
			as.cobaAngka(11);
		} catch(AngkaSialException ase){
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati hati masukkan angka !!!");
		}
	}
}