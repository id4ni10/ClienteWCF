/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import controllers.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import model.Contacorrentes;

/**
 *
 * @author Danilo
 */
public class ContacorrentesJpaController implements Serializable {

    public ContacorrentesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Contacorrentes contacorrentes) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(contacorrentes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Contacorrentes contacorrentes) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            contacorrentes = em.merge(contacorrentes);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = contacorrentes.getId();
                if (findContacorrentes(id) == null) {
                    throw new NonexistentEntityException("The contacorrentes with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Contacorrentes contacorrentes;
            try {
                contacorrentes = em.getReference(Contacorrentes.class, id);
                contacorrentes.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The contacorrentes with id " + id + " no longer exists.", enfe);
            }
            em.remove(contacorrentes);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Contacorrentes> findContacorrentesEntities() {
        return findContacorrentesEntities(true, -1, -1);
    }

    public List<Contacorrentes> findContacorrentesEntities(int maxResults, int firstResult) {
        return findContacorrentesEntities(false, maxResults, firstResult);
    }

    private List<Contacorrentes> findContacorrentesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Contacorrentes.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Contacorrentes findContacorrentes(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Contacorrentes.class, id);
        } finally {
            em.close();
        }
    }

    public int getContacorrentesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Contacorrentes> rt = cq.from(Contacorrentes.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
