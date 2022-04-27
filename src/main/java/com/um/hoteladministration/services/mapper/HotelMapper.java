package com.um.hoteladministration.services.mapper;

import com.um.hoteladministration.api.hotel.HotelMessage;
import com.um.hoteladministration.repository.entity.Hotel;
import org.springframework.stereotype.Service;

@Service
public class HotelMapper {

    public HotelMessage toHotelMessage(Hotel hotel) {
        return new HotelMessage(
                hotel.getId(),
                hotel.getHotelName(),
                hotel.getAddress(),
                hotel.getRoomQty()
        );
    }
}
