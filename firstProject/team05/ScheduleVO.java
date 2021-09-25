package Bus_schedule;

public class ScheduleVO {
// 출발지(고정) 도착지선택 가는날선택 -> 조회
//	출발시간->회사,등급,잔여석 ->조회
//	예상 소요시간,회사,요금
	 private String ScheduleStartingpoint; //출발지
	 private String ScheduleDestination;   //도착지
	 private String ScheduleDay;           //가는날
	 private int ScheduleDeparturetime;    //출발시간
	 private String ScheduleCompany;       //회사
	 private String ScheduleGrade;         //등급
	 private String ScheduleRemnant;       //잔여석
	 private int ScheduleEstimatedtime;    //예상시간
	 private int ScheduleFee;              //요금 
	 
	public String getScheduleStartingpoint() {
		return ScheduleStartingpoint;
	}
	public void setScheduleStartingpoint(String scheduleStartingpoint) {
		ScheduleStartingpoint = scheduleStartingpoint;
	}
	public String getScheduleDestination() {
		return ScheduleDestination;
	}
	public void setScheduleDestination(String scheduleDestination) {
		ScheduleDestination = scheduleDestination;
	}
	public String getScheduleDay() {
		return ScheduleDay;
	}
	public void setScheduleDay(String scheduleDay) {
		ScheduleDay = scheduleDay;
	}
	public int getScheduleDeparturetime() {
		return ScheduleDeparturetime;
	}
	public void setScheduleDeparturetime(int scheduleDeparturetime) {
		ScheduleDeparturetime = scheduleDeparturetime;
	}
	public String getScheduleCompany() {
		return ScheduleCompany;
	}
	public void setScheduleCompany(String scheduleCompany) {
		ScheduleCompany = scheduleCompany;
	}
	public String getScheduleGrade() {
		return ScheduleGrade;
	}
	public void setScheduleGrade(String scheduleGrade) {
		ScheduleGrade = scheduleGrade;
	}
	public String getScheduleRemnant() {
		return ScheduleRemnant;
	}
	public void setScheduleRemnant(String scheduleRemnant) {
		ScheduleRemnant = scheduleRemnant;
	}
	public int getScheduleEstimatedtime() {
		return ScheduleEstimatedtime;
	}
	public void setScheduleEstimatedtime(int scheduleEstimatedtime) {
		ScheduleEstimatedtime = scheduleEstimatedtime;
	}
	public int getScheduleFee() {
		return ScheduleFee;
	}
	public void setScheduleFee(int scheduleFee) {
		ScheduleFee = scheduleFee;
	}
	@Override
	public String toString() {
		return "ScheduleVO [ScheduleStartingpoint=" + ScheduleStartingpoint + ", ScheduleDestination="
				+ ScheduleDestination + ", ScheduleDay=" + ScheduleDay + ", ScheduleDeparturetime="
				+ ScheduleDeparturetime + ", ScheduleCompany=" + ScheduleCompany + ", ScheduleGrade=" + ScheduleGrade
				+ ", ScheduleRemnant=" + ScheduleRemnant + ", ScheduleEstimatedtime=" + ScheduleEstimatedtime
				+ ", ScheduleFee=" + ScheduleFee + "]";
	}
	 
	
	 
	 
}
