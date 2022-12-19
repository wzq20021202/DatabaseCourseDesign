package src.bean;


import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * 库存
 * id:库存ID
 * goodsId:商品ID
 * count:商品库存数量
 * area:存放地方
 */
@Entity
@Table(name = "stock")
@Component
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stock_id")
    private Long id;
    @JoinColumn(name = "goods_id")
    private Long goodsId;
    @Column(name = "stock_count")
    private Long counts;
    @Column(name = "stock_area")
    private String area;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getCounts() {
        return counts;
    }

    public void setCounts(Long counts) {
        this.counts = counts;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


}
