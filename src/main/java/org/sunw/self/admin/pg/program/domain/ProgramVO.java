package org.sunw.self.admin.pg.program.domain;

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
	
	Integer pgId;
	Integer categoryId;
	String pgName;
	String pgContent;
	String surgeryArea;
	String pgRunninTime;
	Integer sortSeq;
	String roomType;
	String useYn;
	


}
