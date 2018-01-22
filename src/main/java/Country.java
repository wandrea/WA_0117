public class Country {
    private int country_id;
    private String country;
    private String lastUpdate;

    public Country() {
    }

    public Country(int country_id, String country, String lastUpdate) {
        this.country_id = country_id;
        this.country = country;
        this.lastUpdate = lastUpdate;
    }

    public int getCountry_id() {
        return country_id;
    }

    public String getCountry() {
        return country;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country_id=" + country_id +
                ", country='" + country + '\'' +
                ", lastUpdate='" + lastUpdate + '\'' +
                '}';
    }
}
