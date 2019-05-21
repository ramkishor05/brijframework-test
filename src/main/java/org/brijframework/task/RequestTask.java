package org.brijframework.task;

import java.util.concurrent.TimeUnit;

import org.brijframework.support.monitor.ScheduledTask;

public class RequestTask {

	@ScheduledTask(interval=15,unit=TimeUnit.DAYS, format="dd HH:mm:ss", startOn="09 20:33:05", repeatOn = "")
	public void name() {
		System.out.println("ScheduledTask ");
	}
}
