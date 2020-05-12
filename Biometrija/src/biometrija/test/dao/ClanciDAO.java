package biometrija.test.dao;

import java.util.List;

import biometrija.test.entity.Clanci;

public interface ClanciDAO {

	public List<Clanci> getClanciList();
	
	public Clanci getClanak(int id);
	
	public void saveClanak(Clanci clanak);
	
	public void deleteClanak(int id);
	
}
