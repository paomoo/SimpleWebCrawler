package com.bianwu.simplecrawler;

import java.io.IOException;
import java.sql.SQLException;

import com.bianwu.simplecrawler.database.DBCommon;

public class Main {

	public static void main(String[] args) throws SQLException, IOException {
		String dbUser = args[0];
		String dbPassword = args[1];
		DBCommon dBCommon = new DBCommon(dbUser, dbPassword);
//		dBCommon.runSql2("TRUNCATE Record;");
//		dBCommon.runSql2("TRUNCATE InProcessing;");
		WebCrawler webCrawler= new WebCrawler("http://www.telenor.com/", dBCommon);
        Thread taskThread = new Thread(webCrawler);
        taskThread.start();
	}
}
