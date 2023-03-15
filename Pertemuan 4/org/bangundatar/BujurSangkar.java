/**
* Nama File : BujurSangkar.java  15/03/2023
* Nama Penulis : Habibah Mylah Dalilah
* NIM : 24060121120028
* Deskripsi : Bujur Sangkar
*
*/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double sisi;
	
	public BujurSangkar(double sisi){
		this.sisi = sisi;
		this.jumlahSisi = 4;
	}
	
	public double hitungLuas(){
		return sisi * sisi;
	}
	
	public double getSisi(){
		return this.sisi;
	}
}