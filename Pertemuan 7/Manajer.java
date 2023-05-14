/**
* Nama File	: Manajer.java 
* Tanggal	: 14 Mei 2023
* Penulis	: Habibah Mylah Dalilah
* NIM		: 24060121120028

**/

public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer(String nama){
        super.setNama(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : "+ tunjangan);
    }
}