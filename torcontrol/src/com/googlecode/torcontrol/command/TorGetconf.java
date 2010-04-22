package com.googlecode.torcontrol.command;

/**
 * 
 * @author Denis Migol
 * 
 */
public class TorGetconf extends TorCommandBase {

	public static final String KEYWORD = "GETCONF";

	public TorGetconf() {
		super(KEYWORD);
	}

}
