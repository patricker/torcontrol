package com.googlecode.torcontrol.command;

/**
 * SETCONF Change the value of one or more configuration variables.
 * 
 * @author Denis Migol
 * 
 */
public class TorSetconf extends TorCommandBase {

	public static final String KEYWORD = "SETCONF";

	public TorSetconf() {
		super(KEYWORD);
	}
}
