package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.City;

public interface CityDao extends JpaRepository<City, Integer> {

    City getByName(String name);
    City getById(int id);
    }
