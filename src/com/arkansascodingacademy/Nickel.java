package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Nickel
{
    int year;

    public Nickel(int year)
    {
        this.year=year;
    }
    public BigDecimal getFaceValue()
    {
        BigDecimal faceValue =new BigDecimal("0.05");
        return faceValue;
    }
    public BigDecimal getCollectibleValue()
    {
        BigDecimal totalValue=new BigDecimal("0.00");
        if (year<1935)
        {
            BigDecimal age= new BigDecimal(1935-year);
            BigDecimal multiplier= new BigDecimal("0.10");
            BigDecimal addedValue =age.multiply(multiplier);
            totalValue= addedValue.add(getFaceValue());
        }
        else
        {
            totalValue=getFaceValue();
        }
        return totalValue;
    }
}
