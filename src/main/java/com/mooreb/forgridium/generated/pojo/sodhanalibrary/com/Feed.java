package com.mooreb.forgridium.generated.pojo.sodhanalibrary.com;


public class Feed
{
    private Entry[] entry;

    private String xmlns;

    private Link link;

    private String id;

    private Title title;

    private String updated;

    public Entry[] getEntry ()
    {
        return entry;
    }

    public void setEntry (Entry[] entry)
    {
        this.entry = entry;
    }

    public String getXmlns ()
    {
        return xmlns;
    }

    public void setXmlns (String xmlns)
    {
        this.xmlns = xmlns;
    }

    public Link getLink ()
    {
        return link;
    }

    public void setLink (Link link)
    {
        this.link = link;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public Title getTitle ()
    {
        return title;
    }

    public void setTitle (Title title)
    {
        this.title = title;
    }

    public String getUpdated ()
    {
        return updated;
    }

    public void setUpdated (String updated)
    {
        this.updated = updated;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [entry = "+entry+", xmlns = "+xmlns+", link = "+link+", id = "+id+", title = "+title+", updated = "+updated+"]";
    }
}

