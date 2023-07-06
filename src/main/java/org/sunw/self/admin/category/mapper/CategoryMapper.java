package org.sunw.self.admin.category.mapper;

import java.util.List;

import org.sunw.self.admin.category.domain.CategoryDTO;
import org.sunw.self.admin.category.domain.CategoryVO;

public interface CategoryMapper {
	
	public int categoryInsert(CategoryVO categoryVO);
	
	public List<CategoryVO> getCategoryList (CategoryDTO dto);
	
	public int categoryListCnt(CategoryDTO dto);
	
	CategoryVO getCategoryId(int categoryId);
	
	public int categoryUpdate(CategoryVO categoryVO);
	
	public int categoryDelete(int categoryId);

}
