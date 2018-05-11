package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Penny
{
    int year;

    public Penny(int year)
    {
        this.year=year;
    }

    public BigDecimal getFaceValue()
    {
        BigDecimal faceValue =new BigDecimal("0.01");
        return faceValue;
    }

    public BigDecimal getCollectibleValue()
    {
        BigDecimal totalValue=new BigDecimal("0.00");
        if (year<1945)
        {
            BigDecimal age= new BigDecimal(1945-year);
            BigDecimal multiplier= new BigDecimal("0.03");
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
