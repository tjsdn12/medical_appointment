package org.sunw.self.admin.user.manager.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ManageManagerVO {

	String userId;
	String password;
	String name;
	Date birth;
	String sex;
	String phoneNumber;
	String auth;


}
