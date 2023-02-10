package com.aise.chat.entity;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.Data;

@Data
public class User {
	@Id
	public String id;
	@Column
	public String userName;
}
