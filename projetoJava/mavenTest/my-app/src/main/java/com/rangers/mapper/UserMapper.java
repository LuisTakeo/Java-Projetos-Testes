package com.rangers.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.rangers.dto.UserDTO;
import com.rangers.model.UserModel;

@Mapper
public interface UserMapper {

	@Mapping(target = "code", source = "id")
	@Mapping(target = "userName", source = "name")
	UserModel toModel(final UserDTO dto);

	@Mapping(target = "id", source = "code")
	@Mapping(target = "name", source = "userName")
	UserDTO toDTO(final UserModel model);
}
