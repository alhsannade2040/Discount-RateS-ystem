package com.example.discountratesystem;

public class Customer {
    private String name ;
    private boolean member; // it means true or false
    private String memberType;

    public Customer() { // no argument constructor
        this.member = false; // if we deleted this ?
    } // according to the question

    public Customer(String name, boolean member, String memberType) {
        this.name = name;
        this.member = member;
        this.memberType = memberType;
    }

    public String getName() { // he says its Null
        return name;
    }

    public boolean getMember() {
        return member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}
