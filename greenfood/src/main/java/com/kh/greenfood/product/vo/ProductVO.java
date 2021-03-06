package com.kh.greenfood.product.vo;

import java.sql.Timestamp;

import com.kh.greenfood.board.vo.Board_ReviewVO;

import lombok.Data;
@Data
public class ProductVO {
	private long pnum;				//상품번호
	private String pname;			//상품명
	private int price;				//가격
	private Timestamp pcdate;	//등록일
	private Timestamp pudate;	//수정일
}
