package org.sunw.self.admin.category.service;

import java.util.List;

import org.sunw.self.admin.category.domain.CategoryDTO;
import org.sunw.self.admin.category.domain.CategoryVO;

public interface CategoryService {
	
	public int categoryInsert(CategoryDTO dto);
	
	public List<CategoryVO> getCategoryList (CategoryDTO dto);
	
	public int categoryListCnt(CategoryDTO dto);
	
	CategoryDTO getCategoryId(int categoryId);
	
	public int categoryUpdate(CategoryDTO dto);
	
	public int categoryDelete(int categoryId);

}
