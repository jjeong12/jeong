package Bus_schedule.schedule;

import Bus_schedule.ScheduleVO;

public class ScheduleService {
	private static ScheduleService instance =new ScheduleService();
	public static ScheduleService getInsatnce() {
		return instance;
	}
	private ScheduleService () {
	}
	
	private ScheduleDao scheduleDao = ScheduleDao.getInstance();


	public ScheduleVO selectLprod(ScheduleVO vo) {
	   return scheduleDao.selectSchedule(vo);
  }
}
