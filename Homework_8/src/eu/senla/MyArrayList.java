package eu.senla;

import java.util.Arrays;
import java.util.Comparator;
import java.util.ListIterator;

public class MyArrayList<E> implements MyList<E> 
{
	
	
	private static int standartCapacity = 2;
	 private int size = 0;
	 private int index = 0;
	 public int	i = 0;
	 
	 private Object[] myArray = new Object[standartCapacity];

	 
	 
	@Override
	public void add(int index, E obj) {	
		
		    size++;
		       
        if (size == myArray.length) {
        	
        	 int newCapacity = (myArray.length * 3)/2;
        	 Object[] myNewArray = new Object[newCapacity];
        	 
            for (int i = 0; i < myArray.length; i++)
            {   	
            	 myNewArray[i] =  myArray[i];
            }
		        myArray = myNewArray;
        }
        myArray[index] = obj;
	}
	
//////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public boolean addAll(int index, MyList<? extends E> col) {
		// TODO Auto-generated method stub
		return false;
	}
//////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public E get(int index) {
		
		return  (E) myArray[index];
	}
/////////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public int indexOf(Object obj) {
		
		for (index = 0; index < myArray.length; index++)
        {   	
			if (myArray[index] == obj) {
				
				i = index;
              break;
			}
			else {
				i = -1;
			}	        	 
        }		 
		return i;
	}
//////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public int lastIndexOf(Object obj) {


		
		return 0;
	}
///////////////////////////////////////////////////////////////////////////////////////////////
	@Override
	public ListIterator<E> listIterator() {
		
	 
		
		 
		return null;
	}

	@Override
	public <E> MyList<E> of(Object... e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E set(int index, E obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void sort(Comparator<? super E> comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MyList<E> subList(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String toString() {
		return Arrays.toString(myArray);
	}


	
	
	

}
