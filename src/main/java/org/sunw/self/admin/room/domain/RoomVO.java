package org.sunw.self.admin.room.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RoomVO {

	Integer pgRoomId;
	String pgRoomName;
	String useYn; 
	String roomType;


}
