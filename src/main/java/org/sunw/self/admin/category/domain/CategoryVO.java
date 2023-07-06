package org.sunw.self.admin.category.domain;

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
public class CategoryVO {
	
	Integer categoryId;
	Integer categoryLevel;
	String categoryName;
	String useYn;
	Integer upperCategoryId;


}
