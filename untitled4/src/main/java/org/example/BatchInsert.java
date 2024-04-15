package org.example;

import java.sql.*;

public class BatchInsert {
    private final static String HOST = "localhost"; // сервер базы данных
    private final static String DATABASENAME = "testDB"; // имя базы
    private final static String USERNAME = "postgres"; // учетная запись пользователя
    private final static String PASSWORD = "1234"; // пароль
    static Connection connection;

    public static void main(String[] args) throws SQLException {
        // Строка для соединения с бд
        String url = "jdbc:postgresql://" + HOST + "/" + DATABASENAME + "?user=" + USERNAME + "&password=" + PASSWORD;
        connection = DriverManager.getConnection(url, USERNAME, PASSWORD);
        try {
            connection.setAutoCommit(false);
            System.out.println("Соединение с БД установлено корректно");

            String SQL = "INSERT INTO test(ID, name) VALUES (?, ?);";
            try (PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
                preparedStatement.setInt(1, 10);
                preparedStatement.setString(2, "Olaf");
                preparedStatement.addBatch();

                preparedStatement.setInt(1, 11);
                preparedStatement.setString(2, "Erik");
                preparedStatement.addBatch();

                preparedStatement.setInt(1, 12);
                preparedStatement.setString(2, "Baleog");
                preparedStatement.addBatch();

                int[] count = preparedStatement.executeBatch();
                preparedStatement.clearBatch();
                connection.commit();
                System.out.println("Данные отправлены");
            }
        } catch (SQLException e) {
            connection.rollback();
            System.err.println("Данные не добавлены");
            e.printStackTrace();
        } finally {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    public static boolean checkvalue(int checkedvalue) {
        String SQL = "SELECT * FROM test WHERE ID = ?;";
        try (PreparedStatement statement = connection.prepareStatement(SQL)) {
            statement.setInt(1, checkedvalue);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    public static boolean insertvalue(int insertedvalue) {
        String SQL = "INSERT INTO test(id) VALUES (?);";
        try (PreparedStatement statement = connection.prepareStatement(SQL)) {
            statement.setInt(1, insertedvalue);
            int i = statement.executeUpdate();
            return i >= 1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        }
    }
}