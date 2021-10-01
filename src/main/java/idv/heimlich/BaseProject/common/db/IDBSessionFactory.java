package idv.heimlich.BaseProject.common.db;

public interface IDBSessionFactory {

	IDBSession getXdaoSession(String conn);

}
