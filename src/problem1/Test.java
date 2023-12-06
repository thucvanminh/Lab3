package problem1;

public class Test {

    public static void main(String[] args) {
        Person dong = new Driver("Thuc", "Binh Duong", "Vietnam", true, 2002, "Daihoc", "Married", "10003");
//        dong.showJob();
        dong.showInformation();
       
    }
    public static void print(Person p){
        p.showInformation();
    }
}
