package org.sunw.self.admin.user.manager.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
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

	
	public String userId() {
        return userId;
    }
	
	
}


