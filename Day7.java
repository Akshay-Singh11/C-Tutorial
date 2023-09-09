class Staff {

    private String staffName;
    private String staffId;

    Staff(String name, String id) {
        staffName = name;
        staffId = id;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public String getStaffId() {
        return staffId;
    }

}

public class Day7 {
    public static void main(String[] args) {

        Staff s1 = new Staff("Akshay", "123456");

        System.out.println(s1.getStaffName());
        System.out.println(s1.getStaffId());

    }
}
