package org.upv.ufasu;

import java.io.InputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.upv.ufasu.weather.Weather;
import org.upv.ufasu.weather.YahooParser;

public class YahooParserTest extends TestCase {

	
	
public YahooParserTest(String name) {
	
	super(name);
}




public void testParser() throws Exception {
	InputStream valenciaData =
	getClass().getClassLoader().getResourceAsStream("valencia-weather.xml");
	Weather weather = new YahooParser().parse( valenciaData );
	assertEquals( "Valencia", weather.getCity() );
	assertEquals( "SP", weather.getCountry() );
	assertEquals( "70", weather.getTemp() );
	assertEquals( "Fair", weather.getCondition() );
	assertEquals( "70", weather.getChill() );
	assertEquals( "21", weather.getHumidity() );
}
}






