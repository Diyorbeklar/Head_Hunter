package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class COMPANY {
    private static Integer id;
    private static Integer company_id;
    private static String information;
    private static String web_sayt_link;
    private static String main_office_location;
    private static Integer number_of_worker;
    private static String owner;

    public COMPANY(Integer company_id) {
        COMPANY.company_id =company_id;
        System.out.println("Enter a information about company:");
        Scanner scInfo = new Scanner(System.in);
        COMPANY.information = scInfo.nextLine();
        System.out.println("Enter a link:");
        Scanner scLink = new Scanner(System.in);
        COMPANY.web_sayt_link = scLink.nextLine();
        System.out.println("Enter a main office location:");
        Scanner scMain = new Scanner(System.in);
        COMPANY.main_office_location = scMain.nextLine();
        System.out.println("Enter a number of worker:");
        Scanner scWorker = new Scanner(System.in);
        COMPANY.number_of_worker = scWorker.nextInt();
        System.out.println("Enter name of owner:");
        Scanner scOwner = new Scanner(System.in);
        COMPANY.owner = scOwner.nextLine();
        addCompany();
    }


    public static void addCompany(){
        String query = "INSERT INTO COMPANY_DESCRIPTION(COMPANY_ID,INFORMATION,WEB_SAYT_LINK,MAIN_OFFICE_LOCATION,NUMBER_OF_WORKER,OWNER) values(?,?,?,?,?)";
        try (Connection connection = DBconnection.connection();
             PreparedStatement statement = connection.prepareStatement(query)){
            statement.setInt(1,company_id);
            statement.setString(2,information);
            statement.setString(3,web_sayt_link);
            statement.setString(4,main_office_location);
            statement.setInt(5,number_of_worker);
            statement.setString(6,owner);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        COMPANY.id = id;
    }

    public static Integer getCompany_id() {
        return company_id;
    }

    public static void setCompany_id(Integer company_id) {
        COMPANY.company_id = company_id;
    }

    public static String getInformation() {
        return information;
    }

    public static void setInformation(String information) {
        COMPANY.information = information;
    }

    public static String getWeb_sayt_link() {
        return web_sayt_link;
    }

    public static void setWeb_sayt_link(String web_sayt_link) {
        COMPANY.web_sayt_link = web_sayt_link;
    }

    public static String getMain_office_location() {
        return main_office_location;
    }

    public static void setMain_office_location(String main_office_location) {
        COMPANY.main_office_location = main_office_location;
    }

    public static Integer getNumber_of_worker() {
        return number_of_worker;
    }

    public static void setNumber_of_worker(Integer number_of_worker) {
        COMPANY.number_of_worker = number_of_worker;
    }

    public static String getOwner() {
        return owner;
    }

    public static void setOwner(String owner) {
        COMPANY.owner = owner;
    }
}
