package com.entity.view;

import com.entity.FuwufeiyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;


/**
 * 服务费用
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("fuwufeiyong")
public class FuwufeiyongView  extends FuwufeiyongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FuwufeiyongView(){
	}

 	public FuwufeiyongView(FuwufeiyongEntity fuwufeiyongEntity){
 	try {
			BeanUtils.copyProperties(this, fuwufeiyongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
