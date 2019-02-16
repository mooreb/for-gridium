package com.mooreb.forgridium.generated.pojo.sodhanalibrary.com;


public class Content2 extends Content {
    private MeterReading MeterReading;

    private String type;

    public MeterReading getMeterReading ()
    {
        return MeterReading;
    }

    public void setMeterReading (MeterReading MeterReading)
    {
        this.MeterReading = MeterReading;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [MeterReading = "+MeterReading+", type = "+type+"]";
    }
}
