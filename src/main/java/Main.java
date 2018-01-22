import java.sql.*;


public class Main {
    public static void main(String[] args) {
        Connection connection =null;
        //Statement statement = null;
        ResultSet rs = null;
        ResultSet rs2 = null;
        ResultSet rs3 = null;
        PreparedStatement statement= null;
        try {

           connection=DbUtil.getInstance().getConnection();
            statement = connection.prepareStatement(SqlConstants.SELECTFILM_JOIN_ACTOR);
           statement.setInt(1,5);
            rs = statement.executeQuery();


            while (rs.next()) {
               Actor actor = new Actor(rs.getInt("actor_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("last_update"));

                System.out.println(actor.toString());

            }

         /*   rs2 = statement.executeQuery("SELECT*FROM country");
           while (rs2.next()) {


                Country country = new Country(rs2.getInt("country_id"),
                        rs2.getString("country"),
                        rs2.getString("last_update"));

                System.out.println(country.toString());

            }*/
          /*  rs3 = statement.executeQuery("SELECT * FROM actor WHERE actor_id BETWEEN 20 AND 60");
            while (rs3.next()) {
                Actor actor = new Actor(rs3.getInt("actor_id"),
                        rs3.getString("first_name"),
                        rs3.getString("last_name"),
                        rs3.getString("last_update"));

                System.out.println(actor.toString());

            }*/




        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs2 != null) {
                try {
                    rs2.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (rs3 != null) {
                try {
                    rs3.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}

