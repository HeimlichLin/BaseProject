package idv.heimlich.BaseProject.common.db.sql;

import idv.heimlich.BaseProject.common.db.utils.SqlFormatUtil;

import java.util.ArrayList;
import java.util.List;

public class SqlColumn {

	private List<String> list;

	public SqlColumn() {
		this.list = new ArrayList<String>();
	}

	public void add(String column) {
		this.list.add(column);
	}

	public int length() {
		return list.size();
	}

	public String get(int i) {
		return this.list.get(i);
	}

	public String get() {
		if (this.list.isEmpty()) {
			return " * ";
		}
		return SqlFormatUtil.selectListToString(this.list);
	}
	
}
