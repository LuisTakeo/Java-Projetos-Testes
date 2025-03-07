package com.rangers.mapper;

import com.rangers.dto.UserDTO;
import com.rangers.model.UserModel;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-03-07T01:41:36-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.6 (Amazon.com Inc.)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserModel toModel(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        UserModel userModel = new UserModel();

        userModel.setCode( dto.getId() );
        userModel.setUserName( dto.getName() );
        userModel.setBirthDate( dto.getBirthDate() );

        return userModel;
    }

    @Override
    public UserDTO toDTO(UserModel model) {
        if ( model == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( model.getCode() );
        userDTO.setName( model.getUserName() );
        userDTO.setBirthDate( model.getBirthDate() );

        return userDTO;
    }
}
