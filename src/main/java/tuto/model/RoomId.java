package tuto.model;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import java.io.Serializable;

/**
 * Created by Amine Jendoubi on 26/09/2017.
 */
@Embeddable
public class RoomId implements Serializable {
    private long roomNumber;
    private long buildingNumber;


    public RoomId() {
    }

    public long getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(long roomNumber) {
        this.roomNumber = roomNumber;
    }

    public long getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(long buildingNumber) {
        this.buildingNumber = buildingNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoomId roomId = (RoomId) o;

        if (roomNumber != roomId.roomNumber) return false;
        return buildingNumber == roomId.buildingNumber;
    }

    @Override
    public int hashCode() {
        int result = (int) (roomNumber ^ (roomNumber >>> 32));
        result = 31 * result + (int) (buildingNumber ^ (buildingNumber >>> 32));
        return result;
    }
}
