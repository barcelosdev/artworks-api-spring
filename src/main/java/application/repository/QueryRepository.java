package application.repository;

import application.entity.QueryArtworks;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class QueryRepository{

    @PersistenceContext
    private EntityManager entityManager;

    public void save(QueryArtworks query){
        this.entityManager.persist(query);
    }
}
