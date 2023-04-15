package dao;

import java.util.ArrayList;

public interface DAOInterface<T> {
	public void them(T t);
	
	public void xoa(T t);
	
	public void sua(T t);
	
	public ArrayList<T> selectAll();
	
	public T selectById(T t);
	
	public ArrayList<T> selectByCondition(String condition);
}
