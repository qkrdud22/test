package com.young.practice.vo;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	private int idx;
	private String subject;
	private String content;
	private Date regDate;
}
