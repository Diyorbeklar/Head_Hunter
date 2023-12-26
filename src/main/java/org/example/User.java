package org.example;

import java.sql.*;
import java.util.Scanner;

public class User {
    private static Integer id;

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        User.password = password;
    }

    private static String username;

    private static String password;
    private static String phone;
    private static  String Email;
    private static role role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public org.example.role getRole() {
        return role;
    }

    public void setRole(org.example.role role) {
        this.role = role;
    }

    public User() {
        System.out.println("User name enter:");
        Scanner scUser = new Scanner(System.in);
        username = scUser.nextLine();
        System.out.println("Password number enter:");
        Scanner scPassword = new Scanner(System.in);
        password = scPassword.nextLine();
        System.out.println("Phone number enter:");
        Scanner scPhone = new Scanner(System.in);
        phone = scPhone.nextLine();
        System.out.println("Email enter without @gmail.com");
        Scanner scEmail = new Scanner(System.in);
        Email = scEmail.nextLine()+"@gmail.com";
        System.out.println("Company : 1"+ "\n" +
                           "Candidate : 2");
        Scanner scRole = new Scanner(System.in);
        Integer roleId = scRole.nextInt();
        if (roleId==1){
            role = org.example.role.company;
        }else if(roleId==2){
            role = org.example.role.candidate;
        }else {
            System.out.println("Role isn't enter...");
        }

        addUser();


    }
    public static void addUser(){
        String query = "INSERT INTO USERS(USERNAME,PASSWORD,PHONE,EMAIL,ROLE) values(?,?,?,?,?::role)";
        try (Connection connection = DBconnection.connection();
             PreparedStatement statement = connection.prepareStatement(query)){
            statement.setString(1,username);
            statement.setString(2,password);
            statement.setString(3,phone);
            statement.setString(4,Email);
            statement.setString(5,role.name());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }



}
