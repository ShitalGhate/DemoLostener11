package com.demo;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void test01()
	{
		System.out.println("pass");
	}

	@Test
	public void test02()
	{
		System.out.println("fail");
		Assert.assertEquals(1, 2);
	}
	@Test
	public void test03()
	{
		throw new SkipException("Skip");
		
	}
}
