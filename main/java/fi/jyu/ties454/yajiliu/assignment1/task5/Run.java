package fi.jyu.ties454.yajiliu.assignment1.task5;


import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.util.leap.Properties;
import jade.wrapper.AgentContainer;
import jade.wrapper.StaleProxyException;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties pp = new Properties();
	    pp.setProperty(Profile.GUI, Boolean.TRUE.toString());
	    Profile p = new ProfileImpl(pp);
	    AgentContainer ac = jade.core.Runtime.instance().createMainContainer(p);
	    try {
	    	ac.acceptNewAgent("Publisher", new Publisher()).start();
	    	ac.acceptNewAgent("Broker", new Broker()).start();
	    	ac.acceptNewAgent("Subscribers", new Subscribers()).start();     
	    } catch (StaleProxyException e) {
	        throw new Error(e);
	    }
	}

}