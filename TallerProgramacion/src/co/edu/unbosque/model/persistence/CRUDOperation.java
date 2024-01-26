package co.edu.unbosque.model.persistence;

public interface CRUDOperation {

	public void create(String... attribs);

	public void create(Object obj);

	public String readAll();

	public boolean update(String name, String... newData);

	public boolean delete(String name);

	public boolean delete(Object obj);

}
