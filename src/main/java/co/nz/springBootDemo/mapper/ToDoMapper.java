package co.nz.springBootDemo.mapper;

import co.nz.springBootDemo.model.ToDo;
import co.nz.springBootDemo.model.ToDoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToDoMapper {
    long countByExample(ToDoExample example);

    int deleteByExample(ToDoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ToDo record);

    int insertSelective(ToDo record);

    List<ToDo> selectByExampleWithBLOBs(ToDoExample example);

    List<ToDo> selectByExample(ToDoExample example);

    ToDo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ToDo record, @Param("example") ToDoExample example);

    int updateByExampleWithBLOBs(@Param("record") ToDo record, @Param("example") ToDoExample example);

    int updateByExample(@Param("record") ToDo record, @Param("example") ToDoExample example);

    int updateByPrimaryKeySelective(ToDo record);

    int updateByPrimaryKeyWithBLOBs(ToDo record);

    int updateByPrimaryKey(ToDo record);
}