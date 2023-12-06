
package problem1;


public class Driver extends Person {
    private String liscenceID;
    public Driver(String name, String address, String nationality, boolean gender, int yOB, String qualification, String matialStatus,String liscenceID) {
        super(name, address, nationality, gender, yOB, qualification, matialStatus);
        this.liscenceID=liscenceID;
    }

    @Override
    public void showJob() {
        System.out.println(name + " is a driver and have "+liscenceID+" ID");
    }
    
    
}
