package com.mooreb.forgridium.generated.pojo.sodhanalibrary.com;

public class Entry2 extends Entry
{
    private Link link;

    private String id;

    private String published;

    private String updated;

    private Content content;

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

    public String getPublished ()
    {
        return published;
    }

    public void setPublished (String published)
    {
        this.published = published;
    }

    public String getUpdated ()
    {
        return updated;
    }

    public void setUpdated (String updated)
    {
        this.updated = updated;
    }

    public Content getContent ()
    {
        return content;
    }

    public void setContent (Content content)
    {
        this.content = content;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [link = "+link+", id = "+id+", published = "+published+", updated = "+updated+", content = "+content+"]";
    }
}

