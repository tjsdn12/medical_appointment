package org.sunw.self.admin.category.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.sunw.self.admin.category.domain.CategoryDTO;
import org.sunw.self.admin.category.domain.CategoryVO;
import org.sunw.self.admin.category.mapper.CategoryMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

	private final CategoryMapper categoryMapper;
	
	
	@Override
	public int categoryInsert(CategoryDTO dto) {

		return categoryMapper.categoryInsert(dto.getCategoryVO());
	}

	@Override
	public List<CategoryVO> getCategoryList(CategoryDTO dto) {
		
		List<CategoryVO> categoryList =categoryMapper.getCategoryList(dto);
		
		return categoryList;
	}

	@Override
	public int categoryListCnt(CategoryDTO dto) {

		return categoryMapper.categoryListCnt(dto);
	}

	@Override
	public CategoryDTO getCategoryId(int categoryId) {
		
		CategoryDTO dto = new CategoryDTO();
		dto.setCategoryVO(categoryMapper.getCategoryId(categoryId));
		return dto;
	}

	@Override
	public int categoryUpdate(CategoryDTO dto) {

		return categoryMapper.categoryUpdate(dto.getCategoryVO());
	}

	@Override
	public int categoryDelete(int categoryId) {

		return categoryMapper.categoryDelete(categoryId);
	}

}
