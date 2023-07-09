package org.sunw.self.admin.history.domain;

import org.sunw.self.admin.common.domain.DefaultDTO;

import lombok.Data;

@Data
public class HistoryDTO extends DefaultDTO{
	
	HistoryVO historyVO;
	
	Integer apId;

}
