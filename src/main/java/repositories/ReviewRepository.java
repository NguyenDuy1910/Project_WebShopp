package repositories;

import models.Product;
import models.Review;
import org.hibernate.Session;
import utility.HibernateUtility;

public class ReviewRepository {
    public Review save(Review review){
        Session session = HibernateUtility.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.save(review);
            session.getTransaction().commit();
        } catch (RuntimeException e){
            session.getTransaction().rollback();
            e.printStackTrace();
            System.err.print("Error occurred while saving the user: " + e.getMessage());
        } finally {
            session.flush();
            session.close();
        }
        return review;
    }

    public Review findById(Long reviewId){
        Session session = HibernateUtility.getSessionFactory().openSession();
        try{
            return session.get(Review.class, reviewId);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }
}
