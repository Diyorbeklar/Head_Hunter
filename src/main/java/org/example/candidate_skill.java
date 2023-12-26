package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class candidate_skill {
    private Integer id;
    private Integer candidate_resume_id;
    private String name;
    private Integer Level;

    public candidate_skill() {
        System.out.println("Enter number candidate:");
        Scanner scCan = new Scanner(System.in);
        this.candidate_resume_id = scCan.nextInt();
        System.out.println("Enter name skill:");
        Scanner scName = new Scanner(System.in);
        this.name = scName.nextLine();
        System.out.println("Enter number level:");
        Scanner scLevel = new Scanner(System.in);
        this.Level = scLevel.nextInt();
    }

    public void addSkill(){
        String query = "INSERT INTO CANDIDATE_SKILL(CANDIDATE_RESUME_ID,NAME,level) values(?,?,?::level)";
        try (Connection connection = DBconnection.connection();
             PreparedStatement statement = connection.prepareStatement(query)){
            statement.setInt(1,this.candidate_resume_id);
            statement.setString(2,this.name);
            statement.setString(3,String.valueOf(this.Level));
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
