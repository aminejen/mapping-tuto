package tuto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Amine Jendoubi on 26/09/2017.
 */
@Entity
public class Window {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
}
