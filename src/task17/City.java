package task17;

public class City {
    private int id;
    private String nameCity;
    private int population;
    private Сontinent continent;

    public City(int id, String nameCity, int population, Сontinent continent) {
        this.id = id;
        this.nameCity = nameCity;
        this.population = population;
        this.continent = continent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCity() {
        return nameCity;
    }

    public void setNameCity(String nameCity) {
        this.nameCity = nameCity;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Сontinent getContinent() {
        return continent;
    }

    public void setContinent(Сontinent continent) {
        this.continent = continent;
    }
    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", Город = " + nameCity + '\'' +
                ", Население = " + population +
                ", Континент = " + continent +
                '}';
    }

}
