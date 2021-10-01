package idv.heimlich.BaseProject.common.db.impl;

import idv.heimlich.BaseProject.common.db.DBSessionManager;
import idv.heimlich.BaseProject.common.db.IDBSession;
import idv.heimlich.BaseProject.common.db.IDBSessionFactory;
import idv.heimlich.BaseProject.common.db.code.DBConfig;
import idv.heimlich.BaseProject.common.log.LogFactory;

import java.util.Objects;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;

public class DBSessionFactoryImpl implements IDBSessionFactory {
	
	private static Logger LOGGER = LogFactory.getInstance();

	@Override
	public IDBSession getXdaoSession(String conn) {
		final String connid = StringUtils.defaultIfEmpty(conn, DBSessionManager.PROP_DEFAULT_CONN_ID);
		Objects.requireNonNull(connid, "無此定義coonid" + conn);
		DBConfig dbConfig = DBConfig.valueOf(connid);
//		LOGGER.debug("use connid:" + connid);
		return dbConfig.getXdaoSession();
	}

}
