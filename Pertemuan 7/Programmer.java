/**
* Nama File	: Programmer.java 
* Tanggal	: 14 Mei 2023
* Penulis	: Habibah Mylah Dalilah
* NIM		: 24060121120028

**/

public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(String nama){
        super.setNama(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus :" + bonus);
    }
}
