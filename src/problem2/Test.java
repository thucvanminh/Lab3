
package problem2;


public class Test {
   
    public static void main(String[] args) {
        Account acc1 = new Account(0);
        Menu m1= new Menu(acc1);
        m1.doTask();
    }
}
