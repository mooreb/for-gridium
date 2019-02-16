package com.mooreb.forgridium.generated.pojo.sodhanalibrary.com;

public class IntervalBlock
{
    private String xmlns;

    private IntervalReading[] IntervalReading;

    private Interval interval;

    public String getXmlns ()
    {
        return xmlns;
    }

    public void setXmlns (String xmlns)
    {
        this.xmlns = xmlns;
    }

    public IntervalReading[] getIntervalReading ()
    {
        return IntervalReading;
    }

    public void setIntervalReading (IntervalReading[] IntervalReading)
    {
        this.IntervalReading = IntervalReading;
    }

    public Interval getInterval ()
    {
        return interval;
    }

    public void setInterval (Interval interval)
    {
        this.interval = interval;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [xmlns = "+xmlns+", IntervalReading = "+IntervalReading+", interval = "+interval+"]";
    }
}

