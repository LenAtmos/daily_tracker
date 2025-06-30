package com.tracker.ui;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class UIActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		UIActivator.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		UIActivator.context = null;
	}

}
