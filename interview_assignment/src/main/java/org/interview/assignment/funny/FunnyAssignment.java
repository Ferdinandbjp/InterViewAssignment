package org.interview.assignment.funny;

import org.apache.commons.lang3.StringUtils;

/**
 * Funny assignment of the HSBC interview
 * @author jinpeng.bu
 * @since 2018-07-31
 */
public class FunnyAssignment {

	/**
	 * FizzBuzz funny game stage 1
	 * @param count
	 */
	public static void funnyGameStageOne(int count) {

		for (int i = 1; i <= count; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");

			} else if (i % 3 == 0) {
				System.out.println("Fizz");

			} else if (i % 5 == 0) {
				System.out.println("Buzz");

			} else {
				System.out.println(i);

			}
		}
	}

	/**
	 * FizzBuzz funny game stage 2
	 * @param count
	 */
	public static void funnyGameStageTwo(int count) {

		for (Integer i = 1; i <= count; i++) {

			if ((i % 3 == 0 || StringUtils.contains(i.toString(), "3"))
					&& (i % 5 == 0 || StringUtils.contains(i.toString(), "5"))) {
				System.out.println("FizzBuzz");

			} else if ((i % 3 == 0 || StringUtils.contains(i.toString(), "3"))) {
				System.out.println("Fizz");

			} else if ((i % 5 == 0 || StringUtils.contains(i.toString(), "5"))) {
				System.out.println("Buzz");

			} else {
				System.out.println(i);

			}
		}
	}

	public static void main(String[] args) {
//		funnyGameStageOne(33);
		funnyGameStageOne(100);
//		funnyGameStageTwo(33);
		funnyGameStageTwo(100);
	}
}
