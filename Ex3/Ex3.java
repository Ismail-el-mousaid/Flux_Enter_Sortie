
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.sql.*;

public class Ex3 {
    void export(String path) {
        try {
            FileWriter fw = new FileWriter(path);

            // 1. Chargement du driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. l'etablissement de la connexion avec la BDD
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/information_schema", "tracema", "Souhail");

            // 3. La creation de la requete SQL
            Statement stmt = con.createStatement();

            // 4. l'execution de la requete
            ResultSet rs = stmt.executeQuery("SELECT * FROM CHARACTER_SETS");
            while (rs.next()) {
                fw.write(rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3) + "," + rs.getInt(4) + "\n");
            }

            // 5. la fermeture de la connexion
            fw.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    void importer(String path) {
        try {
            // 1. Chargement du driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. l'etablissement de la connexion avec la BDD
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/information_schema", "tracema", "Souhail");

            // 3. La creation de la requete SQL
            PreparedStatement ps = con.prepareStatement("INSERT INTO CHARACTER_SETS VALUES(?, ?, ?, ?)");

            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);

            String str;
            while ((str = br.readLine()) != null) {
                String[] s = str.split(",");
                ps.setString(1, s[0]);
                ps.setString(2, s[1]);
                ps.setString(3, s[2]);
                ps.setInt(4, Integer.parseInt(s[3]));

                ps.execute();
            }

            con.close();
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Application().importer("output.csv");
    }
}
