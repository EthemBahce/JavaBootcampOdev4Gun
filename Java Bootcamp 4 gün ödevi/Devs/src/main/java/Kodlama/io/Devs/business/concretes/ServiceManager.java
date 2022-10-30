package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.IService;
import Kodlama.io.Devs.dataAccess.abstracts.IRepository;
import Kodlama.io.Devs.entities.Language;


@Service
public class ServiceManager implements IService{
	
	private IRepository iRepository;
	
	
	@Autowired
	public ServiceManager(IRepository iRepository) {
		this.iRepository = iRepository;
		
		
	}
	
	


	@Override
	public List<Language> getAll() {
		
		return iRepository.getAll();
	}


	@Override
	public Language getId(int index) {
		
		return iRepository.getId(index);
	}


	@Override
	public List<Language> addFunction(int index, String name) {
		
		
		
		return iRepository.addMethods(index, name);
		
		
	}


	


	@Override
	public List<Language> deleteFunction(int index) {
		
		return iRepository.deleteMethods(index);
	}




	@Override
	public List<Language> updateFunction(int index, int id, String name) {
		 
		return iRepository.updateMethods(index,id, name);
	}
	
		

}
