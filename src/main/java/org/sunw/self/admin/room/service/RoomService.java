package org.sunw.self.admin.room.service;

import java.util.List;

import org.sunw.self.admin.room.domain.RoomDTO;
import org.sunw.self.admin.room.domain.RoomVO;

public interface RoomService {

	public int roomInsert(RoomDTO dto);
	
	public List<RoomVO> getAllRoom(RoomDTO dto);
	
	public int getRoomListCnt(RoomDTO dto);
	
	RoomDTO selectOneRoom(Integer pgRoomId);
	
	public int getRoomCnt();
	
	public int update(RoomDTO dto);
	
	public int delete(Integer pgRoomId);
	
	
}
