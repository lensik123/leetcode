package org.example;

import java.sql.*;
import java.util.Scanner;

public class JDBCinsert {
    private  final static String  HOST     = "localhost"  ; // сервер базы данных
    private  final static String  DATABASENAME = "testDB"  ;// имя базы
    private  final static String  USERNAME = "postgres"; // учетная запись пользователя
    private  final static String  PASSWORD = "1234"; // пароль пользователя
    static Connection connection;

    public static void main(String[] args){

        //Строка для соединения с бд
        String url="jdbc:postgresql://"+HOST+"/"+DATABASENAME+"?user="+USERNAME+"&password="+PASSWORD;
        try {
            connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
            if (connection == null)
                System.err.println("Нет соединения с БД!");
            else {
                System.out.println("Соединение с БД установлено");
                String column = "surname";
//              String sql = "alter table test add column " + column + " varchar(255);";
                String sql = "UPDATE test set surname = 'Baysarov' where name = 'Turpal'";
                try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
                    preparedStatement.executeUpdate();
                    System.out.println("Выполнено");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}