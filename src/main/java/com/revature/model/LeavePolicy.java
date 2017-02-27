package com.revature.model;



import lombok.Data;

@Data
public class LeavePolicy {
private Integer id;

private Policy policyId;

private Role roleId;

private LeaveType leaveTypeId;

private Integer noOfDays;


}
