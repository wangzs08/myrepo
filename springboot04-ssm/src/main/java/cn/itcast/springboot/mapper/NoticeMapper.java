package cn.itcast.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.itcast.springboot.pojo.Notice;

/**
 * NoticeMapper
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年12月22日 下午12:17:27
 * @version 1.0
 */
@Mapper
public interface NoticeMapper {
	
	@Select("select * from notice")
	List<Notice> findAll();

	Long count();

	List<Notice> findByPage(@Param("page")Integer page,
				@Param("rows")Integer rows);
}
