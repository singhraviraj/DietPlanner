package com.dietplanner.entity;


import org.hibernate.engine.internal.Cascade;

import javax.persistence.*;
@Entity
@Table(name = "userDetailEntity")
public class UserDetailEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        private String name;
        private int contactNo;
        private String gender;
        private int age;
        private float height;
        private float weight;

        @OneToOne(mappedBy = "userDetailEntity")
        private Credentials credentials;

        @OneToOne(mappedBy = "userDetailEntity")
        private UserDiet userDiet;

        public UserDetailEntity() {
        }

    public UserDetailEntity(int id, String name, int contactNo, String gender, int age, float height, float weight, Credentials credentials, UserDiet userDiet) {
        this.id = id;
        this.name = name;
        this.contactNo = contactNo;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.credentials = credentials;
        this.userDiet = userDiet;
    }

    public UserDiet getUserDiet() {
        return userDiet;
    }

    public void setUserDiet(UserDiet userDiet) {
        this.userDiet = userDiet;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    public int getContactNo() {
            return contactNo;
        }

        public void setContactNo(int contactNo) {
            this.contactNo = contactNo;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public float getHeight() {
            return height;
        }

        public void setHeight(float height) {
            this.height = height;
        }

        public float getWeight() {
            return weight;
        }

        public void setWeight(float weight) {
            this.weight = weight;
        }

    @Override
    public String toString() {
        return "UserDetailEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contactNo=" + contactNo +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
