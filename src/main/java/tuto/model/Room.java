package tuto.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Amine Jendoubi on 26/09/2017.
 */
@Entity
public class Room implements Serializable {
    @EmbeddedId
    private RoomId id;
    private double length;
    private double width;
    @OneToOne(cascade= CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Occupant occupant;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "roomId")
    private List<KeyCard> keyCards;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Window> windows;


    public List<Window> getWindows() {
        return windows;
    }

    public void setWindows(List<Window> windows) {
        this.windows = windows;
    }

    public List<KeyCard> getKeyCards() {
        return keyCards;
    }

    public void setKeyCards(List<KeyCard> keyCards) {
        this.keyCards = keyCards;
    }

    public RoomId getId() {
        return id;
    }

    public void setId(RoomId id) {
        this.id = id;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Occupant getOccupant() {
        return occupant;
    }

    public void setOccupant(Occupant occupant) {
        this.occupant = occupant;
    }
}
