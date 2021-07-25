/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gg.rizkirafiif.Jawaban.SortingList;
public class Sorting {

    Node head, tail;
    boolean swap = false;
    
    public boolean isEmpty() 
    {
        return (head == null);
    }
    
    public void addLast(Node data) 
    {
        if (isEmpty()) 
        {
            head = tail = data;
        } 
        else 
        {
            data.prev = tail;
            tail.next = data;
            tail = data;
        }
    }
    
    public void show() 
    {
        if (isEmpty()) 
        {
            System.out.println("List kosong");
        } 
        else 
        {
            System.out.print("Isi data adalah : ");
            Node temp;
            temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("\n");
        }
    }
    
    public void clear() 
    {
        head = tail = null;
    }

    public int length() 
    {
        int i = 0;
        Node temp = head;
        while (temp != null) 
        {
            i++;
            temp = temp.next;
        }
        return i;
    }

    public void bubbleSort()
    {
        for (int i = 1; i < length(); i++) 
        {
            Node temp = tail;
            for (int j = length()-1; j >= i; j--) 
            {
                if(temp.data<temp.prev.data)
                {
                    int sem = temp.data;
                    temp.data = temp.prev.data;
                    temp.prev.data = sem;
                }
                temp = temp.prev;
            }
        }
    }
    
    public void optBubbleSort()
    {
        int panjang = length();
        boolean lagi = true;
        while(lagi){
            panjang--;
            lagi = false;
            Node temp = head;
            for(int i = 0; i < panjang; i++)
            {
                if(temp.data > temp.next.data)
                {
                    int sem = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = sem;
                    lagi = true;
                }
                temp = temp.next;
            }
        }
    }

    public void selectionSort() 
    {
        for (Node node1 = head; node1 != null; node1 = node1.next) 
        {
            Node min = node1;
            for (Node node2 = node1; node2 != null; node2 = node2.next) 
            {
                if (min.data > node2.data) 
                {
                    min = node2;
                }
            }
            Node temp = new Node(node1.data);
            node1.data = min.data;
            min.data = temp.data;
        }
    }
 
    public void insertionSort()
    {
        Node tmp = head.next;
        for( int i = 1; i < length(); i++)
        {
            int temp = tmp.data;
            int j = i;
            Node tmp2 = tmp;
            while((j > 0) && (tmp2.prev.data > temp))
            {
                tmp2.data = tmp2.prev.data;
                j--;
                tmp2 = tmp2.prev;
            }
            tmp2.data = temp;
            tmp = tmp.next;
        }
    }
}
