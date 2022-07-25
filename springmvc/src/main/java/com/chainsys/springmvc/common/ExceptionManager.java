package com.chainsys.springmvc.common;

import com.chainsys.springmvc.common.HTMLHelper;
import com.chainsys.springmvc.common.LogManager;

public class ExceptionManager {
	   public static String handleException(Exception e,String source,String message) {
		   LogManager.logException(e,source);
		 message += "Message: "+e.getMessage();
		   String errorPage=HTMLHelper.getHtmlTemplate("Error", message);
	        return errorPage;
	   }
	}
