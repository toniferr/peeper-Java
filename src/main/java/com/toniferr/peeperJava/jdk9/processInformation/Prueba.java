package com.toniferr.peeperJava.jdk9.processInformation;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;

public class Prueba {

	public static void main(String[] args) {

		System.out.println("ProcessHandle.current()");
		ProcessHandle self = ProcessHandle.current();
		long PID = self.pid();
		System.out.println(PID);
		System.out.println("-----------");

		ProcessHandle.Info procInfo = self.info();
		System.out.println(self.info().toString());
		System.out.println("-----------");

		System.out.println("procInfo.arguments()");
		Optional<String[]> args2 = procInfo.arguments();
		//args2.get();
		System.out.println(args2);
		System.out.println("-----------");

		System.out.println("procInfo.commandLine()");
		Optional<String> cmd =  procInfo.commandLine();
		System.out.println(cmd);
		System.out.println("-----------");

		System.out.println("procInfo.startInstant()");
		Optional<Instant> startTime = procInfo.startInstant();
		System.out.println(startTime);
		System.out.println("-----------");

		System.out.println("procInfo.totalCpuDuration()");
		Optional<Duration> cpuUsage = procInfo.totalCpuDuration();
		System.out.println("-----------");
		System.out.println(cpuUsage);
		
		/*
		 * ProcessHandle.current().children().forEach(procHandle -> {
		 * assertTrue("Could not kill process " + procHandle.pid(),
		 * procHandle.destroy()); });
		 */
	}
}
