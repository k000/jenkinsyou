package com.jenkinstest.domain.logic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcLogicTest {

	@Test
	void test() {
		System.out.println("テストを開始します。");
		CalcLogic logic = new CalcLogic();
		int expect = 9;
		int result = logic.addNum(1, 1);
		assertEquals(result, expect);
	}

}
