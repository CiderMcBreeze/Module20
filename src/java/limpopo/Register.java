
package limpopo;
/*
 * @author Lee Cider McBreeze
 */
public class Register {
    
    private int studentID;
    private String name;
    private String surname;
    private String address;
    private String cellnumber;
    private String email;
    private String gender;
    private String circuit;
    private int age;
    
    Register (String name,String surname,String address,String cellnumber,String email,String gender,String circuit,int age){
        this.name=name;
        this.surname=surname;
        this.address=address;
        this.cellnumber=cellnumber;
        this.email=email;
        this.gender=gender;
        this.circuit=circuit;
        this.age=age;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellnumber() {
        return cellnumber;
    }

    public void setCellnumber(String cellnumber) {
        this.cellnumber = cellnumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCircuit() {
        return circuit;
    }

    public void setCircuit(String circuit) {
        this.circuit = circuit;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
