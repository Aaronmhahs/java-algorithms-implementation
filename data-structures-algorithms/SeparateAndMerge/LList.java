import java.util.*;

public class LList<T>
{
        private Node head;
        private class Node
        {
                public T element;
                public Node next;
        }
        
        private class Iter implements Iterator<T>
        {
                public Node cursor;
                public Iter()
                {
                        cursor = head;
                }
                public boolean hasNext()
                {
                        return cursor != null;
                }
                public T next()
                {
                        if(!hasNext())
                        {
                                throw new NoSuchElementException();
                        }
                        T answer = cursor.element;
                        cursor = cursor.next;
                        return answer;
                }
                public void remove()
                {
                        throw new UnsupportedOperationException();
                }
        }
        
        public LList()
        {
                head = null;
        }
        
        public Iterator<T> iterator()
        {
                return new Iter();
        }
        
        public void add(T elem)
        {
                if(head == null) // empty
                {
                        Node newNode = new Node();
                        newNode.element = elem; 
                        head = newNode;
                }
                else
                {
                        Node current = head;
                        while(current.next != null)
                        {
                                current = current.next;
                        }
                        Node newNode = new Node();
                        newNode.element = elem;
                        current.next = newNode;
                }
        }
}
