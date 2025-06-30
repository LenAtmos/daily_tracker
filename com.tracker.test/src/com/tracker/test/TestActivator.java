package com.tracker.test;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class TestActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		TestActivator.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		TestActivator.context = null;
	}

}
