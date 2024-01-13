package employeeApp;

import java.util.Arrays;

public class Employee {

    private int id;
    private String fullName;

    private  String email;

    private  String password;
    private String[] healthPlans;

    public Employee(int id, String fullName){
        this.id=id;
        this.fullName=fullName;
    }

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id= id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }

    public boolean addHealthplan(int index, String name) {
        if (index < 0 || index >= healthPlans.length) {
            System.out.println("Geçersiz index.");
            return false;
        }
        else if (healthPlans[index] == null) {
            healthPlans[index] = name;
            System.out.println("Health plan eklendi.");
            return true;
        }
        else {
            System.out.println("Bu index dolu. Başka index dene.");
            return false;

        }
    }
}
