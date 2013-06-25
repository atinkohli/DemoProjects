package student.timer;

import java.io.IOException;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MyTimerClient {

	public static void main(String[] args) throws IOException, NamingException{
		
		Properties jndiProps = new Properties();
		jndiProps.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
		jndiProps.put(Context.PROVIDER_URL,"remote://localhost:4447");
		// create a context passing these properties
		//jndiProps.put(Context.SECURITY_PRINCIPAL, "atin1");
		// password
		//jndiProps.put(Context.SECURITY_CREDENTIALS, "pass123");

		//jndiProps.put("jboss.naming.client.ejb.context", true);
		
		Context ctx = new InitialContext(jndiProps);
		
	
		MyTimerRemote timerBean = (MyTimerRemote)ctx.lookup("MyTimer/MyTimer!student.timer.MyTimerRemote");
		System.out.println("Starting timer, press any key to stop");
		
		String msg = timerBean.startTimer();
		
		System.out.println("Received from timer bean : "+ msg);
		
		int input = System.in.read();
		
		timerBean.stopTimer();
		
		System.out.println("Stopped timer");
		
	}
}
