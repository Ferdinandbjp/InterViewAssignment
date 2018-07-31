package org.interview.assignment.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * Funny assignment of the HSBC interview
 * @author jinpeng.bu
 * @since 2018-07-31
 */
@Api(value = "HSBC interview funny assignment", description = "HSBC interview funny assignment API")
@RestController
@RequestMapping(value = "/assignment")
public class FunnyAssiagnmentController {

	@ApiOperation("FizzBuzz funny game stage 1")
	@RequestMapping(value = { "/stageOne" }, method = RequestMethod.GET)
	@ResponseBody
	public String stageOne(
			@ApiParam(name = "count", value = "student count, 100 for default", required = false)
			@RequestParam(value = "count", required = false, defaultValue = "100") int count) {
		
		StringBuffer resultSb = new StringBuffer();
		for (int i = 1; i <= count; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				resultSb.append("FizzBuzz\n");
			} else if (i % 3 == 0) {
				resultSb.append("Fizz\n");
			} else if (i % 5 == 0) {
				resultSb.append("Buzz\n");
			} else {
				resultSb.append(i).append("\n");
			}
		}
		return resultSb.toString();
	}

	@ApiOperation("FizzBuzz funny game stage 2")
	@RequestMapping(value = { "/stageTwo" }, method = RequestMethod.GET)
	@ResponseBody
	public String stageTwo(
			@ApiParam(name = "count", value = "student count, 100 for default", required = false)
			@RequestParam(value = "count", required = false, defaultValue = "100") int count) {
		
		StringBuffer resultSb = new StringBuffer();
		for (Integer i = 1; i <= count; i++) {

			if ((i % 3 == 0 || StringUtils.contains(i.toString(), "3"))
					&& (i % 5 == 0 || StringUtils.contains(i.toString(), "5"))) {
				resultSb.append("FizzBuzz\n");
			} else if ((i % 3 == 0 || StringUtils.contains(i.toString(), "3"))) {
				resultSb.append("Fizz\n");
			} else if ((i % 5 == 0 || StringUtils.contains(i.toString(), "5"))) {
				resultSb.append("Buzz\n");
			} else {
				resultSb.append(i).append("\n");
			}
		}
		return resultSb.toString();
	}
}
