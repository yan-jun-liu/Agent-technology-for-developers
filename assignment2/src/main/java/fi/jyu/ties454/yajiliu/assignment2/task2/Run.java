package fi.jyu.ties454.yajiliu.assignment2.task2;

import jade.util.leap.Properties;

import jade.wrapper.AgentContainer;
import jade.core.Agent;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.StaleProxyException;


public class Run {
	public static void main(String[] args) throws StaleProxyException {
	    Properties pp = new Properties();
	    pp.setProperty(Profile.GUI, Boolean.TRUE.toString());
	    Profile p = new ProfileImpl(pp);
	    AgentContainer ac = jade.core.Runtime.instance().createMainContainer(p);
	    
	}
}
