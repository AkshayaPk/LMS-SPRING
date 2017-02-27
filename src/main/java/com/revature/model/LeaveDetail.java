package com.revature.model;

import java.util.Date;



import lombok.Data;

@Data
public class LeaveDetail {
private Integer id;

private Employee employeeId;
private LeaveType leaveTypeId;

private Date dateOfLeave;
private String session;

private String reason;

private String status;

}
