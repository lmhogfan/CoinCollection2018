package com.arkansascodingacademy;

import java.math.BigDecimal;

public class Tens
{
    int year;
    int serialNumber;

    public Tens(int year, int serialNumber)
    {
        this.year=year;
        this.serialNumber=serialNumber;
    }
    public BigDecimal getFaceValue()
    {
        BigDecimal faceValue =new BigDecimal("10.00");
        return faceValue;
    }

    public BigDecimal getCollectibleValue()
    {
        BigDecimal totalValue = new BigDecimal("0.00");
        if (serialNumber < 1000)
        {
            BigDecimal multiplier = new BigDecimal("10.00");
            BigDecimal addedValue = getFaceValue().multiply(multiplier);
            totalValue = addedValue;
        } else
        {
            totalValue = getFaceValue();
        }
        return totalValue;
    }
}
