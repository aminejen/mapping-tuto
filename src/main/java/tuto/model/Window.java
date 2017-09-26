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
    private String location;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
