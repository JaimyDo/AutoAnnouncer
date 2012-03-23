package com.sectorgamer.sharkiller.AutoAnnouncer;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.Bukkit;

public class AnnouncerLog {
	private static final Logger logger = Bukkit.getLogger();

	public static void info(String msg) {
		logger.log(Level.INFO, "[AutoAnnouncer] " + msg);
	}

	public static void warning(String msg) {
		logger.log(Level.WARNING, "[AutoAnnouncer] " + msg);
	}

	public static void severe(String msg) {
		logger.log(Level.SEVERE, "[AutoAnnouncer] " + msg);
	}

	public static void info(String msg, Throwable e) {
		logger.log(Level.INFO, "[AutoAnnouncer] " + msg, e);
	}

	public static void warning(String msg, Throwable e) {
		logger.log(Level.WARNING, "[AutoAnnouncer] " + msg, e);
	}

	public static void severe(String msg, Throwable e) {
		logger.log(Level.SEVERE, "[AutoAnnouncer] " + msg, e);
	}
}
