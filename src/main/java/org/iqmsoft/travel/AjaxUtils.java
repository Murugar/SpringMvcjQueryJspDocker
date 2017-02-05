package org.iqmsoft.travel;


public class AjaxUtils {

	public static boolean isAjaxRequest(String requestedWith) {
		return requestedWith != null ? "XMLHttpRequest".equals(requestedWith) : false;
	}

	private AjaxUtils() {}

}
