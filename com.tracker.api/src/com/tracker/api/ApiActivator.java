package com.tracker.api;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class ApiActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	//The method below is the entry point
	public void start(BundleContext bundleContext) throws Exception {
		ApiActivator.context = bundleContext;
		System.out.println("This is the starting point.");
	}

	public void stop(BundleContext bundleContext) throws Exception {
		ApiActivator.context = null;
	}

}
