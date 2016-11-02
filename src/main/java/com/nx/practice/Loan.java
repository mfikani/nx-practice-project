package com.nx.practice;

import java.io.Serializable;
import java.util.Date;

/**
 * @author mhachem on 11/1/2016.
 */
public class Loan implements Serializable, Comparable<Loan>, Cloneable {

    private long id;
    private double principle;
    private Date date;

    public Loan(long id, double principle, Date date) {
        this.id = id;
        this.principle = principle;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrinciple() {
        return principle;
    }

    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Loan loan = (Loan) o;

        if (id != loan.id) return false;
        if (Double.compare(loan.principle, principle) != 0) return false;
        return date != null ? date.equals(loan.date) : loan.date == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        temp = Double.doubleToLongBits(principle);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", principle=" + principle +
                ", date=" + date +
                '}';
    }

    @Override
    public int compareTo(Loan o) {
        return 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
