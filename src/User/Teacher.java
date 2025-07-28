package User;

import Pack.UserRole;

public class Teacher extends Candidate{
    public Teacher(String name) {
        super(name, UserRole.Teacher);
    }
}
