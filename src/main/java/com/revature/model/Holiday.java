package com.revature.model;

import java.util.Date;



import lombok.Data;

@Data
public class Holiday {
private Integer id;
private String name;

private Date holidayDate;

private Date holidayYear;

}
