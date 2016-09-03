package com.ovtn;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.commons.io.FileUtils;

import com.ovtn.DeparturesScanner;
import com.ovtn.OVIOUtils;
import com.ovtn.SncfApiReader;

public class DeparturesScanner {
	private static boolean sCancel = false;
	private static final int sMaxFolderSize = 500;
	private static final String sLiveFolder = "./live/";
	private static final String sArchFolder = "./arch";
	// Write one file at a time, just for testing synchronization
	private Lock mLock = new ReentrantLock();
	private String[] mStationsToScan;

	public DeparturesScanner(String ... iStationsToScan) {
		// TODO ...
	}

	/**
	 * Démarre l'aspiration des données ainsi que le thread de gestion des répertoires.
	 */
	public void start() {
		//TODO
	}

	/**
	 * Créer un thread qui va aspirer les données pour la station fournie et
	 * les stocker dans le folder live.
	 * @param iStation
	 * @return
	 */
	private Thread createScanThread(final String iStation) {
		final String lPath = sLiveFolder + iStation.replaceAll(":", "") + ".txt";
		return new Thread(new Runnable() {
			@Override
			public void run() {
				while (!sCancel) {
					//TODO
				}
			}
		});
	}

	/**
	 * Démarre un daemon qui va périodiquement scruter le folder live et le
	 * déplacer s'il devient trop gros.
	 */
	private void startDaemonThread() {
		Thread lDaemonThread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (!sCancel) {
					//TODO
				}
			}
		});
		lDaemonThread.start();
	}

	/**
	 * Arrete l'application et tous ses threads.
	 */
	public static void cancel() {
		sCancel = true;
	}

	public static void main(String[] args) {
		DeparturesScanner lScanner = new DeparturesScanner(
				"OCE:SA:87391003", "OCE:SA:87723197");
		//TODO
	}
}

