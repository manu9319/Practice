package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;

public class TestREport extends BaseTest
{
@Test
public void testA()
{
Reporter.log("testA",true);	
}


@Test
public void testA1()
{
Reporter.log("testA1",true);	
}


@Test
public void testA2()
{
Reporter.log("testA2",true);	
}


@Test
public void testA3()
{
Reporter.log("testA3",true);	
}


@Test
public void testA4()
{
Reporter.log("testA4",true);
}
}
