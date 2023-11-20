package repositories;

import models.Brand;
import org.hibernate.Session;
import utility.HibernateUtility;

public class BrandRepositoty {
    public Brand findById(Long Brandid){
        Session session = HibernateUtility.factory.openSession();
        try{
            return session.get(Brand.class, Brandid);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }
}
