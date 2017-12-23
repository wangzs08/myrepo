package cn.itcast.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.springboot.mapper.NoticeMapper;
import cn.itcast.springboot.pojo.Notice;
import cn.itcast.springboot.service.NoticeService;

/**
 * NoticeServiceImpl
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年12月22日 下午12:18:18
 * @version 1.0
 */
@Service
public class NoticeServiceImpl implements NoticeService {
	
	@Autowired
	private NoticeMapper noticeMapper;

	@Override
	public List<Notice> findAll() {
		return noticeMapper.findAll();
	}

	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		// {"total" : 100, "rows" : [{},{}]}
		Map<String,Object> data = new HashMap<>();
		/** 统计查询 */
		Long count = noticeMapper.count();
		data.put("total", count);
		
		/** 分页查询 */
		List<Notice> notices = noticeMapper.findByPage((page - 1) * rows, rows);
		data.put("rows", notices);
		return data;
	}
	
}
