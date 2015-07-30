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

package com.innovsquare.showcase.hook.userservice;

import java.util.Date;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceWrapper;
import com.liferay.portal.service.UserLocalServiceWrapper;

/**
 * User login tracker service hook using OSGi declarative services
 * 
 * @author rafik harabi
 *
 */
// define the service interface to register with.
@Component(service = ServiceWrapper.class // Expose the API, register the hook as ServiceWrapper

)
public class UserLoginTrackerServiceHook extends UserLocalServiceWrapper {

	// define the Logger
	Log log = LogFactoryUtil.getLog(UserLoginTrackerServiceHook.class);

	public UserLoginTrackerServiceHook() {
		super(null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.liferay.portal.service.UserLocalServiceWrapper#updateLastLogin(long,
	 * java.lang.String)
	 */
	@Override
	public User updateLastLogin(long userId, String loginIP) throws PortalException {

		log.info("User '" + userId + "' has connected on " + new Date() + " from the IP address " + loginIP);

		return super.updateLastLogin(userId, loginIP);
	}

}
