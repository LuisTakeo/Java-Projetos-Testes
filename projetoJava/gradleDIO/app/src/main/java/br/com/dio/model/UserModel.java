package br.com.dio.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class UserModel {
	private int code;
	private String userName;
	private java.time.LocalDate birthDate;
}

