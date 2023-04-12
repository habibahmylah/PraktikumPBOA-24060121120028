/**
* Nama File	: StokException.java 
* Tanggal	: 12 April 2023
* Penulis	: Habibah Mylah Dalilah
* NIM		: 24060121120028
* Deskripsi	: Kelas StokException merupakan kelas turunan dari kelas Exception

**/

public class StokException extends Exception {
    public StokException(Barang barang){
        // TODO 5
		super("Stok barang "+ barang.getNamaBarang() + "(" + barang.getIdBarang() + ")" + "Tidak Cukup!");
    }
}

