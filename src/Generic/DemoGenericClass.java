
package Generic;
class Generic2<T>{
    T data;

    /*public Generic2(T data) {
        this.data = data;
    }*/
    
    public void setData(T data){
        this.data = data;
    }
    public T getData(){
        return data; 
    }
}
public class DemoGenericClass {
    public static void main(String[] args) {
        Generic2<String> g1 = new Generic2();
        g1.setData("Budi");
    }
}
