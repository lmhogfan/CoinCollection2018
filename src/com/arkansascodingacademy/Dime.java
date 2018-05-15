package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Dime extends Coin implements ICurrency
{

    public Dime(int year)
    {
        super(year);
    }
    public BigDecimal getFaceValue()
    {
        BigDecimal faceValue =new BigDecimal("0.10");
        return faceValue;
    }
    public BigDecimal getCollectibleValue()
    {
        return getFaceValue();
    }
    public String getName()
    {
        return "Dime";
    }
}
