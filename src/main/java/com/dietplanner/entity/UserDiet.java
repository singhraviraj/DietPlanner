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

        public UserDiet() {
        }

        public UserDiet(int id, int time, String ingredients, int calorieIntake) {
            this.id = id;
            this.time = time;
            this.ingredients = ingredients;
            this.calorieIntake = calorieIntake;
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

        @java.lang.Override
        public java.lang.String toString() {
            return "UserDiet{" +
                    "id=" + id +
                    ", time=" + time +
                    ", ingredients='" + ingredients + '\'' +
                    ", calorieIntake=" + calorieIntake +
                    '}';
        }
    }

