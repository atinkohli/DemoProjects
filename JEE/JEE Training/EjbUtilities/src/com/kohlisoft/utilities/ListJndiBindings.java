package com.kohlisoft.utilities;

import java.util.Properties;

import javax.naming.Binding;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;

public class ListJndiBindings {

	private static final void listContext(Context ctx, String indent){

		try {
			   NamingEnumeration<Binding> list = ctx.listBindings("");
			   while (list.hasMore()) {
			       Binding item = (Binding) list.next();
			       String className = item.getClassName();
			       String name = item.getName();
			       System.out.println(className + " " + name);
			       Object o = item.getObject();
			       if (o instanceof javax.naming.Context) {
			    	   listContext((Context) o, indent + " ");
			       }
			   }
			} catch (NamingException ex) {
				System.out.println("JNDI failure: " + ex.getStackTrace());
			}
		
	}
	public static void main(String[] args) throws Exception {
		Properties jndiProps = new Properties();
		jndiProps.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
		jndiProps.put(Context.PROVIDER_URL,"remote://localhost:4447");
		// create a context passing these properties
		jndiProps.put(Context.SECURITY_PRINCIPAL, "atin1");
		// password
		jndiProps.put(Context.SECURITY_CREDENTIALS, "pass123");

		//jndiProps.put("jboss.naming.client.ejb.context", true);
		Context ct = new InitialContext(jndiProps);
		Context ctx = (Context)ct.lookup("java:global");
		listContext(ctx, "");
		
//		Properties jndiProps = new Properties();
//		jndiProps.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
//		jndiProps.put(Context.PROVIDER_URL,"remote://localhost:4447");
//		// create a context passing these properties
//		jndiProps.put(Context.SECURITY_PRINCIPAL, "atin1");
//		// password
//		jndiProps.put(Context.SECURITY_CREDENTIALS, "pass123");
//
//		//jndiProps.put("jboss.naming.client.ejb.context", true);
//		Context ctx = new InitialContext(jndiProps);
//		
//		MessageServiceRemote mesgBean = (MessageServiceRemote)ctx.lookup("CDI_Injection/MessageService!com.kohlisoft.cdi.ejb.MessageServiceRemote");
//		
//		System.out.println("FOR ADMIN -- " + mesgBean.getMessage("ADMIN"));
//		
//		System.out.println("For OTHERS -- " + mesgBean.getMessage("OTHERS"));

	}
	
}