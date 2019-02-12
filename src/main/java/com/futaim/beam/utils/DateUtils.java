package com.futaim.beam.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Anas Quedan
 *
 */
public class DateUtils {

	/**
	 * 
	 */
	public static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

	/**
	 * 
	 */
	private DateUtils() {
	}

	/**
	 * @param date
	 * @return
	 */
	public static Date convertStringToDate(String date) {
		try {
			return simpleDateFormat.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
