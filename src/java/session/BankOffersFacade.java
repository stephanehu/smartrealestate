/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.BankOffers;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Stephane
 */
@Stateless
public class BankOffersFacade extends AbstractFacade<BankOffers> {

    @PersistenceContext(unitName = "SmartRealEstatePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BankOffersFacade() {
        super(BankOffers.class);
    }
    
}
