package com.elton.app.converter;

import java.util.List;
import java.util.stream.Collectors;

import com.elton.app.dto.CategoryDTO;
import com.elton.app.model.Category;

public class CategoryConverter {

	public static Category fromDTO(final CategoryDTO dto) {
		final Category model = new Category();
		model.setId(dto.getCode());
		model.setDescription(dto.getDescription());
		return model;
	}

	public static CategoryDTO toDTO(final Category model) {
		final CategoryDTO dto = new CategoryDTO();
		dto.setCode(model.getId());
		dto.setDescription(model.getDescription());
		return dto;
	}

	public static List<CategoryDTO> toDTO(final List<Category> listModel) {
		return listModel.stream().map(model -> {
			return toDTO(model);
		}).collect(Collectors.toList());
	}
}