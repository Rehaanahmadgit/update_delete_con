package btech;

public class student {
    private  int studentid;
    private String name;
    private String phone;
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public student(int studentid, String name , String phone, String city) {
        super();
        this.studentid=studentid;
        this.city=city;
        this.name=name;
        this.phone=phone;
    }

    public student(String name,String phone,String city) {
        this.name = name;
        this.phone=phone;
        this.city=city;
    }

    public student() {
    }

    @Override
    public String toString() {
        return "student{" +
                "studentid=" + studentid +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
