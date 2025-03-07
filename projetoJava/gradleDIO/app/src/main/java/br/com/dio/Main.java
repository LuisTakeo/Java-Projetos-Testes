package br.com.dio;

import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import br.com.dio.dto.UserDTO;
import br.com.dio.mapper.UserMapper;
import br.com.dio.model.UserModel;

public class Main {

	private static final
		UserMapper mapper = Mappers.getMapper(UserMapper.class);
	public static void main(String[] args) {
		System.out.println("Hello World!");

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
