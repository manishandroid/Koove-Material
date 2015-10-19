package com.koove.retrofit;

import android.util.Log;

public class RestLog
{

	public static final boolean printstacktrace = true;
	public static final boolean printverbosemsg = true;
	public static final String TAG = "Retrofit";

	public static void l(Class<?> c, Throwable e)
	{
		if (e.getMessage() != null)
		{
			Log.e(TAG, c.getSimpleName() + "==> " + e.getMessage());
		}
		if (printstacktrace)
		{
			for (StackTraceElement ste : e.getStackTrace())
			{
				Log.e(TAG, c.getSimpleName() + "==> " + ste.toString());
			}
		}
	}

	public static void l(Class<?> c, String msg)
	{
		if (printverbosemsg)
		{
			Log.d(TAG, c.getSimpleName() + "==> " + msg);
		}
	}
	public static void l(Object o, String msg)
	{
		RestLog.l(o.getClass(), msg);
	}
	
	
	public static void e(Class<?> c, String msg)
	{
		if (printverbosemsg)
		{
			Log.e(TAG, c.getSimpleName() + "==> " + msg);
		}
	}
	public static void e(Object o, String msg)
	{
		RestLog.e(o.getClass(), msg);
	}

	public static void l(Object o, Throwable e)
	{
		RestLog.l(o.getClass(), e);
	}


}
