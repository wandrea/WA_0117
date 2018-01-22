public class SqlConstants {

    public static String SELECT_ALL_FROM_ACTOR_WHERE_ID_BIGGER = "SELECT*FROM actor WHERE actor_id >?";
    public static String SELECT_LAST_N_ACTOR = "SELECT*FROM actor ORDER BY actor_id DESC LIMIT ? ";
    public static String SELECTFILM_JOIN_ACTOR = "SELECT film.title, actor.first_name, actor.last_name \n" +
            "   FROM film INNER JOIN film_actor ON film.film_id =film_actor.film_id \n" +
            "   INNER JOIN actor ON film_actor.actor_id = actor.actor_id WHERE actor.actor_id>?";

}
