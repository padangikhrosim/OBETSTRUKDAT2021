
package Generic;
class Generic{
    public<T> void print(T data, T data2){
        System.out.println("isi data :  "+data+" "+data2);
    }
    
}
public class DemoGenericMethod {
    public static void main(String[] args) {
        Generic g1 = new Generic();
        g1.print(90, 80);
        g1.print("Obet", 100);
    }
}
