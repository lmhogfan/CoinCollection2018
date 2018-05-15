package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Nickel extends Coin implements ICurrency
{

    public Nickel(int year)
    {
        super(year);
    }
    public BigDecimal getFaceValue()
    {
        BigDecimal faceValue =new BigDecimal("0.05");
        return faceValue;
    }
    public BigDecimal getCollectibleValue()
    {
        BigDecimal totalValue=new BigDecimal("0.00");
        if (getYear()<1935)
        {
            BigDecimal age= new BigDecimal(1935-getYear());
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
    public String getName()
    {
        return "Nickel";
    }
}
