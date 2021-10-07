/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wildcard; 

import java.util.ArrayList;
import java.util.Arrays;

class Wildcardku{
    public void printData(ArrayList<?> data, int index){
        System.out.println(data.get(index));
    }
}

public class DemoWilcard {
    public static void main(String[] args) {
        ArrayList<String> daftarNama = new ArrayList<>(Arrays.asList("Obet", "Wati"));
        Wildcardku w1 = new Wildcardku();
        w1.printData(daftarNama, 0);
        
    }
}
