import java.util.Scanner;

class node {
    int val;
    node next;
}

class SinglelinkedlistOperation {
    int inputElement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter element: ");
        int ele = sc.nextInt();
        return ele;
    }
    int inputIndex() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Index: ");
        int ele = sc.nextInt();
        return ele;
    }

    node addAtFirst(int ele, node head) {
        node newnode = new node();
        newnode.val = ele;
        newnode.next = head;
        head = newnode;
        System.out.println("Insert success... ");
        return head;
    }

    node addAtLast(int ele, node head) {
        node newnode = new node();
        newnode.val = ele;
        newnode.next = null;
        if (head == null) {
            head = newnode;
        } else {
            node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
        System.out.println("Insert success... ");
        return head;
    }
    node addEleAtIndex(int ele,int index,node head){
        node newnode = new node();
        newnode.val = ele;
        if(head==null && index>0){
            System.out.println("Your index is out of your list... ");
            return head;
        }
        else if (index == 0) {
            head=this.addAtFirst(ele, head);
        } else {
            node temp = head;
            int count=1;
            while (temp.next != null) {
                temp = temp.next;
                count+=1;
                if(count==index)
                break;
            }
            if(temp.next==null){
                head=this.addAtLast(ele, head);
            }else{
                newnode.next=temp.next;
                temp.next = newnode;
                System.out.println("Insert success... ");
            }
        }
        return head;
    }
    node removeEleFromFirst(node head){
        if(head==null){
            System.out.println("List is Empty...");
        }
        else{
            head=head.next;
        }
        System.out.println("Remove Success...");
        return head;
    }
    void removeEleFromLast(node head){
        if(head==null){
            System.out.println("List is Empty...");
        }else if(head.next==null){
            head=null;
        }
        else{
            node temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    node removeEleFromIndex(int index,node head){
        if(head==null){
            System.out.println("List is Empty...");
        }
        else if(index ==0){
            this.removeEleFromFirst(head);
        }else{
            node temp=head;
            int count =1;
            while(temp!=null){
                temp=temp.next;
                count+=1;
            }
        }
        return head;
    }
    void showAll(node head) {
        if (head == null) {
            System.out.println("List is Empty...");
        } else {
            node temp = head;
            System.out.print("[ ");
            while (temp != null) {
                System.out.print(temp.val + "  ");
                temp = temp.next;
            }
            System.out.println(" ]");
        }
    }

}

public class Singlelinkedlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglelinkedlistOperation sll = new SinglelinkedlistOperation();
        node head = null;
        int ele,index;
        char choice;
        do {
            System.out.println("**** Operation with Single Linked list ****");
            System.out.println("1. Add element at first");
            System.out.println("2. Add element at last");
            System.out.println("3. Add element at particulat position");
            System.out.println("4. Add element at first");
            System.out.println("5. Add element at last");
            System.out.println("6. Add element at particulat position");
            System.out.println("9. Show all elements in list");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    ele = sll.inputElement();
                    head = sll.addAtFirst(ele, head);
                    break;
                case 2:
                    ele = sll.inputElement();
                    head= sll.addAtLast(ele, head);
                    break;
                case 3:
                    ele= sll.inputElement();
                    index =sll.inputIndex();
                    head=sll.addEleAtIndex(ele,index,head);
                    break;
                case 4:
                    head = sll.removeEleFromFirst(head);
                    break;
                case 5:
                    sll.removeEleFromLast(head);
                    break;
                case 6:
                    index =sll.inputIndex();
                    head=sll.removeEleFromIndex(index,head);
                    break;
                case 9:
                    sll.showAll(head);
                    break;
                default:
                    System.out.println("Your choice is underprocess....");
            }
            System.out.print("Do you want to continue(y/n): ");
            choice = sc.next().charAt(0);
        } while (choice == 'y' | choice == 'Y');
        System.out.println("Thanks for visiting my program... ");
    }
}