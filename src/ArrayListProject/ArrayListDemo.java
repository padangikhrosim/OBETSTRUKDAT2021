package ArrayListProject;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList daftarData = new ArrayList();
        daftarData.add(90);
        daftarData.add("Obet");
        daftarData.add("Dewi");
        //daftarData.clear();
        daftarData.remove(1);
        System.out.println(daftarData.get(1));
    }
}
