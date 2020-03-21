package com.sunjian.entity;

import java.util.List;
import java.util.Map;

/**
 * @author sunjian
 * @date 2020/3/21 21:00
 */
public class Person {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
    private Address address;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public List<String> getHobby2() {
        return hobby2;
    }

    public void setHobby2(List<String> hobby2) {
        this.hobby2 = hobby2;
    }

    public String[] getHobbys() {
        return hobbys;
    }

    public void setHobbys(String[] hobbys) {
        this.hobbys = hobbys;
    }

    public String[] getSelectHobbys() {
        return selectHobbys;
    }

    public void setSelectHobbys(String[] selectHobbys) {
        this.selectHobbys = selectHobbys;
    }

    public List<String> getHobbys2() {
        return hobbys2;
    }

    public void setHobbys2(List<String> hobbys2) {
        this.hobbys2 = hobbys2;
    }

    public List<String> getSelectHobbys2() {
        return selectHobbys2;
    }

    public void setSelectHobbys2(List<String> selectHobbys2) {
        this.selectHobbys2 = selectHobbys2;
    }

    public Integer getRadioId() {
        return radioId;
    }

    public void setRadioId(Integer radioId) {
        this.radioId = radioId;
    }

    public Map<Integer, String> getGradeMap() {
        return gradeMap;
    }

    public void setGradeMap(Map<Integer, String> gradeMap) {
        this.gradeMap = gradeMap;
    }

    public Integer getSelectGrade() {
        return selectGrade;
    }

    public void setSelectGrade(Integer selectGrade) {
        this.selectGrade = selectGrade;
    }

    public Map<Integer, String> getCityMap() {
        return cityMap;
    }

    public void setCityMap(Map<Integer, String> cityMap) {
        this.cityMap = cityMap;
    }

    public Integer getSelectCity() {
        return selectCity;
    }

    public void setSelectCity(Integer selectCity) {
        this.selectCity = selectCity;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    private boolean flag;
    private String[] hobby;
    private List<String> hobby2;
    private String[] hobbys;
    private String[] selectHobbys;
    private List<String> hobbys2;
    private List<String> selectHobbys2;
    private Integer radioId;
    private Map<Integer,String> gradeMap;
    private Integer selectGrade;
    private Map<Integer,String> cityMap;
    private Integer selectCity;
    private String introduce;
}
