package src.bean;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

/**
 * 采购订单表
 * id：采购订单ID
 * suppliersId:采购商ID
 * pay:支付方式
 * inDate:采购时间
 * total:总金额
 */
@Entity
@Table(name = "purchase_order")
@Component
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "purchase_order_id")
    private Long id;

    private Long suppliersId;
    @Column(name = "purchase_order_pay")
    private String pay;
    private Date inDate;
    @Column(name = "purchase_order_total")
    private Double total;
    private String flag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSuppliersId() {
        return suppliersId;
    }

    public void setSuppliersId(Long suppliersId) {
        this.suppliersId = suppliersId;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }


}
