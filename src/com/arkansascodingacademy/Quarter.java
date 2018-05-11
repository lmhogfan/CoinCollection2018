package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Quarter
{
    int year;

    public Quarter(int year)
    {
        this.year=year;
    }
    public BigDecimal getFaceValue()
    {
        BigDecimal faceValue =new BigDecimal("0.25");
        return faceValue;
    }
    public BigDecimal getCollectibleValue()
    {
        BigDecimal totalValue=new BigDecimal("0.00");
        if (year<1923)
        {
            BigDecimal age= new BigDecimal(1923-year);
            BigDecimal multiplier= new BigDecimal("0.22");
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
