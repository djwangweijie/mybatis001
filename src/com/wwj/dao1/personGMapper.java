package com.wwj.dao1;

import com.wwj.model1.personG;
import com.wwj.model1.personGExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface personGMapper {
    int countByExample(personGExample example);

    int deleteByExample(personGExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(personG record);

    int insertSelective(personG record);

    List<personG> selectByExample(personGExample example);

    personG selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") personG record, @Param("example") personGExample example);

    int updateByExample(@Param("record") personG record, @Param("example") personGExample example);

    int updateByPrimaryKeySelective(personG record);

    int updateByPrimaryKey(personG record);
}