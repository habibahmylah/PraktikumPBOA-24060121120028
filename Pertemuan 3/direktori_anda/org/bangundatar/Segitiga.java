/**
* Nama File : Titik.java  08/03/2023
* Nama Penulis : Habibah Mylah Dalilah
* NIM : 24060121120028
* Deskripsi : Bangun Datar
*
*/

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
	private double alas, tinggi;
	
	public Segitiga(double alas, double tinggi, int jumlahSisi){
		this.alas = alas;
		this.tinggi = tinggi;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas(){
		return alas * tinggi / 2;
	}
	
	public void printInfo(){
		System.out.println("Bangun Segitiga bersisi "+ this.getJumlahSisi());
	}
}