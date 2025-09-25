public class Student {
    int id;
    String name;
    String major;
    long phone;

    //setter
    void setId (String id){
        this.id = Integer.parseInt(id);
    }
    void setName(String name){
        this.name = name;
    }
    void setMajor(String major){
        this.major = major;
    }
    void setPhone(String phone){
        this.phone =Long.parseLong(phone);
    }

    //getter
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getMajor(){
        return major;
    }
    long getPhone(){
        return phone;
    }

}
