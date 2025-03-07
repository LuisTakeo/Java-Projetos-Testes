package com.rangers.app;

import org.mapstruct.factory.Mappers;

import com.rangers.dto.UserDTO;
import com.rangers.mapper.UserMapper;
import com.rangers.model.UserModel;

/**
 * Hello world!
 */
public class App {
    // public static void main(String[] args) {
    //     System.out.println("Hello World!");
    // }

    private final static UserMapper mapper = Mappers.getMapper(UserMapper.class);
    public static void main(String[] args) {
        var dto = new UserDTO();
        dto.setId(1);
        dto.setName("John Doe");
        dto.setBirthDate(java.time.LocalDate.of(2000, 1, 1));
        System.out.println("Imprimindo DTO" + dto);
        System.out.println("Imprimindo DTO como Model" + mapper.toModel(dto));


        var model = new UserModel();
        model.setCode(1);
        model.setUserName("John Doe");
        model.setBirthDate(java.time.LocalDate.of(2000, 1, 1));
        System.out.println("Imprimindo Model" + model);
        System.out.println("Imprimindo Model como DTO" + mapper.toDTO(model));
    }
}
