package idv.heimlich.BaseProject;

import org.slf4j.Logger;

import idv.heimlich.BaseProject.common.db.IDBSession;
import idv.heimlich.BaseProject.common.db.IDBSessionFactory;
import idv.heimlich.BaseProject.common.db.impl.DBSessionFactoryImpl;
import idv.heimlich.BaseProject.common.log.LogFactory;

public class Test {

	private static Logger LOGGER = LogFactory.getInstance();

	public static void main(String[] args) {
		LOGGER.debug("Test Start");
		final IDBSessionFactory sessionFactory = new DBSessionFactoryImpl();
		final IDBSession session = sessionFactory.getXdaoSession("");

	}

}
