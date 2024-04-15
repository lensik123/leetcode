package org.example;

import java.io.IOException;
import java.sql.*;

public class App {
    private final static String HOST = "localhost"; // сервер базы данных
    private final static String DATABASENAME = "testDB";// имя базы
    private final static String USERNAME = "postgres"; // учетная запись пользователя
    private final static String PASSWORD = "1234"; // пароль пользователя
    static Connection connection;


    private static String conok = "Соединение с бд установлено";
    private static String conerr = "Произошла ошибка подключения к бд";
    static String sql = "select * from test";
    static String SQL = "Select * from test WHERE id = ?;";

    public static void main(String[] args) {
        String url = "jdbc:postgresql://" + HOST + "/" + DATABASENAME + "?user=" + USERNAME + "&password=" + PASSWORD;
        try (Connection connection = DriverManager.getConnection(url)) {
            System.out.println(String.format("%s", conok));
            int count = 5;
            try (PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
                preparedStatement.setInt(1, count);
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    System.out.println(resultSet.getString("name"));
                }
                preparedStatement.close();
            }
        } catch (SQLException e) {
            System.out.println(String.format("%s", conerr));
            e.printStackTrace();
        }
    }
}