package test2;

public class StorageImple<T> implements Storage<T>{
	
	private T[] array;
	
	public StorageImple(int capacity) {
		array = (T[])(new Object[capacity]);
	}
	
	@Override
	public void add(T item, int index) {
		
	}

	@Override
	public T get(int index) {
		return null;
	}

}
