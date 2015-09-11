package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

/**
 * Workaround multiple TaskScheduler beans by setting a default scheduler
 */
//@Configuration
public class TaskSchedulingConfiguration implements SchedulingConfigurer {

	@Autowired
	private TaskScheduler taskScheduler;

	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		taskRegistrar.setScheduler(this.taskScheduler);
	}

}
