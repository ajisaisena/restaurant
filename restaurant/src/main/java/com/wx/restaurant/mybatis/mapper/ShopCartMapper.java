package com.wx.restaurant.mybatis.mapper;

import com.wx.restaurant.mybatis.model.ShopCart;
import com.wx.restaurant.util.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ShopCartMapper extends MyMapper<ShopCart> {
    @Update("UPDATE `shop_cart` LEFT JOIN dish on shop_cart.dish_id=dish.dish_id SET dish.sales_volume= shop_cart.count+dish.sales_volume WHERE shop_cart.balance_id = #{balanceId}")
    void salesVolumeAdd(@Param("balanceId") Integer balanceId);

    @Select("select * from shop_cart where balance_id =${orderId} order by update_time desc")
    List<ShopCart> shopCartList(@Param("orderId") String orderId);
}