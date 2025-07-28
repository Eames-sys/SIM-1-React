package Todo;

import java.util.UUID;

public class Staff extends Person{

        private String staffID;
        private String jobTitle;

        public Staff(String name, int age, String id,String staffID) {
            super(name, age, id);
            this.staffID = staffID;
            this.jobTitle = jobTitle;
        }

    public Staff() {

    }

    public String getStaffID() {
            return staffID;
        }

        public String getJobTitle() {
            return jobTitle;
        }

       // @Override
        public String getDetails() {
            return "Staff ID: " + staffID + ", Job Title: " + jobTitle;
        }
    public static void main(String[] args) {
        Staff S = new Staff();
        S.staffID = UUID.randomUUID().toString();
        S.jobTitle = UUID.randomUUID().toString();
        System.out.println(S.getDetails());
    }
}

