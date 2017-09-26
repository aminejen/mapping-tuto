package tuto.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tuto.model.Room;
import tuto.model.RoomId;

/**
 * Created by Amine Jendoubi on 26/09/2017.
 */
@Repository
public interface RoomRepository extends CrudRepository<Room,RoomId> {
}
