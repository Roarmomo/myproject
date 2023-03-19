//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.roarmomo.domain;

import java.io.Serializable;

public class RoarmomoBFO implements Serializable {
    private String Name;
    private String Month;
    private String Year;
    private String Incomepre;
    private String Incomeafter;
    private String Fundsum;
    private String Medicalinsurancesum;
    private String Tax;
    private String Taxsum;

    public RoarmomoBFO() {
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getMonth() {
        return this.Month;
    }

    public void setMonth(String month) {
        this.Month = month;
    }

    public String getYear() {
        return this.Year;
    }

    public void setYear(String year) {
        this.Year = year;
    }

    public String getIncomepre() {
        return this.Incomepre;
    }

    public void setIncomepre(String incomepre) {
        this.Incomepre = incomepre;
    }

    public String getIncomeafter() {
        return this.Incomeafter;
    }

    public void setIncomeafter(String incomeafter) {
        this.Incomeafter = incomeafter;
    }

    public String getFundsum() {
        return this.Fundsum;
    }

    public void setFundsum(String fundsum) {
        this.Fundsum = fundsum;
    }

    public String getMedicalinsurancesum() {
        return this.Medicalinsurancesum;
    }

    public void setMedicalinsurancesum(String medicalinsurancesum) {
        this.Medicalinsurancesum = medicalinsurancesum;
    }

    public String getTax() {
        return this.Tax;
    }

    public void setTax(String tax) {
        this.Tax = tax;
    }

    public String getTaxsum() {
        return this.Taxsum;
    }

    public void setTaxsum(String taxsum) {
        this.Taxsum = taxsum;
    }

    public String toString() {
        return "Roarmomo{Name='" + this.Name + "', Month='" + this.Month + "', Year='" + this.Year + "', Incomepre='" + this.Incomepre + "', Incomeafter='" + this.Incomeafter + "', Fundsum='" + this.Fundsum + "', Medicalinsurancesum='" + this.Medicalinsurancesum + "', Tax='" + this.Tax + "', Taxsum='" + this.Taxsum + "'}";
    }
}
