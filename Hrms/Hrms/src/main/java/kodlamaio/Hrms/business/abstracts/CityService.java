package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;

import kodlamaio.Hrms.entities.concretes.City;

public interface CityService {

//	Result add(City city);
//	Result update(City city);
//	Result delete(int id);
//	DataResult<City> getById(int id);
	
	DataResult<List<City>> getAll();
}