package User;

import Pack.UserRole;

public abstract class Candidate {
    protected String name;
    protected UserRole role;


    public Candidate(String name,UserRole role) {
        this.name = name;
        this.role = role;
    }
    public String getName() {
        return name;
    }
   public UserRole getRole() {
        return role;
   }
    public void setAmount(int amount) {

    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " " + role;
    }

}
