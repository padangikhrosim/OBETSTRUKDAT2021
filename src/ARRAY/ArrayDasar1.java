
package ARRAY;

import java.util.Arrays;

public class ArrayDasar1 {
    public static void main(String[] args) {
        //deklarasi dan inisialisasi data array dalam 1 baris
        int[] daftarNilai = {70, 90, 100, 90, 85};
        
        //update data array pada index 2
        daftarNilai[2] = 65;
        
        //menampilkan data array index ke-2
        System.out.println("data pada index ke-2 : "+daftarNilai[2]);
        
        //menampilkan seluruh data array
        //cara 1 looping
        for(int i=0;i<daftarNilai.length;i++){
            System.out.print(daftarNilai[i]+" ");
        }
        //cara 2 bantuan arrays
        System.out.println("\n"+Arrays.toString(daftarNilai));
        
        //cara 3 looping
        for(int nilai : daftarNilai){
            System.out.print(nilai+" ");
        }
        
    }
}
