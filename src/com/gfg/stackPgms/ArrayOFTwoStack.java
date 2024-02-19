package com.gfg.stackPgms;

class TwoStack
{
	int cap, top1, top2;
	int arr[];
	
	public TwoStack(int n) {
		// TODO Auto-generated constructor stub
		arr = new int[n];
		top1 =-1;
		top2 =n;
		cap =n;
		
	}
	
	boolean push1(int x)
	{
		if(top1 < top2-1)
		{
			top1++;
			arr[top1]=x;
			return true;
		}
		return false;
	}
	
	boolean push2(int x)
	{
		if(top1 < top2-1)
		{
			top2--;
			arr[top2]=x;
			return true;
		}
		return false;
	}
	
	Integer pop1()
	{
		if(top1>=
				0)
		{
			int x = arr[top1];
			top1--;
			return x;
		}
		return null;
	}
	
	Integer pop2()
	{
		if(top2<cap)
		{
			int x = arr[top2];
			top2++;
			return x;
		}
		
		return null;
	}
	
	int size1()
	{
		return (top1+1);
	}
	
	int size2()
	{
		return (cap-top2);
	}
	
	
	
}

public class ArrayOFTwoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoStack ts = new TwoStack(5);
		ts.push1(5);
		ts.push2(10);
		ts.push2(15);
		ts.push1(11);
		ts.push2(7);
		System.out.println("Size of stack1 is--"+ts.size1()+"size of Stack2 is----"+ts.size2());

		System.out.println("Popped element from stack is: "+ts.pop1());
		ts.push2(20);
		System.out.println("Size of stack1 is--"+ts.size1()+"size of Stack2 is----"+ts.size2());
		System.out.println("Popped element from stack2 is: "+ts.pop2());
		System.out.println("Size of stack1 is--"+ts.size1()+"size of Stack2 is----"+ts.size2());


	}

}
