/*Find the k largest elements using priority queues.*/
package priorityQueues;
import java.util.*;
public class KLargestElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the value of n :");
		n = sc.nextInt();
		System.out.println("Enter the value of k :");
		int k = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		System.out.println("Enter the values :");
		int i;
		for(i = 0; i < n; i ++)
		{
			int num = sc.nextInt();
			if(i < k)
				pq.add(num);
			else
			{
				if(pq.peek() < num)
				{
					pq.remove();
					pq.add(num);
				}
			}
		}
		System.out.println(k + " largest elements in the list is :");
		for(i = 0; i < k; i ++)
			System.out.println(pq.remove());
	}
}
