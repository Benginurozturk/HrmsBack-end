package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer> {

    City findByName(String cityName);
    City getById(int id);
    }
