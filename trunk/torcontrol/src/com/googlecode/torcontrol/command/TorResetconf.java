package com.googlecode.torcontrol.command;

/**
 * Remove all settings for a given configuration option entirely, assign its
 * default value (if any), and then assign the String provided. Typically the
 * String is left empty, to simply set an option back to its default
 * 
 * @author Denis Migol
 * 
 */
public class TorResetconf extends TorCommandBase {

	public static final String KEYWORD = "RESETCONF";

	public TorResetconf() {
		super(KEYWORD);
	}

}
