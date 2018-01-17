package cn.name.control.entity;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;

/**
 * Created by Nominal on 2018/1/17 0017.
 * 微博：@李明易DY
 */
public class Chart {
    private Integer man=0;
    private Integer woman=0;

    public Chart() {
    }

    public Chart(Integer man, Integer woman) {
        this.man = man;
        this.woman = woman;
    }

    public Integer getMan() {
        return man;
    }

    public void setMan(Integer man) {
        this.man = man;
    }

    public Integer getWoman() {
        return woman;
    }

    public void setWoman(Integer woman) {
        this.woman = woman;
    }
}
