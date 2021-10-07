/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generic;

import java.util.ArrayList;

class ArrayListku<T>{
    //T data = new T[3];
    ArrayList<T> data;
    public ArrayListku() {
        data = new ArrayList<>();
    }
    public void addKu(T dataBaru){
        data.add(dataBaru);
    }
    public void printKu(int index){
        System.out.println(data.get(index));
    }
    
}
public class GenericKasus {
    public static void main(String[] args) {
        ArrayListku<String> dataku = new ArrayListku();
        dataku.addKu("Obet");
        //dataku.addKu(90);
        
        dataku.printKu(0);
    }
}
