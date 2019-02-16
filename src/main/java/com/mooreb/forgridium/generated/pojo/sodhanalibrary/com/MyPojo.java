package com.mooreb.forgridium.generated.pojo.sodhanalibrary.com;

public class MyPojo
{
    private String schemaLocation;
    private Feed feed;
    private String id;
    private Link[] link;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {

        return id;
    }
    public Link[] getLink ()
    {
        return link;
    }

    public void setLink (Link[] link)
    {
        this.link = link;
    }

    public Feed getFeed ()
    {
        return feed;
    }

    public void setFeed (Feed feed)
    {
        this.feed = feed;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    public String getSchemaLocation() {

        return schemaLocation;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [feed = "+feed+"]";
    }
}



