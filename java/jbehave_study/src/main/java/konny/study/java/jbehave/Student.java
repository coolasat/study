package konny.study.java.jbehave;

/**
 * Author: konnyjinx
 * Date:15/7/23.下午2:43
 */
public class Student {
    private String name;
    private Integer age;
    private String hobby;
    private String fatherName;
    private String motherName;
    private String brotherName;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }


    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setBrotherName(String brotherName) {
        this.brotherName = brotherName;
    }

    public String getBrotherName() {
        return brotherName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", brotherName='" + brotherName + '\'' +
                '}';
    }
}
