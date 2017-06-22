package com.engage.backendcodingchallenge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static com.engage.backendcodingchallenge.config.Constants.UK_VAT_PERCENTAGE;

/**
 * Created by alp3 on 21/6/17.
 */
@Entity
public class Expense implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private Double vat;

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private String reason;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
        this.vat = UK_VAT_PERCENTAGE * amount;
    }

    public void setAmount(String amount) {
        setAmount(Double.valueOf(amount.replaceAll(",", ".")));
    }

    public Double getVat() {
        return vat;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDate(String dateStr) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.date = formatter.parse(dateStr);;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
