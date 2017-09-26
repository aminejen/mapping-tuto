package unit_tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import test_config.ApplicationTestConfig;
import tuto.model.Room;
import tuto.model.RoomId;
import tuto.repositories.RoomRepository;


/**
 * Created by Amine Jendoubi on 26/09/2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationTestConfig.class)
public class RoomRepositoryTests {
    @Autowired
    private RoomRepository roomRepository;

    @Test
    public void createTest() {
        RoomId roomId = new RoomId();
        roomId.setBuildingNumber(178896l);
        roomId.setRoomNumber(189l);
        Room room = new Room();
        room.setId(roomId);
        room.setLength(1.382);
        room.setWidth(5.63);
        roomRepository.save(room);
    }
}
