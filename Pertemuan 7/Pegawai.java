/**
* Nama File	: Pegawai.java 
* Tanggal	: 14 Mei 2023
* Penulis	: Habibah Mylah Dalilah
* NIM		: 24060121120028

**/

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : "+ nama + ", gaji pokok : "+ gajiPokok);
    }
}