package com.mooreb.forgridium.generated.pojo.sodhanalibrary.com;


public class IntervalReading
{
    private TimePeriod timePeriod;

    private String value;

    public TimePeriod getTimePeriod ()
    {
        return timePeriod;
    }

    public void setTimePeriod (TimePeriod timePeriod)
    {
        this.timePeriod = timePeriod;
    }

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [timePeriod = "+timePeriod+", value = "+value+"]";
    }
}

