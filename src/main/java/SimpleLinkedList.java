/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/

import java.util.NoSuchElementException;

public class SimpleLinkedList<T>
{

    public int aSize;
    private Node<T> head;
    private Node<T> current;
    private Node<T> previous;

    public SimpleLinkedList()
    {
        aSize = 0;
        head = new Node<>();
        current = new Node<>();
        previous = current;
    }

    public SimpleLinkedList(T[] someValues)
    {
        for (T aValue : someValues)
        {
            this.push(aValue);
        }
    }

    public T[] asArray(Class someClass)
    {
        return null;
    }

    public T pop() throws NoSuchElementException
    {
        T answer;
        if (head.getData() == null)
        {
            throw new NoSuchElementException();
        }
        if (head.getNextNode() == null)
        {
            answer = head.getData();
            head = null;
            previous = null;
        } else
        {
            answer = head.getData();
            head = head.getNextNode();
        }

        this.aSize -= 1;

        return answer;
    }

    public void reverse()
    {
        Node<T> newhead;
        while (head.getNextNode() != null)
        {
            
        }
    }

    public void push(T data)
    {
        if (head.getData() == null)
        {
            head = new Node<>(data, null);
            current = head;
            previous = head;
        } else
        {
            Node<T> newHead = new Node<>(data, null);
            newHead.setNextNode(head);
            head = newHead;
        }
        aSize++;
    }

    public int size()
    {
        return aSize;
    }
}


class Node<T>
{
    private T aData;
    private Node<T> nextNode;
    private Node<T> previousNode;

    public Node(T someData, Node<T> aNextNode)
    {
        this.aData = someData;
        this.nextNode = aNextNode;
    }

    public Node()
    {
        this.aData = null;
        nextNode = null;
    }

    public T getData()
    {
        return aData;
    }

    public void setData(T aData)
    {
        this.aData = aData;
    }

    public Node<T> getNextNode()
    {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode)
    {
        this.nextNode = nextNode;
    }
}