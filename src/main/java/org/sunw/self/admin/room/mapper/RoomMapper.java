package org.sunw.self.admin.room.mapper;

import java.util.List;

import org.sunw.self.admin.room.domain.RoomDTO;
import org.sunw.self.admin.room.domain.RoomVO;

public interface RoomMapper {
	
	public int roomInsert(RoomVO roomVO);
	
	public List<RoomVO> getAllRoom(RoomDTO dto);
	
	public int getRoomListCnt(RoomDTO dto);
	
	RoomVO selectOneRoom(Integer pgRoomId);
	
	public int getRoomCnt();
	
	public int update(RoomVO roomVO);
	
	public int delete(Integer pgRoomId);
	

}
