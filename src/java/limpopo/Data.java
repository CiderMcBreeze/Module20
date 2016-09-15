
package limpopo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;

/*
 * @author Lee Cider McBreeze
 */
@ManagedBean
@SessionScoped
public class Data {
    
    private Register r;
    private HibernateUtil helper;
    private Session session;
    
    public void StoreData(){
        
        r = new Register("Clearance","Baloyi","Alexandra","0630588667","clea@baloyi.io","male","giyani",25);
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(r);
        session.getTransaction().commit();
        session.close();
        
    }
}
