/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import modelo.Heroi;



public class HeroiDAO implements Serializable {

   protected EntityManager em;
        
   public HeroiDAO()  {
        EntityManagerFactory emf;
       try {
           emf = Conexao.getConexao();
           em = emf.createEntityManager();
       } catch (Exception ex) {
           Logger.getLogger(HeroiDAO.class.getName()).log(Level.SEVERE, null, ex);
           Logger.getLogger("Não foi possível realizar a conexão com a unidade de persistência. Verifique a conexão");
           
       }
        
    }

   public Boolean incluir(Heroi obj) {
        Boolean retorno;
        try {
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
            retorno = true;
        } catch (RuntimeException e) {
            Logger.getLogger(HeroiDAO.class.getName()).log(Level.SEVERE, null, e);
            Logger.getLogger("Erro ao incluir, veja o código acima");
           
            em.getTransaction().rollback();
           
            retorno = false;
            throw e;
        } finally {
            //em.close();
            
        }
        return retorno;
   }

   public Boolean alterar(Heroi obj) {
        Boolean retorno;
        try {
            em.getTransaction().begin();
            em.merge(obj);
            em.getTransaction().commit();
            retorno = true;
        } catch (RuntimeException e) {
             Logger.getLogger(HeroiDAO.class.getName()).log(Level.SEVERE, null, e);
          Logger.getLogger("Erro ao alterar, veja o código acima"); 
            em.getTransaction().rollback();
            retorno = false;
            throw e;
        } finally {
            // em.close();
        }
        return retorno;
   }

   public Boolean excluir(Heroi obj) {
       Boolean retorno;
        try {
            em.getTransaction().begin();
            em.remove(obj);
            em.getTransaction().commit();
            retorno = true;
        } catch (RuntimeException e) {
             Logger.getLogger(HeroiDAO.class.getName()).log(Level.SEVERE, null, e);
             Logger.getLogger("Erro ao excluir, veja o código acima"); 
          
            em.getTransaction().rollback();
            retorno = false;
        } finally {
            //em.close();
        }
        return retorno;
   }

   public List<Heroi> listar() {
      return em.createNamedQuery("Heroi.findAll").getResultList();
   }
   
   public List<Heroi> listar(String filtro) throws Exception{
        return em.createNamedQuery("Heroi.findFilter").setParameter("filtro","%" + filtro.toUpperCase() + "%").getResultList();
    }
   
   public Heroi buscarPorChavePrimaria(Long chaveprimaria) {
       return em.find(Heroi.class, chaveprimaria);
   }
   
   public void fecharConexao() {
        Conexao.closeConexao();
    }   
}
