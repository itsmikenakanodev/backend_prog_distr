package com.distribuida.servicios;

import com.distribuida.db.Persona;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class ServicioPersonaImpl implements ServicioPersona{
    @Inject
    EntityManager em;

    @Override
    public Persona findById(Integer id) {
        return em.find(Persona.class,id);
    }

    @Override
    public List<Persona> findAll() {
        return em
                .createQuery("select o from Persona o order by id asc", Persona.class).getResultList();
    }

    @Override
    public void insert(Persona p) {
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }

    @Override
    public void update(Persona p) {
        em.getTransaction().begin();
        em.merge(p);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Integer id) {
        Persona p = this.findById(id);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }

}
