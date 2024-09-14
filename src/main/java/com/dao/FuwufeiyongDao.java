package com.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.entity.FuwufeiyongEntity;
import com.entity.view.FuwufeiyongView;
import com.entity.vo.FuwufeiyongVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 服务费用
 *
 */
public interface FuwufeiyongDao extends BaseMapper<FuwufeiyongEntity> {

	List<FuwufeiyongVO> selectListVO(@Param("ew") Wrapper<FuwufeiyongEntity> wrapper);

	FuwufeiyongVO selectVO(@Param("ew") Wrapper<FuwufeiyongEntity> wrapper);

	List<FuwufeiyongView> selectListView(@Param("ew") Wrapper<FuwufeiyongEntity> wrapper);

	List<FuwufeiyongView> selectListView(Pagination page,@Param("ew") Wrapper<FuwufeiyongEntity> wrapper);

	FuwufeiyongView selectView(@Param("ew") Wrapper<FuwufeiyongEntity> wrapper);

}
