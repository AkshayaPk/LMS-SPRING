package com.revature.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
public class LeavePolicy {
private Integer id;

private Policy policyId;

private Role roleId;

private LeaveType leaveTypeId;

private Integer noOfDays;


}
