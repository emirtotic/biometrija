package biometrija.test.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class VrstaDAOImpl implements VrstaDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public List<biometrija.test.entity.Vrsta> getVrstaList() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query<biometrija.test.entity.Vrsta> query = session.createQuery("from Vrsta", biometrija.test.entity.Vrsta.class);
		
		List<biometrija.test.entity.Vrsta> vrstaList = query.getResultList();
		
		return vrstaList;
	}

	@Transactional
	@Override
	public biometrija.test.entity.Vrsta getVrsta(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		biometrija.test.entity.Vrsta vrsta = session.get(biometrija.test.entity.Vrsta.class, id);
		
		return vrsta;
	}

	@Transactional
	@Override
	public void saveVrsta(biometrija.test.entity.Vrsta vrsta) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(vrsta);

	}

	@Transactional
	@Override
	public void deleteVrsta(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("delete from Vrsta where id=:id");
		
		query.setParameter("id", id);
		
		query.executeUpdate();

	}

}
