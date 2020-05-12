package biometrija.test.dao;

import java.util.List;

import biometrija.test.entity.Vrsta;

public interface VrstaDAO {
	
	public List<Vrsta> getVrstaList();
	
	public Vrsta getVrsta(int id);
	
	public void saveVrsta(Vrsta vrsta);
	
	public void deleteVrsta(int id);

}
