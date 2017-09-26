package tuto.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Amine Jendoubi on 26/09/2017.
 */
@Entity
public class Occupant {
    @Id
    private RoomId roomId;
    private Date checkinDate;
    private Date checkoutDate;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Room room;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public RoomId getRoomId() {
        return roomId;
    }

    public void setRoomId(RoomId roomId) {
        this.roomId = roomId;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }
}
