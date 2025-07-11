package com.hmall.trade.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;


@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("order_detail")
public class OrderDetail implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 订单详情id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long businessId;
    /**
     * 订单id
     */
    private Long orderId;
    /**
     * 商品id
     */
    private Long itemId;
    /**
     * 购买数量
     */
    private Integer num;
    /**
     * 商品标题
     */
    private String name;
    /**
     * 商品动态属性键值集
     */
    private String spec;
    /**
     * 价格,单位：分
     */
    private Integer price;
    /**
     * 商品图片
     */
    private String image;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}
