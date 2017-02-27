package com.revature.model;


import java.time.LocalDateTime;


import lombok.Data;

@Data

public class User {
private Integer id;
private Integer empId;
private String emailId;

private String password;

private String activationCode;

private Boolean isActive;
private LocalDateTime lastLogin;
}
