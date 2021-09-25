package Bus_schedule.schedule;

public class ScheduleDao {
	private static ScheduleDao instance = new ScheduleDao();
	public static ScheduleDao getInstance() {
		return instance;
	}
	private ScheduleDao() {
	}
}
