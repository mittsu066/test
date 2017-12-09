package DtoSample;

public class BandInfoDto {
    private String id;
    private String name;
    private String surName;
    private String userName;
    private String passWord;
    private String age;
     
    public BandInfoDto(String id, String name, String surName,String userName, String passWord, String age) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.userName = userName;
        this.passWord = passWord;
        this.age = age;
    }
    public String getEID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surName;
    }
    public String getUsername() {
        return userName;
    }
    @Override
    public String toString() {
        return "BandInfoDto[id=" + id + ", name="
                + name + ", surName=" + surName + ", userName=" + userName + ", passWord=" + passWord + ", age=" + age + "]";
    }
}
