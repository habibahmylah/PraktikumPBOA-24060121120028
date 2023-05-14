/**
* Nama File	: PegawaidanGaji.java 
* Tanggal	: 14 Mei 2023
* Penulis	: Habibah Mylah Dalilah
* NIM		: 24060121120028

**/

public class PegawaidanGaji {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Andi");
        Pegawai pegawai2 = new Manajer("Reno");
        Pegawai pegawai3 = new Manajer("Arya");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);



    }
}