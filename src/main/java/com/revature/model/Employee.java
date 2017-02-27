package com.revature.model;

import java.util.Date;



import lombok.Data;

@Data
public class Employee {
private Integer id;

private User userId;
private String name;

private String gender;

private Role roleId;

private Integer managerId;

private Department departmentId;

private Date joiningDate;

private Date releavingDate;

private String releavingReason;


}
