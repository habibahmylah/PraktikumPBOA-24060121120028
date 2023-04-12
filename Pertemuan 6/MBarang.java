/**
* Nama File	: MBarang.java 
* Tanggal	: 12 April 2023
* Penulis	: Habibah Mylah Dalilah
* NIM		: 24060121120028
* Deskripsi	: Kelas MBarang merupakan kelas yang berisi penyelesaian akhir

**/

public class MBarang {
    public static void beliBarang(Barang barang, int jumlah) throws StokException {
        if (jumlah > barang.getStok()) {
            // TODO 6
			throw new StokException(barang);
        } else {
            // TODO 7
			barang.kurangiStok(jumlah);
		}
            // TODO 8
			System.out.println("Anda berhasil membeli " +jumlah+ " "+barang.getNamaBarang()+".");
        
    }
    
    public static void main(String[] args) {
        // TODO 9 
		Barang barang1 = new Barang("B001", "Celana", 10);
		Barang barang2 = new Barang("B002", "Rok", 14);
		
        try {
            // TODO 10
			beliBarang(barang1, 9);
			beliBarang(barang2, 10);
			beliBarang(barang2, 15);
        } catch (StokException se) {
            // TODO 11
			System.out.println(se.getMessage());
			System.out.println("Mohon maaf, stock barang tidak mencukupi.");
        }
    }
}
