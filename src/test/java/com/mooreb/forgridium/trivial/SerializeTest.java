package com.mooreb.forgridium.trivial;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.lang.invoke.MethodHandles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

/**
 * Created by mooreb on 2019-02-15.
 */
public class SerializeTest {
    private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Test
    public void printFooBarXMLPair() throws JsonProcessingException {
        XmlMapper xmlMapper = new XmlMapper();
        String xml = xmlMapper.writeValueAsString(new Pair("foo", "bar"));
        assertNotNull(xml);
        LOG.info("xml is {}", xml);
        assertEquals(xml, "<Pair><first>foo</first><second>bar</second></Pair>");
    }
}
