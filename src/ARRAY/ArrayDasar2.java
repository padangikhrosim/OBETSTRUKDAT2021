package ARRAY;
public class ArrayDasar2 {
    public static void main(String[] args) {
        //deklarasi array dengan panjang 4
        int daftarNilai[] = new int[4];
        
        //tambah data per index
        daftarNilai[0] = 90;
        daftarNilai[1] = 100;
        daftarNilai[2] = 80;
        daftarNilai[3] = 85;
        
        //terjadi exception index out of bound (melebihi batas panjang array)
        //daftarNilai[4] = 90;
        
        //menampilkan data array pada index ke-3
        System.out.println(daftarNilai[3]);
    }
}
