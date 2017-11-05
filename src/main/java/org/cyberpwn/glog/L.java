package org.cyberpwn.glog;

public class L
{
	private static void write(String v)
	{
		System.out.println(v);
	}

	private static void log(String key, String log)
	{
		write("[" + key + "]: " + log);
	}

	public static void l(String s)
	{
		log("INFO", s);
	}

	public static void f(String s)
	{
		log("ERROR", s);
	}

	public static void w(String s)
	{
		log("WARNING", s);
	}
}
