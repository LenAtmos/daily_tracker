package com.tracker.data;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class DataActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		DataActivator.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		DataActivator.context = null;
	}

}
