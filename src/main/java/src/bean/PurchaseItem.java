package src.bean;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * 采购单明细
 * id:
 * name:商品名称
 * purchaseOrderId:关联到采购单ID
 * price:单价
 * count:数量
 */
@Entity
@Table(name = "purchase_item")
@Component
public class PurchaseItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "purchase_item_id")
    private Long id;

    private String name;

    private Long supplierId;
    private Long purchaseOrderId;
    @Column(name = "purchase_price")
    private Double price;
    @Column(name = "purchase_count")
    private Long count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(Long purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }


}
