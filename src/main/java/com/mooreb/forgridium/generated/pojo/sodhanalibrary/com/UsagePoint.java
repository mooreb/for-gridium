package com.mooreb.forgridium.generated.pojo.sodhanalibrary.com;

public class UsagePoint
{
    private String xmlns;

    private ServiceCategory ServiceCategory;

    public String getXmlns ()
    {
        return xmlns;
    }

    public void setXmlns (String xmlns)
    {
        this.xmlns = xmlns;
    }

    public ServiceCategory getServiceCategory ()
    {
        return ServiceCategory;
    }

    public void setServiceCategory (ServiceCategory ServiceCategory)
    {
        this.ServiceCategory = ServiceCategory;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [xmlns = "+xmlns+", ServiceCategory = "+ServiceCategory+"]";
    }
}

