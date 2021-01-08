package org.hibernateTest2.Entity;


import javax.persistence.*;

@Entity
@Table(name = "details")
public class Detail {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String city;
    @Column(name = "phone_number")
    private int phoneNumber;
    private String email;

    @OneToOne(mappedBy = "detail", cascade = CascadeType.ALL)
    //это ужедвойное связывание(о. Employee видит О.Detail, detail видит employee)
    private Employee employee;


    public Detail() {
    }

    public Detail(String city, int phone_number, String email) {
        this.city = city;
        this.phoneNumber = phone_number;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
