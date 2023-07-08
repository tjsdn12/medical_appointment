package org.sunw.self.admin.room.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.sunw.self.admin.room.domain.RoomDTO;
import org.sunw.self.admin.room.domain.RoomVO;
import org.sunw.self.admin.room.mapper.RoomMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {
	
	
	private RoomMapper roomMapper;
	
	
	@Override
	public int roomInsert(RoomDTO dto) {

		return roomMapper.roomInsert(dto.getRoomVO());
	}

	@Override
	public List<RoomVO> getAllRoom(RoomDTO dto) {
		List<RoomVO>list= roomMapper.getAllRoom(dto);
		return list;
	}

	@Override
	public int getRoomListCnt(RoomDTO dto) {

		return roomMapper.getRoomCnt();
	}

	@Override
	public RoomDTO selectOneRoom(Integer pgRoomId) {
		RoomDTO roomDto = new RoomDTO();
		roomDto.setRoomVO(roomMapper.selectOneRoom(pgRoomId));
		return roomDto;
	}

	@Override
	public int getRoomCnt() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(RoomDTO dto) {

		return roomMapper.update(dto.getRoomVO());
	}

	@Override
	public int delete(Integer pgRoomId) {

		return roomMapper.delete(pgRoomId);
	}

}
