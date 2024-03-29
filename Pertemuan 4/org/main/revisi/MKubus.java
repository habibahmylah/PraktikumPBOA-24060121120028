/**
* Nama File : MKubus  15/03/2023
* Nama Penulis : Habibah Mylah Dalilah
* NIM : 24060121120028
* Deskripsi : Main Kubus
*
*/

package org.main;

import org.bangunruang.Kubus;
import org.bangundatar.BujurSangkar;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar bujursangkar = new BujurSangkar(4);
		//System.out.println("Luas Permukaan Kubus dengan panjang sisi 4 satuan : "+ kubus.hitungLuasAlas());
		
		Kubus kubus = new Kubus(bujursangkar);
		System.out.println("Volume Kubus dengan panjang sisi 4 satuan : "+ kubus.hitungVolume());
		System.out.println("Luas Permukaan Kubus dengan panjang sisi 4 satuan : "+ kubus.hitungLuasAlas());
	}
}