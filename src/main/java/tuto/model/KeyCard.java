package tuto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Amine Jendoubi on 26/09/2017.
 */
@Entity
public class KeyCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String serialNumber;
    private RoomId roomId;

    public RoomId getRoomId() {
        return roomId;
    }

    public void setRoomId(RoomId roomId) {
        this.roomId = roomId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
