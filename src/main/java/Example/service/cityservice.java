package Example.service;

import Example.model.City;

import java.util.List;

public interface cityservice {
    City getCityById(Integer id);
    List<City> getCityList();

    void createCity(City city);
    void updateCity(Integer id, City city);
    void deleteCity(Integer id);
}
