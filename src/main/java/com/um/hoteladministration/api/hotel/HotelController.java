package main.java.com.um.hoteladministration.api.hotel;

import main.java.com.um.hoteladministration.repository.entities.Hotel;
import main.java.com.um.hoteladministration.services.HotelService;
import main.java.com.um.hoteladministration.services.mapper.HotelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(path = "api/hotel")
public class HotelController {

    private final HotelService hotelService;
    private final HotelMapper hotelMapper;

    @Autowired
    public HotelController(HotelService hotelService, HotelMapper hotelMapper) {
        this.hotelService = hotelService;
        this.hotelMapper = hotelMapper;
    }

    @GetMapping(path = {"/{hotelId}"})
    public ResponseEntity<HotelMessage> getById(@PathVariable Long hotelId) {

        Hotel hotel = hotelService.getById(hotelId);
        HotelMessage hotelMessage = hotelMapper.toHotelMessage(hotel);
        return new ResponseEntity<>(hotelMessage, HttpStatus.OK);
    }
}
