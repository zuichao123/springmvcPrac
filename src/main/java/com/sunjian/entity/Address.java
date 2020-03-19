package com.sunjian.entity;

/**
 * @author sunjian
 * @date 2020/3/17 14:26
 */
public class Address {
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

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
}
