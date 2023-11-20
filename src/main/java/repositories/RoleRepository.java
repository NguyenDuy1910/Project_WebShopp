package repositories;

import models.Role;
import org.hibernate.Session;
import utility.HibernateUtility;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class RoleRepository {
    @PersistenceContext
    private EntityManager entityManager;
    public Role findById(Long Roleid){
        Session session = HibernateUtility.factory.openSession();
        try{
            return session.get(Role.class, Roleid);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }
}
