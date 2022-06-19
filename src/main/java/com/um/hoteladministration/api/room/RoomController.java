package com.um.hoteladministration.api.room;

import com.um.hoteladministration.api.customer.CustomerMessage;
import com.um.hoteladministration.repository.entities.Customer;
import com.um.hoteladministration.repository.entities.Room;
import com.um.hoteladministration.services.RoomService;
import com.um.hoteladministration.services.mapper.RoomMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping(path = "api/room")
public class RoomController {
    private final RoomService roomService;
    private final RoomMapper roomMapper;

    @Autowired
    public RoomController(RoomService roomService, RoomMapper roomMapper) {
        this.roomService = roomService;
        this.roomMapper = roomMapper;
    }

    @GetMapping(path = {"/{roomId}"})
    public ResponseEntity<RoomMessage> getById(@PathVariable Long roomId) {
        Room room = roomService.getById(roomId);
        RoomMessage roomMessage = roomMapper.toRoomMapper(room);
        return new ResponseEntity<>(roomMessage, HttpStatus.OK);
    }

    @GetMapping(path = {"/hotel/{hotelId}"})
    public ResponseEntity<Set<RoomMessage>> getAllByHotelId(@PathVariable Long hotelId) {
        Set<Room> roomSet = roomService.getAllByHotelId(hotelId);
        Set<RoomMessage> roomMessageSet = roomSet.stream()
                .map(roomMapper::toRoomMapper)
                .collect(Collectors.toSet());
        return new ResponseEntity<>(roomMessageSet, HttpStatus.OK);
    }

    @GetMapping(path = {"/notTaken/{hotelId}"})
    public ResponseEntity<Set<RoomMessage>> getAllByHotelIdNotTaken(@PathVariable Long hotelId) {
        Set<Room> roomSet = roomService.getAllByHotelIdNotTaken(hotelId);
        Set<RoomMessage> roomMessageSet = roomSet.stream()
                .map(roomMapper::toRoomMapper)
                .collect(Collectors.toSet());
        return new ResponseEntity<>(roomMessageSet, HttpStatus.OK);
    }
}
