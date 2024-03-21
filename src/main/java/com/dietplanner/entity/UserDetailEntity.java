package com.dietplanner.entity;


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

        public UserDetailEntity() {
        }

        public UserDetailEntity(int id, int contactNo, String name, String gender, int age, float height, float weight) {
            this.id = id;
            this.contactNo = contactNo;
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.height = height;
            this.weight = weight;
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

        @java.lang.Override
        public java.lang.String toString() {
            return "Entity{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", gender='" + gender + '\'' +
                    ", age=" + age +
                    ", height=" + height +
                    ", weight=" + weight +
                    '}';
        }

    }
