/* Kasus : Ruang Kelas yang berisi 5 kursi, 
tambahkan method :
- showAllMhs() : menampilkan seluruh data array
- getMhs(int index) : mengembalikan nama mahasiswa pada index tertentu
- insertMhs(String mhs) : menambah mahasiswa ke kursi kosong paling depan
- deleteMhs : menghapus mahasiswa pada kursi paling belakang yang berisi
- updateMhs(int indek, String mhs) : mengganti nama mahasiswa pada index tertentu
- formatKelas : menghapus semua nama mahasiswa
*/
package ARRAY;

import java.util.Arrays;

class Kelas{
    String[] daftarNama;//kursi 
    int jumlahMhs = 0;//untuk menyimpan jumlah mahasiswa yang telah masuk kelas
    public Kelas() {
        daftarNama = new String[5];//tiap pembuatan objek maka terbentuk array dengan panjang 5 kursi
    }
    public void showAllMhs(){
        System.out.println(Arrays.toString(daftarNama));//menampilkan semua nama mahasiswa di kelas
    }
    public void insertMhs(String namaMhs){
        if(jumlahMhs<5){//artinya jika masih ada kursi kosong
            daftarNama[jumlahMhs] = namaMhs;//proses menambah nama mahasiswa ke kelas(array)
            jumlahMhs++;//jumlah mahasiswa bertambah dalam kelas
        }
    }
    public void formatKelas(){
        for(int i=0;i<5;i++){
            daftarNama[i] = null;//ubah data menjadi null
        }
    }
    public String getMhs(int index){
        return daftarNama[index];
    }
    public void deletMhs(){
        if(jumlahMhs>0){//artinya jika ada mahasiswa di kelas
            jumlahMhs--;//jumlah mahasiswa berkurang 1
            daftarNama[jumlahMhs] = null;//ubah null
        }
    }
    public void updateMhs(int index, String namaMhs){
        if(daftarNama[index] != null){//artinya jika kursi tidak kosong
            daftarNama[index] = namaMhs;//maka ubah nama mahasiswa
        }
    }
}

public class KelasArray {
    public static void main(String[] args) {
        Kelas k1 = new Kelas();
        k1.insertMhs("Budi");
        /*k1.insertMhs("Iwan");
        k1.insertMhs("Wati");
        k1.insertMhs("Wawan");
        k1.insertMhs("Ika");*/
        
        k1.updateMhs(3, "Dewi");
        //k1.formatKelas();
        //System.out.println(k1.getMhs(2));
        //k1.deletMhs();
        //k1.deletMhs();
        k1.showAllMhs();
    }
}
