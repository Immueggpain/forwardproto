package com.github.immueggpain.smartproxy;

import java.util.concurrent.Callable;

import com.github.immueggpain.smartproxytool.DedupUserrule;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.HelpCommand;

@Command(description = "Please report issues at https://github.com/Immueggpain/forwardproto/issues",
		name = "smartproxy", mixinStandardHelpOptions = true, version = Launcher.VERSTR,
		subcommands = { HelpCommand.class, Smartproxy.class, SmartproxyServer.class, DedupUserrule.class })
public class Launcher implements Callable<Void> {

	public static final String VERSTR = "2.0.3";
	public static final int SO_BUF_SIZE = 1024 * 1024 * 4;

	public static void main(String[] args) {
		int exitCode = new CommandLine(new Launcher()).setCaseInsensitiveEnumValuesAllowed(true).execute(args);
		System.exit(exitCode);
	}

	@Override
	public Void call() throws Exception {
		CommandLine.usage(this, System.out);
		return null;
	}

}
