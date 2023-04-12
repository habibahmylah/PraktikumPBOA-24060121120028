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