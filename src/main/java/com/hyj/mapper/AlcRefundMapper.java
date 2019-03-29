package com.hyj.mapper;

import java.util.List;
import java.util.Map;

import com.hyj.entity.AlcRefund;
import org.apache.ibatis.annotations.Param;

public interface AlcRefundMapper{
    /**
     * 通过订单号获取退费数据
     * @param order_id
     * @return
     */
    AlcRefund geTppRefundByOrder_id(@Param("order_id") String order_id);
    List<AlcRefund> geTppRefundsByOrder_id(@Param("order_id") String order_id);
    
    /**
     * 通过订单号获取退费数据（返回Map）
     * @param order_id
     * @return
     */
    Map<String, String> geTppRefundForMapByOrder_id(@Param("order_id") String order_id);
    
    
}