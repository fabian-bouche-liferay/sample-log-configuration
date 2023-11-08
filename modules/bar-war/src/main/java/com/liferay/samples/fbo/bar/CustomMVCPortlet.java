package com.liferay.samples.fbo.bar;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class CustomMVCPortlet extends com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet {
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		if(_log.isInfoEnabled()) {
			_log.info("Custom MVC Portlet log");
		}

		super.doView(renderRequest, renderResponse);
	}

	private static final Log _log = LogFactoryUtil.getLog(
			CustomMVCPortlet.class);
}
