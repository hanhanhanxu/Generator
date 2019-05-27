package hx.insist.mapper;

import hx.insist.pojo.Orderitems;
import hx.insist.pojo.OrderitemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderitemsMapper {
    int countByExample(OrderitemsExample example);

    int deleteByExample(OrderitemsExample example);

    int deleteByPrimaryKey(String osid);

    int insert(Orderitems record);

    int insertSelective(Orderitems record);

    List<Orderitems> selectByExample(OrderitemsExample example);

    Orderitems selectByPrimaryKey(String osid);

    int updateByExampleSelective(@Param("record") Orderitems record, @Param("example") OrderitemsExample example);

    int updateByExample(@Param("record") Orderitems record, @Param("example") OrderitemsExample example);

    int updateByPrimaryKeySelective(Orderitems record);

    int updateByPrimaryKey(Orderitems record);
}