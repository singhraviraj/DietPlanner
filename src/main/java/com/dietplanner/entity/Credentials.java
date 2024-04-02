package com.dietplanner.entity;


import javax.persistence.*;

@Entity
@Table(name = "credentials")
public class Credentials {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String username;
        private String password;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "userDetail_id")
        private UserDetailEntity userDetailEntity;

        public Credentials() {
        }

    public Credentials(int id, String username, String password, UserDetailEntity userDetailEntity) {
        this.id = id;
        this.username = username;
        this.password = password;
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

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    @Override
    public String toString() {
        return "Credentials{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
