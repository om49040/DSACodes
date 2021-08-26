
public class ImplementQueueWithMaxApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueMaxApi q=new QueueMaxApi();
		q.push(5);
		q.push(6);
		q.push(8);
		q.push(7);
		q.push(8);
		q.push(8);
		q.push(9);q.push(10);
		q.show();
		System.out.println(q.GetMax());
		q.pop();
		System.out.println(q.GetMax());
		q.Squeue.show();
		q.push(12);
		System.out.println(q.GetMax());
		

	}

}
