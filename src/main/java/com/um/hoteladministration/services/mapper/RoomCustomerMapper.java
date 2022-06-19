package com.um.hoteladministration.services.mapper;

import com.um.hoteladministration.api.room.RoomCustomerMessage;
import com.um.hoteladministration.repository.entities.RoomCustomer;
import org.springframework.stereotype.Service;

@Service
public class RoomCustomerMapper {

    public RoomCustomerMessage toRoomCustomer(RoomCustomer roomCustomer) {
        return new RoomCustomerMessage(
                roomCustomer.getRoomId(),
                roomCustomer.getCustomerId()
        );
    }
}
