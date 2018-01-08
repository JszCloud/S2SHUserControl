package cn.name.control.entity;

import org.springframework.stereotype.Component;

/**
 * Created by Nominal on 2018/1/2 0002.
 * 微博：@李明易DY
 */
@Component("page1")
public class Page {
    private Integer sum;

    private Integer pages=1;

    private Integer cut=5;

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public Integer getCut() {
        return cut;
    }

    public void setCut(Integer cut) {
        this.cut = cut;
    }

    public Page() {
    }

    public Page(Integer sum, Integer pages, Integer cut) {

        this.sum = sum;
        this.pages = pages;
        this.cut = cut;
    }

    public Page(Integer pages, Integer cut) {
        this.pages = pages;
        this.cut = cut;
    }

    @Override
    public String toString() {
        return "Page{" +
                "sum=" + sum +
                ", pages=" + pages +
                ", cut=" + cut +
                '}';
    }
}
