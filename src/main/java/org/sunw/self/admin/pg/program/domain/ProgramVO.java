package org.sunw.self.admin.pg.program.domain;

import java.util.HashMap;
import java.util.Map;

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
public class ProgramVO {
	 
	private final static Map<String, String> roomTypeNames  =new HashMap<String, String>();
	static {
		roomTypeNames.put("A", "관리실");
		roomTypeNames.put("B", "치료실");
		roomTypeNames.put("C", "시술실");
	}
	
	
	Integer pgId;
	Integer categoryId;
	String pgName;
	String pgContent;
	String surgeryArea;
	String pgRunninTime;
	Integer sortSeq;
	String roomType;
	String useYn;
	
	public String getRoomTypeName() {
		return roomTypeNames.get(roomType);
	}

	
	
}
