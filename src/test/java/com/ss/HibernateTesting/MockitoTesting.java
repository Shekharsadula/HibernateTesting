package com.ss.HibernateTesting;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import com.ss.mockito.TestClass;
import com.ss.mockito.TestInterface;

public class MockitoTesting {
	@Mock
	TestInterface testInterface;
	@Rule
public MockitoRule mockitoRule=MockitoJUnit.rule();
@Test
public void test() {
	when(testInterface.add(2, 2)).thenReturn(47);
	TestClass tc=new TestClass(testInterface);
	assertEquals(47, tc.add(2, 2));
	assertEquals(47, tc.add(2, 2));
	assertEquals(47, tc.add(2, 2));
	assertEquals(47, tc.add(2, 2));
	assertEquals(47, tc.add(2, 2));
	verify(testInterface,times(5)).add(2,2);
	verify(testInterface,atLeastOnce()).add(2,2);
	verify(testInterface,atLeast(5)).add(2,2);
	verify(testInterface,atMost(5)).add(2,2);
	verify(testInterface,never()).add(2,3);
	verifyNoMoreInteractions(testInterface);
}

}
