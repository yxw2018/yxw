package com.framework.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

import com.framework.entity.Emp;

@Mapper
@CacheConfig(cacheNames = "users")
public interface EmpMapper {

	@Select("select empId,empname,loginname,pswd from base_emp where empId = #{empId}")
	@Cacheable(key ="#p0") 
//	@Cacheable将查询结果缓存到redis中，（key="#p0"）指定传入的第一个参数作为redis的key。
//	　　@CachePut，指定key，将更新的结果同步到redis中
//	　　@CacheEvict，指定key，删除缓存数据，allEntries=true,方法调用后将立即清除缓存
	public Emp getById(Long empId);
	
	//@Options(useGeneratedKeys = true, keyProperty = "id")
	@Insert("insert into base_emp(empId,empname,loginname,pswd) values(#{#{empId},#{empname},#{loginname},#{pswd})")
	public int insertDept(Emp emp);

	public List<Emp> list();
	
}
