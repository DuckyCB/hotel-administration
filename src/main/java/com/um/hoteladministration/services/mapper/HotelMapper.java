package main.java.com.um.hoteladministration.services.mapper;

import main.java.com.um.hoteladministration.api.hotel.HotelMessage;
import main.java.com.um.hoteladministration.repository.entities.Hotel;
import org.springframework.stereotype.Service;

@Service
public class HotelMapper {

    public HotelMessage toHotelMessage(Hotel hotel) {
        return new HotelMessage(
                hotel.getHotelId(),
                hotel.getHotelName(),
                hotel.getHotelAddress(),
                hotel.getRoomQty()
        );
    }
}
