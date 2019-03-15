package com.dodo.project.base.exception;

import com.dodo.project.base.exception.core.BussinessException;
import com.dodo.project.base.exception.enums.ResponseStatusEnum;
import org.databene.feed4junit.Feeder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

/*
 * <b>BussinessExceptionTest</b></br>
 *
 * <pre>
 * 业务异常单元测试
 * </pre>
 *
 * @Author xqyjjq walk_code@163.com
 * @Date 2019/3/15 15:41
 * @Since JDK 1.8
 */
@RunWith(Feeder.class)
public class BussinessExceptionTest {
	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void verifiesTypeAndMessage(){
		exception.expect(BussinessException.class);
		exception.expectMessage(ResponseStatusEnum.STATUS_500.getDescription());
		throw new BussinessException(ResponseStatusEnum.STATUS_500.getDescription());
	}
}
