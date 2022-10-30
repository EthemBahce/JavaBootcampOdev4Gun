package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.Language;

public interface IService {
	
	List<Language> getAll();
	Language getId(int index);
	List<Language> addFunction(int id, String name);
	List<Language> updateFunction(int index,int id, String name);
	List<Language> deleteFunction(int index);


}
