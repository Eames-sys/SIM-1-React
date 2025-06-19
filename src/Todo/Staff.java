package Todo;

public class Staff extends Person{

        private String staffID;
        private String jobTitle;

        public Staff(String name, int age, String id,String staffID, String jobTitle) {
            super(name, age, id);
            this.staffID = staffID;
            this.jobTitle = jobTitle;
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
}

