/**
* Nama File	: ExceptionOnArray.java 
* Tanggal	: 01 April 2023
* Penulis	: Habibah Mylah Dalilah
* NIM		: 24060121120028
* Deskripsi	: Program pengguna eksepsi menggunakan class library Java

**/

public class ExceptionOnArray{
	public static void main(String[] args){
		//instansiasi object array integer
		Integer[] arrayInteger = new Integer[4];
		try{
			arrayInteger[2] = 11;
			arrayInteger[4] = 10;
		} catch(ArrayIndexOutOfBoundsException exception){
			exception.printStackTrace();
		} finally{
			System.out.println("clean up code...");
		}
	}
}