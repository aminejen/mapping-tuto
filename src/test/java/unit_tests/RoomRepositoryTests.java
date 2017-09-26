package unit_tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import test_config.ApplicationTestConfig;
import tuto.model.Occupant;
import tuto.model.Room;
import tuto.model.RoomId;
import tuto.repositories.RoomRepository;

import javax.transaction.Transactional;
import java.util.Date;


/**
 * Created by Amine Jendoubi on 26/09/2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationTestConfig.class)
@Transactional
public class RoomRepositoryTests {
    @Autowired
    private RoomRepository roomRepository;


    @Test
    public void crudTest() {
        RoomId roomId = new RoomId();
        roomId.setBuildingNumber(15l);
        roomId.setRoomNumber(2l);
        Room room = new Room();
        Occupant occupant = new Occupant();
        occupant.setRoomId(roomId);
        occupant.setCheckoutDate(new Date());
        occupant.setCheckinDate(new Date());
        room.setId(roomId);
        room.setLength(1.382);
        room.setWidth(5.63);
        roomRepository.save(room);
        Room retrivedRoom = roomRepository.findOne(roomId);
        Assert.assertNotNull(retrivedRoom);
        roomRepository.delete(retrivedRoom);
        retrivedRoom = roomRepository.findOne(roomId);
        Assert.assertNull(retrivedRoom);
    }

}
