package idv.heimlich.BaseProject.common.db.code;

import idv.heimlich.BaseProject.common.db.AbstractDBSessionManager;
import idv.heimlich.BaseProject.common.db.DBSessionFTZBManager;
import idv.heimlich.BaseProject.common.db.DBSessionManager;
import idv.heimlich.BaseProject.common.db.IDBSession;


public enum DBConfig {
	
	PFTZBPool {
		@Override
		public AbstractDBSessionManager getDBSessionManager() {
			return new DBSessionFTZBManager();
		}
		
	},
	PCLMSPool {
		@Override
		public AbstractDBSessionManager getDBSessionManager() {
			return new DBSessionManager();
		}
	
	},

	;
	final String connid;

	private DBConfig() {
		this.connid = name();
	}

	 public abstract AbstractDBSessionManager getDBSessionManager();
	 
	 public IDBSession getXdaoSession(){
		 return this.getDBSessionManager().getDBSession();
	 }

}
