package org.sunw.self.admin.category.domain;

import org.sunw.self.admin.common.domain.DefaultDTO;

import lombok.Data;

@Data
public class CategoryDTO extends DefaultDTO {
	CategoryVO categoryVO;
	
	Integer categoryId;

}
