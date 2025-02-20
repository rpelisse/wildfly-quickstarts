package org.jboss.as.quickstarts.helloworld.rest;

import jakarta.persistence.PersistenceContext;
import jakarta.enterprise.inject.Model;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Model
public class EdvigeService {
//    private static final Logger LOGGER = Logger.getLogger(CustomerService.class.getName());
    @PersistenceContext
    EntityManager em;
    @Transactional
    public void createEntry(Entry customer) {
      if ( em == null )
        throw new IllegalStateException("em not injected");
      em.persist(customer);
//        LOGGER.info("Created Customer "+customer);
    }

}
