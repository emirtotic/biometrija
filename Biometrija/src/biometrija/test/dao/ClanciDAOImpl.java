package biometrija.test.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import biometrija.test.entity.Clanci;

@Repository
public class ClanciDAOImpl implements ClanciDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	@Override
	public List<Clanci> getClanciList() {
		Session session = sessionFactory.getCurrentSession();
		
		Query<Clanci> query = session.createQuery("from Clanci", Clanci.class);
		
		List<Clanci> clanciList = query.getResultList();
		
		return clanciList;
	}

	@Transactional
	@Override
	public Clanci getClanak(int id) {
		Session session = sessionFactory.getCurrentSession();
		
		Clanci clanak = session.get(Clanci.class, id);
		
		return clanak;
	}

	@Transactional
	@Override
	public void saveClanak(Clanci clanak) {
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(clanak);

	}

	@Transactional
	@Override
	public void deleteClanak(int id) {
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("delete from Clanci where id = :id");
		
		query.setParameter("id", id);
		
		query.executeUpdate();

	}

}
