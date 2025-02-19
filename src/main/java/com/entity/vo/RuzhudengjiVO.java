package com.entity.vo;

import com.entity.RuzhudengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;


/**
 * 入住登记
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
public class RuzhudengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * 客房名称
	 */

	private String kefangmingcheng;

	/**
	 * 客房类型
	 */

	private String kefangleixing;

	/**
	 * 房间号
	 */

	private String fangjianhao;

	/**
	 * 用户账号
	 */

	private String yonghuzhanghao;

	/**
	 * 用户姓名
	 */

	private String yonghuxingming;

	/**
	 * 联系电话
	 */

	private String lianxidianhua;

	/**
	 * 登记时间
	 */

	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date dengjishijian;

	/**
	 * 押金
	 */

	private String yajin;

	/**
	 * 备注
	 */

	private String beizhu;

	/**
	 * 是否支付
	 */

	private String ispay;


	/**
	 * 设置：客房名称
	 */

	public void setKefangmingcheng(String kefangmingcheng) {
		this.kefangmingcheng = kefangmingcheng;
	}

	/**
	 * 获取：客房名称
	 */
	public String getKefangmingcheng() {
		return kefangmingcheng;
	}


	/**
	 * 设置：客房类型
	 */

	public void setKefangleixing(String kefangleixing) {
		this.kefangleixing = kefangleixing;
	}

	/**
	 * 获取：客房类型
	 */
	public String getKefangleixing() {
		return kefangleixing;
	}


	/**
	 * 设置：房间号
	 */

	public void setFangjianhao(String fangjianhao) {
		this.fangjianhao = fangjianhao;
	}

	/**
	 * 获取：房间号
	 */
	public String getFangjianhao() {
		return fangjianhao;
	}


	/**
	 * 设置：用户账号
	 */

	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}

	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}


	/**
	 * 设置：用户姓名
	 */

	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}

	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}


	/**
	 * 设置：联系电话
	 */

	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}

	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}


	/**
	 * 设置：登记时间
	 */

	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}

	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}


	/**
	 * 设置：押金
	 */

	public void setYajin(String yajin) {
		this.yajin = yajin;
	}

	/**
	 * 获取：押金
	 */
	public String getYajin() {
		return yajin;
	}


	/**
	 * 设置：备注
	 */

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}


	/**
	 * 设置：是否支付
	 */

	public void setIspay(String ispay) {
		this.ispay = ispay;
	}

	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
