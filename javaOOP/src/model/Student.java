package model;

public class Student {
    private String name;
    private Gender gender;
    private Integer id;

    public Student(String name, Gender gender, Integer id){
        this.name = name;
        this.gender = gender;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
