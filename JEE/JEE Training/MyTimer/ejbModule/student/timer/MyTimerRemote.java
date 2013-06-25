package student.timer;

import javax.annotation.security.PermitAll;
import javax.ejb.Remote;


@Remote
@PermitAll
public interface MyTimerRemote {

	public String startTimer();
	
	public void stopTimer();
	
}
