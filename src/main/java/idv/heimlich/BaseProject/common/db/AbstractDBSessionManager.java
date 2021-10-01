package idv.heimlich.BaseProject.common.db;

import idv.heimlich.BaseProject.common.db.impl.DBSessionImpl;

public abstract class AbstractDBSessionManager {

	private static IDBSession dbSession;

	public static IDBSession getDBSession() {
		if (dbSession == null) {
			dbSession = new DBSessionImpl();
		}
		return dbSession;
	}

	protected abstract String getConnId();

}
