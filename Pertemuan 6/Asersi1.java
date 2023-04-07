/**
* Nama File	: Asersi1.java 
* Tanggal	: 01 April 2023
* Penulis	: Habibah Mylah Dalilah
* NIM		: 24060121120028
* Deskripsi	: Program untuk menunjukkan asersi

**/

public class Asersi1{
	public static void main(String[] args){
		int x=0;
		if(x>0){
			System.out.println("x bilangan positif");
		} else{
			assert(x<0) : "ada kesalahan kode";
			System.out.println("x bilangan negatif");
		}
	}
}