package com.dietplanner.entity;

import javax.persistence.*;

@Entity
@Table(name = "userDiet")
public class UserDiet {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private int time;
        private String ingredients;
        private int calorieIntake;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "userDiet_Id")
        private UserDetailEntity userDetailEntity;

        public UserDiet() {
        }

    public UserDiet(int id, int time, String ingredients, int calorieIntake, UserDetailEntity userDetailEntity) {
        this.id = id;
        this.time = time;
        this.ingredients = ingredients;
        this.calorieIntake = calorieIntake;
        this.userDetailEntity = userDetailEntity;
    }

    public UserDetailEntity getUserDetailEntity() {
        return userDetailEntity;
    }

    public void setUserDetailEntity(UserDetailEntity userDetailEntity) {
        this.userDetailEntity = userDetailEntity;
    }

    public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }

        public String getIngredients() {
            return ingredients;
        }

        public void setIngredients(String ingredients) {
            this.ingredients = ingredients;
        }

        public int getCalorieIntake() {
            return calorieIntake;
        }

        public void setCalorieIntake(int calorieIntake) {
            this.calorieIntake = calorieIntake;
        }

    @Override
    public String toString() {
        return "UserDiet{" +
                "id=" + id +
                ", time=" + time +
                ", ingredients='" + ingredients + '\'' +
                ", calorieIntake=" + calorieIntake +
                '}';
    }
}

