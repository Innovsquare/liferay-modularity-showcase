/**
 * Copyright (c) 2014-present Innovsquare, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 3.0 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.innovsquare.showcase.portlet.sample;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.GenericPortlet;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

/**
 * Sample OSGi Portlet using OSGi Declarative Services
 * @author rafik harabi
 *
 */

@Component(
	immediate = true, // start immediately when import packages are resolved
			property = {
				"com.liferay.portlet.display-category=category.sample",
				"com.liferay.portlet.instanceable=true",
				"javax.portlet.display-name=Sample OSGi DS Portlet",
				"javax.portlet.security-role-ref=power-user,user"
			},
			service = Portlet.class // Expose the API, register as Portlet
)
public class SamplePortlet extends GenericPortlet {
	/*
	 * (non-Javadoc)
	 * @see javax.portlet.GenericPortlet#doView(javax.portlet.RenderRequest, javax.portlet.RenderResponse)
	 */
	@Override
	protected void doView(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		PrintWriter printWriter = response.getWriter();

		printWriter.print("Sample OSGi DS Portlet - Hello Innovsquare!");
	}
}
