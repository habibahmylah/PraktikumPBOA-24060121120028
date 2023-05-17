/**
 * File : MapTest.java
 * Deskripsi : Program yang menggunakan Generic untuk pasangan kunci-nilai
 */
import java.util.*;

public class MapTest {
    public static void main(String[] args){
        //kunci-> integer, nilai-> string
        Map<Integer,String> map = new HashMap<Integer,String>();
        //menempatkan elemen kunci dan nilai
        map.put(1,"satu");
        map.put(2,"dua");
        //mengambil elemen pertama
        System.out.println(map.get(1));
        //mengambil keseluruhan kunci sebagai objek collection Set
        Set<Integer> key = map.keySet();
        System.out.println(key);
        //bagaimana iterasi untuk mengambil keseluruhan
        //nilai dari kunci? tulis pada laporan anda
        //petunjuk : gunakan iterasi seperti program ArrayListTest
    }
}