package Bus_schedule;

import Bus_schedule.schedule.ScheduleService;

public class ScheduleController {
	private static ScheduleController instance = new ScheduleController();
	public static ScheduleController getInstance() {
		return instance;
	}
	private ScheduleController() {
	}
	
	private ScheduleService scheduleService = ScheduleService.getInsatnce();
	
	public ScheduleVO selectLprod(ScheduleVO vo) {
		return scheduleService.selectSchedule(vo);
	}

}
