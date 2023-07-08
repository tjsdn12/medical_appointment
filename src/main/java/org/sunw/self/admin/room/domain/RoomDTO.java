package org.sunw.self.admin.room.domain;

import org.sunw.self.admin.common.domain.DefaultDTO;

import lombok.Data;

@Data
public class RoomDTO extends DefaultDTO{
	
	RoomVO roomVO;
	
	Integer pgRoomId;

}
