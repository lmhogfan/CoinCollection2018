package com.arkansascodingacademy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CoinCollection
{
    private List<Penny> pennies = new ArrayList<>();
    private List<Nickel> nickels = new ArrayList<>();
    private List<Dime> dimes = new ArrayList<>();
    private List<Quarter> quarters = new ArrayList<>();
    private List<Ones> washingtons= new ArrayList<>();
    private List<Fives> lincolns=new ArrayList<>();
    private List<Tens> hamiltons=new ArrayList<>();
    private List<Twenties> jacksons=new ArrayList<>();
    private List<Hundreds> franklins=new ArrayList<>();


    public CoinCollection(int quarterCount, int dimeCount, int nickelCount, int pennyCount,
                          int onesCount, int fivesCount,int tensCount, int twentiesCount, int hundredsCount)
    {
        for(int x=0; x<pennyCount; x++)
        {
            Penny penny = new Penny(2000);
            pennies.add(penny);
        }
        for(int y=0; y<nickelCount; y++)
        {
            Nickel nickel = new Nickel(2000);
            nickels.add(nickel);
        }
        for(int z=0; z<dimeCount; z++)
        {
            Dime dime = new Dime(2000);
            dimes.add(dime);
        }
        for(int a=0; a<quarterCount; a++)
        {
            Quarter quarter = new Quarter(2000);
            quarters.add(quarter);
        }
        for(int b=0; b<onesCount; b++)
        {
            Ones ones = new Ones(2000,11111);
            washingtons.add(ones);
        }
        for(int c=0; c<fivesCount; c++)
        {
            Fives fives = new Fives(2000,11111);
            lincolns.add(fives);
        }
        for(int d=0; d<tensCount; d++)
        {
            Tens tens = new Tens(2000,11111);
            hamiltons.add(tens);
        }
        for(int e=0; e<twentiesCount; e++)
        {
            Twenties twenties = new Twenties(2000,11111);
            jacksons.add(twenties);
        }
        for(int f=0; f<hundredsCount; f++)
        {
            Hundreds hundreds = new Hundreds(2000,11111);
            franklins.add(hundreds);
        }
    }

    public void addPenny(int year)
    {
        Penny penny= new Penny(year);
        pennies.add(penny);
    }

    public void addNickel(int year)
    {
        Nickel nickel=new Nickel(year);
        nickels.add(nickel);
    }

    public void addDime(int year)
    {
        Dime dime=new Dime(year);
        dimes.add(dime);
    }

    public void addQuarter(int year)
    {
        Quarter quarter=new Quarter(year);
        quarters.add(quarter);
    }
    public void addOne(int year, int serialNumber)
    {
        Ones ones= new Ones(year, serialNumber);
        washingtons.add(ones);
    }
    public void addFive(int year, int serialNumber)
    {
        Fives fives= new Fives(year,serialNumber);
        lincolns.add(fives);
    }
    public void addTen(int year,int serialNumber)
    {
        Tens tens= new Tens(year,serialNumber);
        hamiltons.add(tens);
    }
    public void addTwenty(int year,int serialNumber)
    {
        Twenties twenties= new Twenties(year,serialNumber);
        jacksons.add(twenties);
    }
    public void addHundred(int year, int serialNumber)
    {
        Hundreds hundreds= new Hundreds(year,serialNumber);
        franklins.add(hundreds);
    }
    public BigDecimal getPenniesFaceValue( )
    {
        return getFaceValue(pennies);
    }
    public BigDecimal getNickelsFaceValue( )
    {
        return getFaceValue(nickels);
    }
    public BigDecimal getDimesFaceValue( )
    {
        return getFaceValue(dimes);
    }
    public BigDecimal getQuartersFaceValue( )
    {
        return getFaceValue(quarters);
    }
    public BigDecimal getOnesFaceValue( )
    {
        BigDecimal totalFaceValue = new BigDecimal("0.00");
        for (Ones eachOne : washingtons)
        {
            totalFaceValue = totalFaceValue.add(eachOne.getFaceValue());
        }
        return totalFaceValue;
    }
    public BigDecimal getFivesFaceValue( )
    {
        BigDecimal totalFaceValue = new BigDecimal("0.00");
        for (Fives eachFive : lincolns)
        {
            totalFaceValue = totalFaceValue.add(eachFive.getFaceValue());
        }
        return totalFaceValue;
    }
    public BigDecimal getTensFaceValue( )
    {
        BigDecimal totalFaceValue = new BigDecimal("0.00");
        for (Tens eachTen : hamiltons)
        {
            totalFaceValue = totalFaceValue.add(eachTen.getFaceValue());
        }
        return totalFaceValue;
    }
    public BigDecimal getTwentiesFaceValue( )
    {
        BigDecimal totalFaceValue = new BigDecimal("0.00");
        for (Twenties eachTwenty : jacksons)
        {
            totalFaceValue = totalFaceValue.add(eachTwenty.getFaceValue());
        }
        return totalFaceValue;
    }
    public BigDecimal getHundredsFaceValue( )
    {
        BigDecimal totalFaceValue = new BigDecimal("0.00");
        for (Hundreds eachHundred : franklins)
        {
            totalFaceValue = totalFaceValue.add(eachHundred.getFaceValue());
        }
        return totalFaceValue;
    }

    public BigDecimal getPenniesCollectibleValue( )
    {
        return getCollectibleValue(pennies);
    }
    public BigDecimal getNickelsCollectibleValue( )
    {
        return getCollectibleValue(nickels);
    }
    public BigDecimal getDimesCollectibleValue( )
    {
        return getCollectibleValue(dimes);
    }
    public BigDecimal getQuartersCollectibleValue( )
    {
        return getCollectibleValue(quarters);
    }
    public BigDecimal getOnesCollectibleValue( )
    {
        BigDecimal totalCollectibleValue= new BigDecimal("0.00");
        for(Ones eachOne:washingtons)
        {
            totalCollectibleValue=totalCollectibleValue.add(eachOne.getCollectibleValue());
        }
        return totalCollectibleValue.setScale(2);
    }
    public BigDecimal getFivesCollectibleValue( )
    {
        BigDecimal totalCollectibleValue= new BigDecimal("0.00");
        for(Fives eachFive:lincolns)
        {
            totalCollectibleValue=totalCollectibleValue.add(eachFive.getCollectibleValue());
        }
        return totalCollectibleValue.setScale(2);
    }

    public BigDecimal getTensCollectibleValue( )
    {
        BigDecimal totalCollectibleValue= new BigDecimal("0.00");
        for(Tens eachTen:hamiltons)
        {
            totalCollectibleValue=totalCollectibleValue.add(eachTen.getCollectibleValue());
        }
        return totalCollectibleValue.setScale(2);
    }

    public BigDecimal getTwentiesCollectibleValue( )
    {
        BigDecimal totalCollectibleValue= new BigDecimal("0.00");
        for(Twenties eachTwenty:jacksons)
        {
            totalCollectibleValue=totalCollectibleValue.add(eachTwenty.getCollectibleValue());
        }
        return totalCollectibleValue.setScale(2);
    }
    public BigDecimal getHundredsCollectibleValue( )
    {
        BigDecimal totalCollectibleValue= new BigDecimal("0.00");
        for(Hundreds eachHundred:franklins)
        {
            totalCollectibleValue=totalCollectibleValue.add(eachHundred.getCollectibleValue());
        }
        return totalCollectibleValue.setScale(2);
    }
    public BigDecimal getTotalCollectibleValue()
    {
        return getPenniesCollectibleValue().add(getNickelsCollectibleValue()
                .add(getDimesCollectibleValue().add(getQuartersCollectibleValue()
                        .add(getOnesCollectibleValue().add(getFivesCollectibleValue()
                                .add(getTensCollectibleValue().add(getTwentiesCollectibleValue()
                                        .add(getHundredsCollectibleValue()))))))));
    }
    public BigDecimal getTotalFaceValue()
    {
        return getPenniesFaceValue().add(getNickelsFaceValue()
                .add(getDimesFaceValue().add(getQuartersFaceValue()
                .add(getOnesFaceValue().add(getFivesFaceValue().add(getTensFaceValue()
                .add(getTwentiesFaceValue().add(getHundredsFaceValue()))))))));

    }
    private BigDecimal getFaceValue(Collection<? extends ICurrency> sum)
    {
        BigDecimal total= new BigDecimal("0.00");
       for (ICurrency value:sum)
       {
           total=total.add(value.getFaceValue());
       }
       return total;
    }
    private BigDecimal getCollectibleValue(Collection<? extends ICurrency> sum)
    {
        BigDecimal total= new BigDecimal("0.00");
        for (ICurrency value:sum)
        {
            total=total.add(value.getCollectibleValue());
        }
        return total;
    }
    public boolean existingSerialOnes(int year, int serialNumber)
    {
        boolean result=false;
        for (Ones ones:washingtons)
        {
            if(ones.serialNumber==serialNumber)
            {
                result=true;
            }
            else
            {
                result=false;
            }
        }
        return result;
    }
    public boolean existingSerialFives(int year, int serialNumber)
    {
        boolean result=false;
        for (Fives fives:lincolns)
        {
            if(fives.serialNumber==serialNumber)
            {
                result=true;
            }
            else
            {
                result=false;
            }
        }
        return result;
    }
    public boolean existingSerialTens(int year, int serialNumber)
    {
        boolean result=false;
        for (Tens tens:hamiltons)
        {
            if(tens.serialNumber==serialNumber)
            {
                result=true;
            }
            else
            {
                result=false;
            }
        }
        return result;
    }
    public boolean existingSerialTwenties(int year, int serialNumber)
    {
        boolean result=false;
        for (Twenties twenties:jacksons)
        {
         if(twenties.serialNumber==serialNumber)
         {
             result=true;
         }
         else
         {
             result=false;
         }
        }
        return result;
    }
    public boolean existingSerialHundreds(int year, int serialNumber)
    {
        boolean result=false;
        for (Hundreds hundreds:franklins)
        {
            if(hundreds.serialNumber==serialNumber)
            {
                result=true;
            }
            else
            {
                result=false;
            }
        }
        return result;
    }
}
