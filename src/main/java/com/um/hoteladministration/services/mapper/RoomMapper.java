package com.um.hoteladministration.services.mapper;

import com.um.hoteladministration.api.room.RoomMessage;
import com.um.hoteladministration.repository.entities.Room;
import org.springframework.stereotype.Service;

@Service
public class RoomMapper {

    public RoomMessage toRoomMapper(Room room) {
        return new RoomMessage(
                room.getId(),
                room.getNumber(),
                room.getTaken(),
                room.getCapacity()
        );
    }
}
