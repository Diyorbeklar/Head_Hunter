package Example.dao;

import Example.model.City;

import java.util.List;

public interface citydao {
    public City selectCityById(Integer id);
    public List<City> selectAllCity();
    void insertCity (City city);
    void updateCity(Integer id, City city);
    void deleteCity(Integer id);
}
