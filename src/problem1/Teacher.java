
package problem1;


public class Teacher extends Person {
    private String major;
    public Teacher(String name, String address, String nationality, boolean gender, int yOB, String qualification, String matialStatus,String major) {
        super(name, address, nationality, gender, yOB, qualification, matialStatus);
        this.major=major;
    }

    @Override
    public void showJob() {
        System.out.println(name+" is a teacher of "+major);
    }
    
    
}
