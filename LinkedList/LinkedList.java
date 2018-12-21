public class LinkedList <G>
{

	private class Node
	{
		G data;
		Node next;
		public Node(G data, Node next)
		{
			this.data = data;
			this.next = next;
		}
	}

	Node head;
	
	public boolean insert(G data)
	{
		Node new_node = new Node(data, null);

		if (this.head == null)
		{
			head = new_node;
			return true;
		}
		Node current = head;
		while (current.next != null)
		{
			current = current.next;
		}
		current.next = new_node;
		return true;
	}
	
	
	
i	public 	boolean insert (G data, int index)
	{
		Node new_node = new Node(data, null);
		count = 0;

		if ((this.head == null) && (count == index))
		{
			head = new_node;
			return true;
		}
		else 
			return false;

		current = head;
		count ++;
		while ((current.next != null) && (count <= index))
		{
		`	current = current.next;
			count ++;
		}
		if (count == index)
		{
			new_node.next = current.next;
			current.next = new_node;
			return true;
		}
		return false;
	}

	public G remove (int index)
	{
		if (this.head == null)
			return null;

		if (index == 0)
		{
			G data = this.head.data;
			this.head = this.head.next;
			return data;
		}

		int count = 0;
		Node current = head;

		count++;
		while ((current.next != null) && (count <= index))
		{

		`	current = current.next;
			count++;
		}

		if (count == index)
		{
			if (current.next == null)
				return null:
			G data = current.next.data;
			current.next = current.next.next;
			return data;
		}
		return false;
	}
	public G get(int index)
	{
		Node curr = this.head;
		int count = 0;	
		for(; (curr.next != null && count < intex); count++) {
			curr = curr.next;
		}
		if(count == index) {
			return curr.data;
		}
		return null;
	}
}
	
	


	
