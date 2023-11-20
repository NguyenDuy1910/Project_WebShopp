package repositories;

import models.Product;
import models.User;
import org.hibernate.Session;
import utility.HibernateUtility;

public class ProductRepository {
    public Product save(Product product){
        Session session = HibernateUtility.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.save(product);
            session.getTransaction().commit();
        } catch (RuntimeException e){
            session.getTransaction().rollback();
            e.printStackTrace();
            System.err.print("Error occurred while saving the user: " + e.getMessage());
        } finally {
            session.flush();
            session.close();
        }
        return product;
    }

    public Product findById(Long productId){
        Session session = HibernateUtility.getSessionFactory().openSession();
        try{
            return session.get(Product.class, productId);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }
}
