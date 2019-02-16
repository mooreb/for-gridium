package com.mooreb.forgridium.pge;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.mooreb.forgridium.generated.pojo.sodhanalibrary.com.MyPojo;
import org.greenbuttonalliance.espi.common.models.atom.FeedType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;

/**
 * Created by mooreb on 2019-02-15.
 */
public class PGEParsingTest {
    private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    @Test(expectedExceptions = ArrayStoreException.class)
    public void parsingTest1() throws IOException {
        final InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("pge_electric_interval_data.xml");
        Assert.assertNotNull(inputStream);
        final XmlMapper xmlMapper = new XmlMapper();
        FeedType feedType = xmlMapper.readValue(inputStream, FeedType.class);
        Assert.assertNotNull(feedType);
    }

    @Test()
    public void parsingTest2() throws IOException {
        final InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("pge_electric_interval_data.xml");
        Assert.assertNotNull(inputStream);
        final XmlMapper xmlMapper = new XmlMapper();
        MyPojo myPOJO = xmlMapper.readValue(inputStream, MyPojo.class);
        Assert.assertNotNull(myPOJO);
    }
}
