package org.sunw.self.admin.common.login.domain;

import java.util.Date;

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
public class LoginVO {

	String userId;
	String password;
	String name;
	Date birth;
	String sex;
	String phonNumber;
	String auth;
	
}