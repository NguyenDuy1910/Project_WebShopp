package repositories;

import models.OrderDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.List;

public class OrderDetailRepository {
    private SessionFactory sessionFactory;

    public OrderDetailRepository(){
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
//        Configuration configuration = new Configuration().configure();
//        sessionFactory = configuration.buildSessionFactory();
    }
    public void saveAll(List<OrderDetail> orderDetailList){
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        try{
            transaction = session.beginTransaction();
            for (OrderDetail orderDetail:orderDetailList){
                session.save(orderDetail);
            }
        } catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

//    public List<OrderDetail> findByOrderId(Long orderId){
//        Session session = sessionFactory.openSession();
//        Transaction transaction = null;
//        List<OrderDetail> orderDetails = null;
//        try{
//            transaction = session.beginTransaction();
//            String hql = "FROM OrderDetail od WHERE od.oder.id =:orderId";
//            Query query = session.createQuery(hql);
//            query.setParameter("orderId", orderId);
//            orderDetails = query.getResultList();
//            transaction.commit();
//        } catch (Exception e){
//            if (transaction != null){
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        } finally{
//            session.close();
//        }
//        return orderDetails;
//    }
}
