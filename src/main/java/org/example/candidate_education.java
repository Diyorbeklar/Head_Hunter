package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class candidate_education {
    private Integer id;

    private Integer candidate_resume_id;
    private String school_name;
    private String from_date;
    private String to_date;
    private String about_courses;

    public candidate_education() {
        System.out.println("Enter school name:");
        Scanner scName = new Scanner(System.in);
        this.school_name = scName.nextLine();
        System.out.println("Enter candidate resume ID:");
        Scanner scCan = new Scanner(System.in);
        this.candidate_resume_id = scCan.nextInt();
        System.out.println("Enter from date (Example(year:month:day)):");
        Scanner scFrom = new Scanner(System.in);
        this.from_date = scFrom.nextLine();
        System.out.println("Enter to date (Example(year:month:day)):");
        Scanner scTo = new Scanner(System.in);
        this.to_date = scTo.nextLine();
        System.out.println("Enter inforamation about courses:");
        Scanner scInfo = new Scanner(System.in);
        this.about_courses = scInfo.nextLine();
    }

    public void addEducation(){
        String query = "INSERT INTO CANDIDATE_SKILL(CANDIDATE_RESUME_ID,SCHOOL_NAME,FROM_DATE,TO_DATE,ABOUT_COURSES) values(?,?,?::date,?::date,?)";
        try (Connection connection = DBconnection.connection();
             PreparedStatement statement = connection.prepareStatement(query)){
            statement.setInt(1,this.candidate_resume_id);
            statement.setString(2,this.school_name);
            statement.setString(3,this.from_date);
            statement.setString(4,this.to_date);
            statement.setString(5,this.about_courses);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
