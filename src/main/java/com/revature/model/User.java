package com.revature.model;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data

public class User {
private Integer id;
private String emailId;

private String password;

private String activationCode;

private Boolean isActive;
private LocalDateTime lastLogin;
}
