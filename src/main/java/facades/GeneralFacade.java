/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import DTO.PersonDTO;
import entities.Person;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author Renz
 */
public class GeneralFacade {

    private static GeneralFacade instance;
    private static EntityManagerFactory emf;

    private static GeneralFacade getGeneralFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new GeneralFacade();
        }
        return instance;
    }

    public PersonDTO addPerson(PersonDTO person) {
        EntityManager em = emf.createEntityManager();
        Person p = new Person(person.getEmail(), person.getFirstName(), person.getLastName(), person.getPhone());
        System.out.println("person p:" + p);

        try {
            em.getTransaction().begin();
            em.persist(p);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return new PersonDTO(p);
    }

}
