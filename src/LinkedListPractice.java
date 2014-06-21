import java.util.Hashtable;
import java.util.Stack;


public class LinkedListPractice {

    public static void twoOneA(Node n){
    	//infers generic args
    	Hashtable table = new Hashtable();
    	Node prev = null;
    	while(n!=null){
    		if(table.containsKey(n.data)){
    			prev.next = n.next;
    		}else{
    			table.put(n.data, true);
    			prev = n;
    		}
    		n = n.next;
    	}
    	
    }
    
    //solution with runner
    public static void twoOneB(Node head){
    	if(head == null) return;
    	
    	Node current = head;
    	while(current != null){
    		Node runner = current;
    		while(runner.next != null){
    			if(runner.next.data == current.data){
    				runner.next = runner.next.next;
    			}else{
    				runner = runner.next;
    			}
    		}
        	current = current.next;
    	}
    }
	
    public static int twoTwoA(Node head, int k){
    	if(head == null) return 0;
    	int i = twoTwoA(head.next, k) + 1;
    	if(i == k) System.out.println(head.data);
    	return i;
    }
    
    public static Integer twoTwoB(Node head, int k){
    	Node p1 = head;
    	Node p2 = head; 
    	
    	for(int i=0; i<k; i++){
    		if(p2 == null) return null;
    		p2 = p2.next;
    	}
    	
    	if(p2 == null) return null;
    	
    	while(p2.next != null){
    		p2 = p2.next;
    		p1 = p1.next;
    	}
    	
    	return p1.data;
    	
    }
    
    public static boolean twoThree(Node n){
    	if(n == null || n.next == null) return false;
    	Node next = n.next;
    	n.data = next.data;
    	n.next = next.next;
    	return true;
    }
    
    //back insert
    
    //passed in node itself might come after items great than it in second half of list
    public static Node twoFourA(Node node, int val){
    	Node head1 = null;
    	Node tail1 = null;
    	Node head2 = null;
    	Node tail2 = null;
    	
    	while(node != null){
    		Node next = node.next;
    		node.next = null;
    		if(node.data < val){
    			if(head1 == null){
    				head1 = node;
    				tail1 = node;
    			}else{
    				tail1.next = node;
    				tail1 = node;
    			}
    		}else{
    			if(head2 == null){
    				head2 = node;
    				tail2 = node;
    			}else{
    				tail2.next = node;
    				tail2 = node;
    			}
    		}
    		node = next;
    	}
    	
    	if(tail1 == null) return head2;
    	
    	tail1.next = head2;
    
    	return head1;    
    }
    
    //front insert
    public static Node twoFourB(Node node, int val){
    	
    	Node head1 = null;
    	Node head2 = null;
    	
    	while(node != null){
    		Node next = node.next;
    		node.next = null;
    		if(node.data < val){
    			node.next = head1;
    			head1 = node;
    		}else{
    			node.next = head2;
    			head2 = node;
    		}
    		node = next;
    	}
    	
    	if (head1 == null) return head2;

    	Node trueHead = head1;
    	while(head1.next!=null) head1 = head1.next;
    	head1.next = head2;
    
    	return trueHead;
    	
    }
 
    public static int listToNum(Node head){
    	int ctr = 0;	
    	int total = 0;
    	
    	while(head != null){
    		total += Math.pow(10, ctr) * head.data;
    		head = head.next;
    		ctr++;
    	}	

    	return total;
    }
    
    public static Node twoFive(Node head1, Node head2){
    	
    	if(head1 == null || head2 == null) return null;
    	
    	int num1 = listToNum(head1);
    	int num2 = listToNum(head2);
    	int result = num1 + num2;
    	
    	Node resultHead = null;
    	Node resultTail = null;
    	
    	while(result > 0){
    		int digit = result%10;
    		result = result/10;
    		
    		if(resultHead == null){
    			resultHead = new Node(digit);
    			resultTail = resultHead;
    		}
    		else{
    			Node newNode = new Node(digit);
    			resultTail.next = newNode;
    			resultTail = newNode;
    		}
    	}
    	
    	return resultHead;
    }
    
    /* *** see book*/
    
    public static int twoSix(Node head){
    	return 0;
    	
    }
    
    //reverse and compare
    public static boolean twoSevenRC(Node head){
    	Node reverseHead = null;
    	Node trueHead = head;
    	
    	while(head!=null){
    		Node next = head.next;
    		if(reverseHead == null) reverseHead = new Node(head.data);
    		else{
    			Node newNode = new Node(head.data);
        		newNode.next = reverseHead;
        		reverseHead = newNode;
    		}
    		head = next;    			
    	}
    	
    	head = trueHead;
    	
    	while(head!=null){
    		if(head.data != reverseHead.data) return false;
    		head = head.next;
    		reverseHead = reverseHead.next;
    	}
    	
    	return true;
    }
    
    //iterative, using stack (requires complete reversal)
    public static boolean twoSevenI(Node head){
    	Stack<Node> stack = new Stack<Node>();
    	Node trueHead = head;
    	while(head!=null){
    		stack.push(head);
    		head = head.next;
    	}
    	
    	head = trueHead;
    	while(head!=null){
    		if(head.data != stack.pop().data) return false;
    		head = head.next;
    	}
    	return true;
    }
    
    //runner method. does not require complete reversal
    public static boolean twoSevenIB(Node head){
    	Node fast = head;
    	Node slow = head;
    	Stack<Node> stack = new Stack<Node>();
    	
    	while(fast!= null && fast.next!=null){
    		stack.push(slow);
    		fast = fast.next.next;
    		slow = slow.next;
    	}
    	
    	if(fast!=null) slow = slow.next;
    	
    	while(slow!=null){
    		if(stack.pop().data != slow.data) return false;
    		slow = slow.next;
    	}
    	
    	return true;	
    }
    
    
}
