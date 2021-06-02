package kodlamaio.Hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.CityService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.CityDao;
import kodlamaio.Hrms.entities.concretes.City;

import java.util.List;
@Service
public class CityManager implements CityService{

	private CityDao cityDao;
	
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}
	
//	@Override
//	public Result add(City city) {
//		this.cityDao.save(city);
//	    return new SuccessResult("City has been added.");
//	}
//
//	@Override
//	public Result update(City city) {
//		this.cityDao.save(city);
//	    return new SuccessResult("City has been updated.");
//	}
//
//	@Override
//	public Result delete(int id) {
//		this.cityDao.deleteById(id);
//	    return new SuccessResult("City has been deleted.");
//	}
//
//	@Override
//	public DataResult<City> getById(int id) {
//		return new SuccessDataResult<City>(this.cityDao.getById(id));
//	}

	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>(this.cityDao.findAll());
	}

}