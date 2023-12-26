package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Candidate_resume {
     private static Integer id;
     private static Integer company_id;
     private static String information;
     private static String linked_list;
     private static String address;
     private static Integer age;

     public Candidate_resume() {
          System.out.println("Enter canditate ID:");
          Scanner scCom = new Scanner(System.in);
          this.company_id = scCom.nextInt();
          System.out.println("Enter information about yourself:");
          Scanner scInfo = new Scanner(System.in);
          this.information = scInfo.nextLine();
          System.out.println("Enter linked list:");
          Scanner scLink = new Scanner(System.in);
          this.linked_list = scLink.nextLine();
          System.out.println("Enter address");
          Scanner scAdd = new Scanner(System.in);
          this.address = scAdd.nextLine();
          System.out.println("Enter your age: ");
          Scanner scAge = new Scanner(System.in);
          this.age = scAge.nextInt();

     }

     public static void addCandidateResume(){
          String query = "INSERT INTO CANDIDATE_RESUME(CANDIDATE_ID,INFORMATION,LINKEDEN_LIST,ADDRESS,AGE) values(?,?,?,?)";
          try (Connection connection = DBconnection.connection();
               PreparedStatement statement = connection.prepareStatement(query)){
               statement.setInt(1,company_id);
               statement.setString(2,information);
               statement.setString(3,linked_list);
               statement.setString(4,address);
               statement.setInt(5,age);
               statement.executeUpdate();
          } catch (SQLException e) {
               throw new RuntimeException(e);
          }
     }
}
