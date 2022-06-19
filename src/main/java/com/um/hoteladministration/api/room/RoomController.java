package com.um.hoteladministration.api.room;

import com.um.hoteladministration.repository.entities.Room;
import com.um.hoteladministration.repository.entities.RoomCustomer;
import com.um.hoteladministration.repository.models.RoomCustomerModel;
import com.um.hoteladministration.repository.models.RoomModel;
import com.um.hoteladministration.services.RoomService;
import com.um.hoteladministration.services.mapper.RoomCustomerMapper;
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
    private final RoomCustomerMapper roomCustomerMapper;

    @Autowired
    public RoomController(RoomService roomService, RoomMapper roomMapper, RoomCustomerMapper roomCustomerMapper) {
        this.roomService = roomService;
        this.roomMapper = roomMapper;
        this.roomCustomerMapper = roomCustomerMapper;
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

    @GetMapping(path = {"/hotel/notTaken/{hotelId}"})
    public ResponseEntity<Set<RoomMessage>> getAllByHotelIdNotTaken(@PathVariable Long hotelId) {
        Set<Room> roomSet = roomService.getAllByHotelIdNotTaken(hotelId);
        Set<RoomMessage> roomMessageSet = roomSet.stream()
                .map(roomMapper::toRoomMapper)
                .collect(Collectors.toSet());
        return new ResponseEntity<>(roomMessageSet, HttpStatus.OK);
    }

    @PostMapping(path = "/new", consumes = "application/json", produces = "application/json")
    public ResponseEntity<RoomMessage> newRoom(@RequestBody RoomModel roomModel) {
        Room room = new Room(
                roomModel.getId(),
                roomModel.getHotelId(),
                roomModel.getCapacity(),
                roomModel.getNumber(),
                roomModel.getTaken()
        );
        Room roomSaved = roomService.createNew(room);
        RoomMessage hotelMessage = roomMapper.toRoomMapper(roomSaved);
        return new ResponseEntity<>(hotelMessage, HttpStatus.OK);
    }

    @PostMapping(path = "/addCustomerToRoom", consumes = "application/json", produces = "application/json")
    public ResponseEntity<RoomCustomerMessage> addCustomerToRoom(@RequestBody RoomCustomerModel roomCustomerModel) {
        RoomCustomer roomCustomer = new RoomCustomer(
                roomCustomerModel.getRoomId(),
                roomCustomerModel.getRoomId()
        );
        RoomCustomer roomCustomerSaved = roomService.addCustomerToRoom(roomCustomer);
        RoomCustomerMessage roomCustomerMessage = roomCustomerMapper.toRoomCustomer(roomCustomerSaved);
        return new ResponseEntity<>(roomCustomerMessage, HttpStatus.OK);
    }
}
