package com.mooreb.forgridium.trivial;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.IOException;
import java.lang.invoke.MethodHandles;import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;




/**
 * Created by mooreb on 2019-02-15.
 */
public class DeserializeTest {
    private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test
    public void readFooBarXMLPair() throws IOException {
        final String doc = "<Pair><first>foo</first><second>bar</second></Pair>";
        XmlMapper xmlMapper = new XmlMapper();
        final Pair pair = xmlMapper.readValue(doc, Pair.class);
        Assert.assertNotNull(pair);
        final String first = pair.getFirst();
        Assert.assertNotNull(first);
        Assert.assertEquals(first, "foo");
        final String second = pair.getSecond();
        Assert.assertNotNull(second);
        Assert.assertEquals(second, "bar");
    }
}
