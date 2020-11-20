package org.codejudge.sb.controller;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ans {
    private int sum;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
