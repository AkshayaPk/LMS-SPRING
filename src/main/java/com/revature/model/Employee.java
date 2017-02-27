package com.revature.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
