package at.codersbay.gerhofer;

import java.sql.*;

public class PokedexDAO {

    public Pokemon fetchPokemonByIndex(Integer index)
            throws SQLException {
        Connection connection = openConnection();

        PreparedStatement selectByNumber =
                connection.prepareStatement(
                        "SELECT * FROM pokemon2 WHERE number = ?"
                );
        selectByNumber.setInt(1, index);

        ResultSet result = selectByNumber.executeQuery();

        if (result.next()) {
            return new Pokemon(
                    result.getInt("number"),
                    result.getString("name"),
                    result.getInt("attack"),
                    result.getInt("defense"),
                    result.getInt("speed"),
                    result.getDouble("weight"),
                    result.getInt("generation"),
                    result.getBoolean("is_legendary"),
                    result.getInt("hp"),
                    result.getString("classification")
            );
        } else {
            return null;
        }
    }

    private Connection openConnection() throws SQLException {
        String host = "localhost:3306";
        String database = "pokedex";
        String user = "root";
        String password = "root";
        String connectionString = "jdbc:mysql://"
                + host + "/" + database
                + "?user=" + user
                + "&password=" + password
                + "&serverTimezone=UTC";

        return DriverManager.getConnection(connectionString);
    }

}
