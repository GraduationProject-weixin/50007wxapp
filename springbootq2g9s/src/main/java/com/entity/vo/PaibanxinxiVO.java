package com.entity.vo;

import com.entity.PaibanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 排班信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-19 23:25:04
 */
public class PaibanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 医生姓名
	 */
	
	private String yishengxingming;
		
	/**
	 * 排班时间
	 */
	
	private String paibanshijian;
		
	/**
	 * 排班内容
	 */
	
	private String paibanneirong;
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：医生姓名
	 */
	 
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
				
	
	/**
	 * 设置：排班时间
	 */
	 
	public void setPaibanshijian(String paibanshijian) {
		this.paibanshijian = paibanshijian;
	}
	
	/**
	 * 获取：排班时间
	 */
	public String getPaibanshijian() {
		return paibanshijian;
	}
				
	
	/**
	 * 设置：排班内容
	 */
	 
	public void setPaibanneirong(String paibanneirong) {
		this.paibanneirong = paibanneirong;
	}
	
	/**
	 * 获取：排班内容
	 */
	public String getPaibanneirong() {
		return paibanneirong;
	}
			
}
