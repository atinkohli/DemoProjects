package student.timer;

import javax.annotation.Resource;
import javax.ejb.ScheduleExpression;
import javax.ejb.Stateless;
import javax.ejb.Timeout;
import javax.ejb.Timer;
import javax.ejb.TimerService;

/**
 * Session Bean implementation class MyTimer
 */
@Stateless
public class MyTimer implements MyTimerRemote {

	@Resource
	private TimerService timerService;
	
    public MyTimer() {

    }

	@Override
	public String startTimer() {
		
		ScheduleExpression schedule = new ScheduleExpression();
    	schedule.dayOfMonth("*");
    	schedule.dayOfWeek("*");
    	schedule.hour("*");
    	schedule.minute("*");
    	schedule.second("*/10");
    	Timer timer = timerService.createCalendarTimer(schedule);
    	return "timer message schedule is " + schedule.toString();
	}

	@Override
	public void stopTimer() {
		
		for(Timer t : timerService.getTimers()){
			t.cancel();
		}
	}

    @Timeout
    public void timeout(Timer timer){
    	System.out.println("Timer bean timed out");
    }
    
}
