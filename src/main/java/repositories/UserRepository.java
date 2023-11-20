package repositories;

import models.User;
import org.hibernate.Session;
import utility.HibernateUtility;

public class UserRepository {
    public User save(User user){
        Session session = HibernateUtility.getSessionFactory().openSession();
        try{
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch (RuntimeException e){
            session.getTransaction().rollback();
            e.printStackTrace();
            System.err.print("Error occurred while saving the user: " + e.getMessage());
        } finally {
            session.flush();
            session.close();
        }
        return user;
    }
//    public Optional<User> findUserByPhoneNumber(String phoneNumber){
//        Session session = HibernateUtility.getSessionFactory().openSession()
//        try() {
//            String hql = "FROM User WHERE phoneNumber =: phoneNumber";
//            return session.createQuery(hql, User.class)
//                    .setParameter("phoneNumber", phoneNumber)
//                    .uniqueResultOptional();
//        }
//    }

    public User findById(Long userID){
        Session session = HibernateUtility.getSessionFactory().openSession();
        try{
            return session.get(User.class, userID);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }
}
