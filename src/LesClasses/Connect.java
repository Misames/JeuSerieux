package LesClasses;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

public class Connect {
    private Connection conn;
    public Connect() {
        try {
            Class.forName("");
            final String url = "jdbc:mysql://localhost:8080/";
            final char user = "root";
            final char passwd = "root";
            conn = DriverManager.getConnection(url, user, password);
        } catch (final Exception e) {
            e.getMessage();
        }

    }

    public void Enregistrer(final String nom, final String prenom) {
        final Statement state = conn.createStatement();
        ResultSet result;
        final String rsql = "INSERT INTO palmares (nom, prenom, date) VALUE (" + nom + "," + prenom + ", CURDATE())";
        result = 0;
    }
}