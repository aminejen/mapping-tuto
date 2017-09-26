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
import tuto.model.KeyCard;
import tuto.model.Occupant;
import tuto.model.Room;
import tuto.model.RoomId;
import tuto.repositories.RoomRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


/**
 * Created by Amine Jendoubi on 26/09/2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationTestConfig.class)
public class RoomRepositoryTests {
    @Autowired
    private RoomRepository roomRepository;


    @Test
    public void crudTest() {
        RoomId roomId = new RoomId();
        roomId.setBuildingNumber(15l);
        roomId.setRoomNumber(2l);

        Occupant occupant = new Occupant();
        occupant.setRoomId(roomId);
        occupant.setCheckoutDate(new Date());
        occupant.setCheckinDate(new Date());

        KeyCard keyCard = new KeyCard();
        keyCard.setSerialNumber("FF8954452741");
        keyCard.setRoomId(roomId);
        List keyCards = new ArrayList();
        keyCards.add(keyCard);

        Room room = new Room();
        room.setId(roomId);
        room.setKeyCards(keyCards);
        room.setLength(1.382);
        room.setWidth(5.63);

        roomRepository.save(room);
        Room roomDB = roomRepository.findOne(roomId);
        List<KeyCard> list = roomDB.getKeyCards();
        System.out.println(list);

    }

}
