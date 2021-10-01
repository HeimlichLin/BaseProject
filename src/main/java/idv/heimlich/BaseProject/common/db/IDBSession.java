package idv.heimlich.BaseProject.common.db;

import idv.heimlich.BaseProject.common.dao.IConverter;
import idv.heimlich.BaseProject.common.dao.RowMap;
import idv.heimlich.BaseProject.common.dao.RowMapList;
import idv.heimlich.BaseProject.common.db.sql.SqlWhere;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

public interface IDBSession {
	
void beginTransaction();
	
	void commit();

	void close();

	void rollback();
	
	int executeUpdate(String sql);
	
	int executeInsert(String sql, Map<String, Object> map);
	
	int insert(String tableName, RowMap rowMap);
	
	int count(String sql);
	
	<Po> int insertPos(List<Po> datas);
	
	<Po> int insertPo(Po object);

	Connection getConnection();

	RowMapList query(String sql);
	
	RowMapList query(String sql, SqlWhere sqlWhere);
	
	<Po> List<Po> select(IConverter<Po> converter, String sql);
	
	<Po> List<Po> select(IConverter<Po> converter, String sql, SqlWhere sqlWhere);

}
