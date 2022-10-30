package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.Language;

public interface IRepository {
	
	List<Language> getAll();
	Language getId(int index);
	List<Language> addMethods(int id, String name);
	List<Language> updateMethods(int index,int id, String name);
	List<Language> deleteMethods(int index);

}
