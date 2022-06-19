package com.um.hoteladministration.api.hotel;

import com.um.hoteladministration.repository.entities.Hotel;
import com.um.hoteladministration.repository.models.HotelModel;
import com.um.hoteladministration.services.HotelService;
import com.um.hoteladministration.services.mapper.HotelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

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

    @GetMapping(path = {"/"})
    public ResponseEntity<Set<HotelMessage>> getAll() {
        Set<Hotel> hotelSet = hotelService.getAll();
        Set<HotelMessage> hotelMessageSet = hotelSet.stream().map(hotelMapper::toHotelMessage).collect(Collectors.toSet());
        return new ResponseEntity<>(hotelMessageSet, HttpStatus.OK);
    }

    @PostMapping(path = "/new", consumes = "application/json", produces = "application/json")
    public ResponseEntity<HotelMessage> newHotel(@RequestBody HotelModel hotelModel) {
        Hotel hotel = new Hotel(
                hotelModel.getId(),
                hotelModel.getName(),
                hotelModel.getAddress(),
                hotelModel.getRoomQty()
        );
        Hotel hotelSaved = hotelService.createNew(hotel);
        HotelMessage hotelMessage = hotelMapper.toHotelMessage(hotelSaved);
        return new ResponseEntity<>(hotelMessage, HttpStatus.OK);
    }
}
