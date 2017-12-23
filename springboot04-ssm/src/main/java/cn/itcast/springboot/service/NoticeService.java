package cn.itcast.springboot.service;

import java.util.List;
import java.util.Map;

import cn.itcast.springboot.pojo.Notice;

/**
 * NoticeService
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年12月22日 下午12:18:01
 * @version 1.0
 */
public interface NoticeService {
	
	List<Notice> findAll();
	
	Map<String, Object> findByPage(Integer page, Integer rows);
}
