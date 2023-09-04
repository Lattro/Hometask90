import java.sql.SQLException;
import java.sql.Statement;

public class Queries
{

    public void deleteBrownPets() throws SQLException, ClassNotFoundException {
      try
      {
          String sqlString = "delete from pets where color='коричневая' or color='коричневый'";
          var db = Connect.getConnection();
          Statement statement = db.createStatement();
          statement.executeUpdate(sqlString);
          db.close();
          System.out.println("Коричневые питомцы удалены");
      }
      catch (SQLException exception)
      {
          System.out.println(exception.getMessage());
      }
    }
}
