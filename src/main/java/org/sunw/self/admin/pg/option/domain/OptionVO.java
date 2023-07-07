package org.sunw.self.admin.pg.option.domain;

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
public class OptionVO {
	
	
	Integer pgOptionId;
	Integer pgId;
	String pgOptionName;
	String pgOptionContent;
	Integer pgOptionPric;
	


}
