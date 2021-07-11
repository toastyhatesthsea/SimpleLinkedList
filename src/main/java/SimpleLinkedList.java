/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/

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

    public T pop()
    {
        return null;
    }

    public void reverse()
    {

    }

    public void push(T data)
    {
        if (head == null)
        {
            head = new Node<>(data, null);
            current = head;
            previous = head;
        } else
        {
            if (head == current)
            {
                Node<T> nextNode = new Node<>(data, null);
                head.setNextNode(nextNode);
                current = nextNode;
                previous = head;
            } else
            {
                previous = current;

                Node<T> nextNode = new Node<>(data, null);
                current.setNextNode(nextNode);
                current = nextNode;
            }
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

    public Node(T someData, Node<T> aNode)
    {
        this.aData = someData;
        nextNode = aNode;
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