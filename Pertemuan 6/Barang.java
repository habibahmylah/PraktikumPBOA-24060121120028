/**
* Nama File	: StokException.java 
* Tanggal	: 12 April 2023
* Penulis	: Habibah Mylah Dalilah
* NIM		: 24060121120028
* Deskripsi	: Kelas Barang memiliki atribut id, nama, dan stok. Selain itu, di dalamnya terdapat method
			kurangiStok untuk mengurangi stok barang yang telah dimasukkan

**/

public class Barang {
    // TODO 1
	private String idBarang;
	private String namaBarang;
	private int stok;

    public Barang(String idBarang, String namaBarang, int stok){
        // TODO 2
		this.idBarang = idBarang;
		this.namaBarang = namaBarang;
		this.stok = stok;
    }

    // TODO 3 Buat Getter
	public String getIdBarang(){
		return idBarang;
	}
	public String getNamaBarang(){
		return namaBarang;
	}
	public int getStok(){
		return stok;
	}

    public void kurangiStok(int jumlah){
        // TODO 4
		stok = stok - jumlah;
    }
}