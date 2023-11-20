package repositories;

import models.Role;
import models.Storage;
import org.hibernate.Session;
import utility.HibernateUtility;

public class StorageRepository {
    public Storage findById(Long StorageId){
        Session session = HibernateUtility.factory.openSession();
        try{
            return session.get(Storage.class, StorageId);
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return null;
    }
}
